<?php
    $Req_ID = $_POST['Req_ID'];
    $Req_Name = $_POST['Req_Name'];
    $Req_Begin_Date = $_POST['Req_Begin_Date'];
    $Req_End_Date = $_POST['Req_End_Date'];
    $Req_Update_Date = $_POST['Req_Update_Date'];
    $Req_Status = $_POST['Req_Status'];
    $Req_Patient = $_POST['Req_Patient'];
    // далее проводим обработку полученных данных
    echo '{ "success": true, "message":"Книга: ' . $Req_ID . '. ' . $Req_Name . ' добавлена"}';
?>