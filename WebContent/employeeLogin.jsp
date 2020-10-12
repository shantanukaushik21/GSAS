<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css\common.css" rel="stylesheet">
<link href="css\form.css" rel="stylesheet">
</head>
<body>
	<script src="JS\navigation.js">
		
	</script>
	<div class="header">
		<h1>Employee Login</h1>
	</div>
	<div class="sidenav">
		<div class="image">
			<img src="logo\logo.jpeg">
		</div>

		<div class="heading">
			<h2>Menu</h2>
		</div>
		<div class="content" id="first">
			<a href="employeeLogin.jsp">Employee Login</a>
		</div>
		<div class="content">
			<a href="citizenLogin.jsp">Citizen Login</a>
		</div>
		<div class="content">
			<a href="registerCitizen.jsp">Citizen Register</a>
		</div>

	</div>

	<div class="main">
		<c:if test="${message != null}">
			<p>
				<c:out value="${message}" />
			<p>
		</c:if>
		<div class="main1">
			<form method="POST" action="EmployeeLoginServlet">
				<div class="col1">
					<label class="required-field">Enter your username</label> <input
						type="text" name="username" id="username"
						placeholder="Enter your username" required><br>
				</div>
				<div class="col2">
					<label class="required-field">Enter your password</label> <input
						type="password" name="password" id="password"
						placeholder="Enter your password." required><br>

				</div>
				<div class="col3">
					<button type="submit" id="submit" class="submit">Submit</button>
				</div>

			</form>

		</div>
	</div>



	<div class="footer">
		<p>Coordinated by: Team Agastya</p>
	</div>

</body>
</html>