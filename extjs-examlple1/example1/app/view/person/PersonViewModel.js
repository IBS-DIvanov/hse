Ext.define('example1.view.person.PersonViewModel', {
    extend: 'Ext.app.ViewModel',

    alias: 'viewmodel.person-viewmodel',

    requires: [
        'example1.store.PersonListStore'
    ],

    data: {},
    stores: {
        personListStore: {
            type: 'person-list-store'
        }
    }
});
