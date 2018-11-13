Ext.define('example1.view.person.PersonListGrid', {
    extend: 'Ext.grid.Panel',
    alias: 'widget.person-list-grid',
    requires: [
        'Ext.button.Button',
        'Ext.grid.column.Date'
    ],
    title: 'Список людей',
    tbar: [
        {
            xtype: 'button',
            text: 'Обновить',
            handler: 'onRefreshPeopleList'
        }
    ],
    columns: {
        defaults: {
            align: 'left'
        },
        items: [
            {
                text: 'Фамилия',
                dataIndex: 'LASTNAME',
                flex: 1
            },
            {
                text: 'Имя',
                dataIndex: 'FIRSTNAME'
            },
            {
                text: 'Отчество',
                dataIndex: 'MIDDLENAME',
                flex: 1
            },
            {
                text: 'Пол',
                dataIndex: 'SEXDESC',
                flex: 1
            },
            {
                text: 'ИНН',
                dataIndex: 'INN',
                flex: 1
            },
            {
                text: 'Дата рождения',
                xtype: 'datecolumn',
                format: 'd.m.Y',
                width: 120,
                dataIndex: 'BIRTHDAY'
            },
            {
                text: 'Адрес',
                dataIndex: 'ADDR_REG',
                flex: 2
            }
        ]
    }
});
