Ext.define('example1.view.person.PersonController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.person-controller',

    onRefreshPeopleList: function (btn) {
        Ext.getBody().mask('Загрузка');
        this.getView().getViewModel().getStore('personListStore').reload({
            callback: function (records, operation, success) {
                Ext.getBody().unmask();
            }
        });
    }
});