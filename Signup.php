<?php
require "conn5.php";
$eng_firstname=$_POST["Firstname"];
$eng_lastname=$_POST["Lastname"];
$eng_email=$_POST["Email"];
$eng_phoneno=$_POST["Phoneno"];
$eng_username=$_POST["username"];
$eng_password=$_POST["Password"];
$mysql_qry = "insert into fieldeng(eng_firstname,eng_lastname,eng_email,eng_phoneno,eng_username,eng_password) values('$eng_firstname','$eng_lastname','$eng_email','$eng_phoneno','$eng_username','$eng_password')";
if($conn->query($mysql_qry) === True){
echo "insert successful";
}







else{
echo "Error: ".$mysql_qry."<br>".$conn->error;
}

$conn->close();
?>