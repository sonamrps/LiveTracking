<?php
require "conn.php";
$eng_username = $_POST["username"];
$eng_password = $_POST["Passwod"];
$mysql_qry = "Select * from fieldeng where eng_username like '$eng_username' and eng_password like '$eng_password';
$result = mysqli_query($conn,$mysql_qry);
if( mysqli_num_rows($result)>0){
	echo "Login success";
}
else{
	echo "Login not success";
}
?>