Ext.define('example1.view.person.PersonPanel', {
    extend: 'Ext.panel.Panel',

    alias: 'widget.person-panel',

    requires: [
        'example1.view.person.PersonController',
        'example1.view.person.PersonListGrid',
        'example1.view.person.PersonViewModel'
    ],
    controller: 'person-controller',
    viewModel: 'person-viewmodel',
    items: [
        {
            xtype: 'person-list-grid',
            bind: {
                store: '{personListStore}'
            }
        }
    ]
});