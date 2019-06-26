<?php
    $id = $_POST['id'];
    $name = $_POST['name'];
    $author = $_POST['author'];
    $year = $_POST['year'];
    // далее проводим обработку полученных данных
    echo '{ "success": true, "message":"Книга: ' . $id . '. ' . $name . ' (' . $author . ') обновлена"}';
?>