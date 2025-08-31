<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/bookticket" method="post">
		<h2>Enter the passenger details</h2>
		<table>
			<tr>
				<td>fname:</td>
				<td><input type="text" name="fname"></td>
			</tr>
			    <td>lname:</td>
			    <td><input type="text" name="lname"></td>
			<tr>
				<td>doj:</td>
				<td><input type="date" name="doj"></td>
			</tr>
			    <td>from:</td>
			    <td><input type="text" name="from"></td>
			<tr>
				<td>To:</td>
				<td><input type="text" name="to"></td>
			</tr>
			    <td>Mob:</td>
			    <td><input type="text" name="mob"></td>
			<tr>
				<td>TrainNo:</td>
				<td><input type="text" name="trainNo"></td>
			</tr>
		</table>
		<br>
		<tr>
			<input type="submit" value="Book ticket" />
		</tr>
	</form>
</body>
</html>