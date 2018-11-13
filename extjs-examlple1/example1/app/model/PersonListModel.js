Ext.define('example1.model.PersonListModel', {
    extend: 'Ext.data.Model',

    propertyId: 'GUID',

    fields: [
        'GUID',
        'FIRSTNAME',
        'LASTNAME',
        'MIDDLENAME',
        'SEX',
        {
            name: 'SEXDESC',
            persist: false,
            depends: ['SEX'],
            calculate: function (data) {
                if (Ext.isEmpty(data) || Ext.isEmpty(data.SEX))
                    return '';
                return data.SEX == 1 ? 'М' : 'Ж';
            }
        },
        'INN',
        {
            name: 'BIRTHDAY', type: 'date',
            dateFormat: "timestamp"
        },
        'ADDR_REG'
    ]
});
