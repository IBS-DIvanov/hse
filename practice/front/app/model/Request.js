/*
Ext.define('Front.model.Request', {
    extend: 'Ext.data.Model',
    fields: ['Req_ID','Req_Name', 'Req_Begin_Date', 'Req_End_Date', 'Req_Update_Date', 'Req_Status', 'Req_Patient'],
    proxy: {
        type: 'rest',
        api: {
            create: 'request',
            read: 'request',
            destroy: 'request',
            update: 'request'
        },
        reader: {
            type: 'json',
            root: 'request',
            successProperty: 'success'
        },
        writer: {
            type: 'json',
            writeAllFields: true
        }

    }
});*/

Ext.define('Front.model.Request', {
    extend: 'Ext.data.Model',
    fields: [
        {name: 'Req_ID',  type: 'int'},
        {name: 'Req_Name',  type: 'string'},
        {name: 'Req_Begin_Date', type: 'date', format: 'd/m/Y'},
        {name: 'Req_End_Date', type: 'date', format: 'd/m/Y'},
        {name: 'Req_Update_Date', type: 'date', format: 'd/m/Y'},
        {name: 'Req_Status', type: 'string'},
        {name: 'Req_Patient',  type: 'string'}
    ]
});