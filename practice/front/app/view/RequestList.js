/*
Ext.define('Front.view.RequestList' ,{
    extend: 'Ext.grid.Panel',
    alias: 'widget.requestlist',

    title: 'Список заявок на лечение',
    store: 'RequestStore',

    initComponent: function() {
        this.columns =
            [{
                header: 'Название',
                dataIndex: 'Req_Name',  flex: 1
            },{
                header: 'Дата подачи заявки',
                xtype:'datecolumn',
                dataIndex: 'Req_Begin_Date',
                flex: 1
            },{
                header: 'Дата окончания',
                xtype:'datecolumn',
                dataIndex: 'Req_End_Date',
                flex: 1
            },{
                header: 'Дата обновления',
                dataIndex: 'Req_Update_Date',
                flex: 1
            },{
                header: 'Статус',
                dataIndex: 'Req_Status',
                flex: 1
            },{
                header: 'Пациент',
                dataIndex: 'Req_Patient',
                flex: 1
            }],

/!*        this.plugins = [
             Ext.create('Ext.grid.plugin.RowEditing', {
                    clicksToEdit: 2,
                saveBtnText: 'Сохранить',
                cancelBtnText: 'Отменить'}) ],*!/

        this.selType = 'rowmodel',
        this.dockedItems = [
            {xtype: 'toolbar',
                items:
                 [
                    {
                        text: 'Добавить',
                        action: 'add',
                    },
                    '-',
                    {
                        action: 'delete',
                        text: 'Удалить',
                        disabled: true
                    }
                ]
            }
        ]
        this.callParent(arguments)
    }
})*/

Ext.define('Front.view.RequestList', {
    extend: 'Ext.grid.Panel',

    alias: 'widget.requestlist',

    title: 'Список заявок на лечение',
    store: 'RequestStore',
    dockedItems: [{
        xtype: 'pagingtoolbar',
        store:'RequestStore',
        dock: 'bottom',
        displayInfo: true,
        beforePageText: 'Страница',
        afterPageText: 'из {0}',
        displayMsg: 'Заявок {0} - {1} из {2}'
    }],

    initComponent: function () {

        this.tbar = [{
            text    : 'Добавить заявку',
            action  : 'add',
        }];

        this.columns = [
            { header: 'Название', dataIndex: 'Req_Name',  flex: 1 },
            { header: 'Дата подачи заявки', dataIndex: 'Req_Begin_Date', xtype:'datecolumn', flex: 1, format: 'd/m/Y'},
            { header: 'Дата окончания', dataIndex: 'Req_End_Date',  xtype:'datecolumn', flex: 1, format: 'd/m/Y'},
            { header: 'Дата обновления', dataIndex: 'Req_Update_Date', flex: 1, xtype:'datecolumn', format: 'd/m/Y' },
            { header: 'Статус', dataIndex: 'Req_Status', flex: 1 },
            { header: 'Пациент', dataIndex: 'Req_Patient', flex: 1 },
            { header: 'Action', width: 50,
                    renderer: function (v, m, r) {
                    var id = Ext.id();
                    var max = 15;
                    Ext.defer(function () {
                        Ext.widget('image', {
                            renderTo: id,
                            name: 'delete',
                            src : 'app/view/images/delete_sign.png',
                            listeners : {
                                afterrender: function (me) {
                                    me.getEl().on('click', function() {
                                        var grid = Ext.ComponentQuery.query('requestlist')[0];
                                        if (grid) {
                                            var sm = grid.getSelectionModel();
                                            var rs = sm.getSelection();
                                            if (!rs.length) {
                                                Ext.Msg.alert('Info', 'No Book Selected');
                                                return;
                                            }
                                            Ext.Msg.confirm('Remove Book', 'Are you sure you want to delete?',
                                                function (button) {
                                                    if (button == 'yes') {
                                                        grid.store.remove(rs[0]);
                                                    }
                                                });
                                        }
                                    });
                                }
                            }
                        });
                    }, 50);
                    return Ext.String.format('<div id="{0}"></div>', id);
                }
            }
        ];
        this.callParent(arguments);
    }
});