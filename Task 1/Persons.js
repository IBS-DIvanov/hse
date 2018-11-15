/*$().ready(
    function () {
        $.getJSON("../resources/json/temp_short.json",
            function (data) {
                $.each(data,
                    function (i, e) {
                        var tr = $('<tr></tr>');
                        tr.append("<td>" + e.original.fid + "</td>");
                        if (e.original.gender == "woman")
                            tr.append("<td class='td-img'><img src='../resources/images/avatar/woman.svg' height='40'></td>")
                        else tr.append("<td class='td-img'><img src='../resources/images/avatar/man.svg' height='40'></td>");
                        tr.append("<td>" + e.original.number + "</td>");
                        tr.append("<td>" + e.original.name + "</td>");
                        tr.append("<td>" + agePerson(new Date(e.original.birthday)) + "</td>");
                        if (e.original.gender == "woman")
                            tr.append("<td class='td-img'><img src='../resources/images/icons/person-woman.svg' height='25'></td>")
                        else tr.append("<td class='td-img'><img src='../resources/images/icons/person-man.svg' height='25'></td>");
                        tr.append("<td class='td-img'>" + (e.original.married ? "<img src='../resources/images/icons/person-married.svg' height='25'" : "") + "</td>");
                        tr.append("<td class='td-img'>" + (e.original.reservist ? "<img src='../resources/images/icons/person-army.svg' height='25'" : "") + "</td>");
                        tr.append("<td>" + (e.original.employment ? "Работает" : "Не работает") + "</td>");
                        tr.append("<td class='td-img'>" + (e.original.disability ? "<img src='../resources/images/icons/person-disability.svg' height='25'" : "") + "</td>");
                        tr.append("<td class='td-img'>" + (e.original.business ? "<img src='../resources/images/icons/person-business.svg' height='25'" : "") + "</td>");
                        tr.append("<td></td>");
                        tr.append("<td class='td-img'>" + (e.original.hasLand ? "<img src='../resources/images/icons/person-hasLand.svg' height='25'" : "") + "</td>");
                        tr.append("<td class='td-img'>" + (e.original.hasProperty ? "<img src='../resources/images/icons/person-hasProperty.svg' height='25'" : "") + "</td>");
                        tr.append("<td class='td-img'>" + (e.original.hasProperty ? "<img src='../resources/images/icons/person-car.svg' height='25'" : "") + "</td>");
                        tr.append("<td>" + e.original.income + "</td>");
                        tr.append("<td class='td-img'></td>");
                        $('#persons tbody').append(tr);
                    }
                );
            }
        );
    }
);*/




function agePerson(date) {
    var _date = new Date(date).toISOString();
    var nowDate = new Date();

    nowDate.setMinutes(nowDate.getMinutes() - nowDate.getTimezoneOffset());
    nowDate = nowDate.toISOString().substr(0, 19).replace('T', ' ');

    var age = nowDate.substr(0, 4) - _date.substr(0, 4);

    if (nowDate.substr(5) < _date.substr(5)) --age;

    return age;
}



