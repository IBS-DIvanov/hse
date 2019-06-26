/*Ext.define('Front.store.RequestStore', {
    extend: 'Ext.data.Store',
    requires : ['Front.model.Request'],
    model: 'Front.model.Request',
    autoLoad: true,
    autoSync: true,
    storeId: 'RequestStore',
    proxy: {
        type: 'ajax',
        url: 'app/data/request.json',
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

Ext.define('Front.store.RequestStore', {
    extend  : 'Ext.data.Store',
    model   : 'Front.model.Request',
    pageSize: 5,
    fields: ['Req_ID','Req_Name', 'Req_Begin_Date', 'Req_End_Date', 'Req_Update_Date', 'Req_Status', 'Req_Patient'],
    data    : [{
        Req_ID: 1,
        Req_Name: "Боль в животе",
        Req_Begin_Date: new Date(2018, 7, 6),
        Req_End_Date: new Date(2018, 7, 21),
        Req_Update_Date: new Date(2018, 7, 21),
        Req_Status: "Завершен",
        Req_Patient: "Иванов И.И."
    },{
        Req_ID: 2,
        Req_Name: "Перелом ноги",
        Req_Begin_Date: new Date(2018, 9, 13),
        Req_End_Date: new Date(2019, 0, 17),
        Req_Update_Date: new Date(2019, 0, 17),
        Req_Status: "Завершен",
        Req_Patient: "Петров И.И."
    },{
        Req_ID: 3,
        Req_Name: "ОРВИ",
        Req_Begin_Date: new Date(2019, 0, 17),
        Req_End_Date: new Date(2019, 0, 17),
        Req_Update_Date: new Date(2019, 0, 17),
        Req_Status: "В процессе",
        Req_Patient: "Сидоров И.И."}
    ]
});