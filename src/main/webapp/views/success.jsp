<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
	<h2>Ticket Information</h2>
	<table bgcolor="cyan">
		<tr>
			<td>TicketId:</td>
			<td>${tickets.ticketId}</td>
		</tr>
		<tr>
			<td>Fname:</td>
			<td>${tickets.fname}</td>
		</tr>
		<tr>
			<td>Lname:</td>
			<td>${tickets.lname}</td>
		</tr>
		<tr>
			<td>From:</td>
			<td>${tickets.from}</td>
		</tr>
		<tr>
			<td>To:</td>
			<td>${tickets.to}</td>
		</tr>
		<tr>
			<td>Doj:</td>
			<td>${tickets.doj}</td>
		</tr>
		<tr>
			<td>Ticket Price:</td>
			<td>${tickets.ticketPrice}</td>
		</tr>
		<tr>
			<td>Train No:</td>
			<td>${tickets.trainNo}</td>
		</tr>
		<tr>
			<td>Status:</td>
			<td>${tickets.status}</td>
		</tr>
	</table>
	<a href="/">Go To Home</a>
</body>
</html>