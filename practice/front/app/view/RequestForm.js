var states = Ext.create('Ext.data.Store', {
    fields: ['S_ID', 'S_Name'],
    data: [{
        "S_ID": 0,
        "S_Name": "Принята"
    }, {
        "S_ID": 1,
        "S_Name": "Идет лечение"
    }, {
        "S_ID": 2,
        "S_Name": "Лечение окончено"
    }, {
        "S_ID": 3,
        "S_Name": "Отменено"
    }, {
        "S_ID": 4,
        "S_Name": "Отказано"
    }]
});

Ext.define('Front.view.RequestForm', {
    extend  : 'Ext.window.Window',
    alias   : 'widget.requestform',
    title   : 'Добавление заявки',
    width   : 500,
    layout  : 'fit',
    resizable: false,
    closeAction: 'hide',
    modal   : true,
    config  : {
        recordIndex : 0,
        action : ''
    },
    items   : [{
        xtype : 'form',
        layout: 'anchor',
        bodyStyle: {
            background: 'none',
            padding: '10px',
            border: '0'
        },
        defaults: {
            xtype : 'textfield',
            anchor: '100%'
        },
        items : [
            { xtype: 'textfield', name : 'Req_Name', fieldLabel: 'Название' },
            { xtype: 'datefield', name : 'Req_Begin_Date', fieldLabel: 'Дата подачи заявки', format: 'd/m/Y', submitFormat: 'c'},
            { xtype: 'datefield', name : 'Req_End_Date', fieldLabel: 'Дата завершения заявки', format: 'd/m/Y', submitFormat: 'c'},
            { xtype: 'datefield', name : 'Req_Update_Date', fieldLabel: 'Дата обновления заявки', format: 'd/m/Y', submitFormat: 'c'},
            {
                xtype: 'combobox',
                fieldLabel: 'Статус',
                name : 'Req_Status',
                store: states,
                //store: {type: 'states'},
                queryMode: 'local',
                displayField: 'S_Name',
                valueField: 'S_Name',
                id: 'genericFormCombo',
                forceSelection: false,
                multiSelect: false,
                typeahead: true
            },
            { xtype: 'textfield', name : 'Req_Patient', fieldLabel: 'Пациент' }]
    }],

    buttons: [{
        text: 'OK',
        action: 'add'
    },{
        text    : 'Reset',
        handler : function () {
            this.up('window').down('form').getForm().reset();
        }
    },{
        text   : 'Cancel',
        handler: function () {
            this.up('window').close();
        }
    }]
});
