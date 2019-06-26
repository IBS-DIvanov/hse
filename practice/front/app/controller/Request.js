/*
Ext.define('Front.controller.Request', {
    extend: 'Ext.app.Controller',

    /!*views: ['RequestList', 'Request', 'EditRequest'],
    stores: ['RequestStore'],
    models: ['Request'],
    init: function() {
        this.control({
            /!*!/!*'viewport > requestlist': {
                itemdblclick: this.editReq()
            },*!/
            'requestwindow button[action=add_req]': {
                click: this.addReq()
            },
            'requestwindow button[action=save]': {
                click: this.editReq
            },
            'requestwindow button[action=delete_req]': {
                click: this.deleteBook
            },
            'requestwindow button[action=clear]': {
                click: this.clearForm
            }*!/
        });
    },

    editReq: function(grid, record) {
        // Создается экземпляр представления для редактирования пользователя
        var view = Ext.widget('requestedit');
        // В экземпляр представления подгружаются данные пользователя
        view.down('form').loadRecord(record);
    },

    addReq: function(grid, record) {
        // Создается экземпляр представления для редактирования пользователя
        var view = Ext.widget('addreq');
        // В экземпляр представления подгружаются данные пользователя
        view.down('form').loadRecord(record);
    },

    // обновление
    updateBook: function(button) {
        var win    = button.up('window'),
            form   = win.down('form'),
            values = form.getValues(),
            id = form.getRecord().get('id');
        values.id=id;
        Ext.Ajax.request({
            url: 'app/data/update.php',
            params: values,
            success: function(response){
                var data=Ext.decode(response.responseText);
                if(data.success){
                    var store = Ext.widget('requestlist').getStore();
                    store.load();
                    Ext.Msg.alert('Обновление',data.message);
                }
                else{
                    Ext.Msg.alert('Обновление','Не удалось обновить книгу в библиотеке');
                }
            }
        });
    },
    // создание
    createBook: function(button) {
        var win    = button.up('window'),
            form   = win.down('form'),
            values = form.getValues();
        Ext.Ajax.request({
            url: 'app/data/create.php',
            params: values,
            success: function(response, options){
                var data=Ext.decode(response.responseText);
                if(data.success){
                    Ext.Msg.alert('Создание',data.message);
                    var store = Ext.widget('requestlist').getStore();
                    store.load();
                }
                else{
                    Ext.Msg.alert('Создание','Не удалось добавить книгу в библиотеку');
                }
            }
        });
    },
    // удаление
    deleteBook: function(button) {
        var win    = button.up('window'),
            form   = win.down('form'),
            id = form.getRecord().get('id');
        Ext.Ajax.request({
            url: 'app/data/delete.php',
            params: {id:id},
            success: function(response){
                var data=Ext.decode(response.responseText);
                if(data.success){
                    Ext.Msg.alert('Удаление',data.message);
                    var store = Ext.widget('requestlist').getStore();
                    var record = store.getById(id);
                    store.remove(record);
                    form.getForm.reset();
                }
                else{
                    Ext.Msg.alert('Удаление','Не удалось удалить книгу из библиотеки');
                }
            }
        });
    },
    clearForm: function(grid, record) {
        var view = Ext.widget('requestwindow');
        view.down('form').getForm().reset();
    },
    editBook: function(grid, record) {
        var view = Ext.widget('requestwindow');
        view.down('form').loadRecord(record);
    }*!/

    init: function () {
        this.control({
            'requestlist  button[action=add]': {
                click: this.onAddCar
            },
            'requestlist  button[action=delete]': {
                click: this.onDelCar
            },
            'requestlist': {
                cellclick: this.onLineGrid
            },
            'addreq  button[action=save]': {
                click: this.onSaveCar
            },
        });
    },

    onSaveCar: function (button) {
        var me = this;
        var carModel = Ext.create('Front.model.CarCatalogModel');
        carModel.set(this.getAddCarFormView().down('form').getValues());
        carModel.save({
            success: function (operation, response) {
                var objAjax = operation.data;
                Ext.getStore('CarCatalogStore').add(objAjax);
                me.getAddCarFormView().close();
            },
            failure: function (dummy, result) {
                Ext.MessageBox.show({
                    title: 'Дубликат!',
                    msg: 'Такая модель и цена уже существуют',
                    buttons: Ext.Msg.OK,
                    icon: Ext.Msg.ERROR
                });
            }

        });
    },

    onAddCar: function () {
        Ext.widget('addCarFormView');
    },

    onDelCar: function () {
        var sm = this.getCarGridView().getSelectionModel();
        var rs = sm.getSelection();
        this.getCarGridView().store.remove(rs[0]);
        this.getCarGridView().store.commitChanges();
        this.getCarGridDelete().disable();
    },

    onChangeText: function () {
        Ext.getStore('CarCatalogStore').load({
            params: {
                search: this.getCarCatalogView().down('searchCarView').getValues()
            }
        });
    },

    onLineGrid: function () {
        this.getCarGridDelete().enable();
    },

    onValidation: function () {
        if (this.getAddCarFormName().validate() && this.getAddCarFormPrice().validate()) {
            this.getAddCarFormSave().enable();
        } else {
            this.getAddCarFormSave().disable();
        }
    }

});*/
var act = 'non';

Ext.define('Front.controller.Request', {
    extend  : 'Ext.app.Controller',
    stores  : ['RequestStore'],
    views   : ['RequestList', 'RequestForm'],
    refs    : [{
        ref   : 'formWindow',
        xtype : 'requestform',
        selector: 'requestform',
        autoCreate: true
    }],
    init: function () {
          this.control({
                'requestlist > toolbar > button[action=add]': {
                click: this.showAddForm
            },
            'requestlist': {
                itemdblclick: this.onRowdblclick
            },
            'requestform button[action=add]': {
                click: this.doAddReq
            }
        });
    },
    onRowdblclick: function(me, record, item, index) {
        var win = this.getFormWindow();
        act = 'edit';
        win.setTitle('Изменение заявки');
        win.setRecordIndex(index);
        win.down('form').getForm().setValues(record.getData());
        win.show();
    },
    showAddForm: function () {
        var win = this.getFormWindow();
        act = 'add';
        win.setTitle('Новая заявка');
        win.down('form').getForm().reset();
        win.show();
        k = 1;
    },
    doAddReq: function () {
        var win = this.getFormWindow();
        var store = this.getRequestStoreStore();
        var values = win.down('form').getValues();

        var req = Ext.create('Front.model.Request', values);

        if (act == 'add'){
            store.add(req);
        }
        else {
            store.removeAt(win.getRecordIndex());
            store.insert(win.getRecordIndex(), req);
        }
        win.close();
    }
});

