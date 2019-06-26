/*
Ext.application({
    requires: ['Ext.container.Viewport'],
    name: 'Front',
    appFolder: 'app',
    views: [
        'AddReq',
        'Request',
        'RequestList',
        'EditRequest'
    ],
    controllers: ['Request'],

    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                xtype: 'requestlist'
            }
        });
    }
});*/

Ext.onReady(function() {
    Ext.application({
            requires: ['Ext.container.Viewport'],
            name: 'Front',
            appFolder: 'app',
            controllers: ['Request'],
            view: ['RequestList', 'RequestForm'],

            launch: function () {
                Ext.create('Ext.container.Viewport', {
                    layout: 'fit',
                    items: {
                        xtype: 'requestlist'
                    }
                });
            }
        }
    );
})