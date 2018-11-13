Ext.define('example1.store.PersonListStore', {
    extend: 'Ext.data.Store',

    alias: 'store.person-list-store',

    requires: [
        'Ext.data.proxy.JsonP',
        'example1.model.PersonListModel'
    ],

    model: 'example1.model.PersonListModel',

    autoLoad: true,

    proxy: {
        type: 'ajax',
        useDefaultXhrHeader: false,
        //url: 'https://raw.githubusercontent.com/IBS-DIvanov/hse/develop/resources/json/temp_short.json',
        url: 'https://cdn.jsdelivr.net/gh/IBS-DIvanov/hse@230ddfa4693a0cfa9dd32770b760c2a5c12e6e44/resources/json/temp_short.json',
        reader: {
            type: 'json',
            transform: {
                fn: function (data) {
                    let result = [];
                    Ext.Array.each(data, function (item, index, selfArray) {
                        result.push(item.person);
                    });
                    return result;
                },
                scope: this
            }
        }
    }
});