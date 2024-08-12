<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body style="background-color:skyblue;">
<h1 style="text-align:center"> Welcome , ${name } </h1>
<h3> Registration details saved successfully </h3>
<hr>
<h2 style="text-align:center"> Registration details- </h2>
<table border=1>
<tr>
<th>Name</th>
<th>Email-id</th>
<th>Roll No.</th>
<th>Branch</th>
<th>Department</th>
</tr>
<tr>
<td>${name }</td>
<td>${email }</td>
<td>${rollno }</td>
<td>${course }</td>
<td>${department }</td>
</tr>
</table>



</body>
</html>