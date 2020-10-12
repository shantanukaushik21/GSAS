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
        <style>
            .main1{
                width: 600px;
                height: 100%;
                padding: 20px;
                text-align: center;
                align-self: center;
                opacity: 0.8;
            }
        </style>
        
    </head>
    <body>
    <script src="JS\navigation.js"></script>
        <div class="header">
           <h1>Citizen Registration</h1>
        </div>
        <div class="sidenav">
        <div class="image">
                <img src="logo\logo.jpeg">
            </div>
            
            <div class="heading">
                <h2> Menu </h2>
            </div>
            <div class="content">
             <a href="index.jsp">Logout</a>
            </div>
            
     </div>
     
        <div class="main">
		<div class="main1">
			
			<form method="POST" action="UpdateCitizenDetailsServlet">
			<input type="hidden" value="${AddressVO.addressId }" name="addressId" id="addressId">
			<input type="hidden" value="${CitizenDetailsVO.citizenDetailsId }" name="citizenDetailsId" id="citizenDetailsId">
				<div class="col1" id="name">
					<label class="required-field"> Enter your Name</label><input type="text" name="firstName"
						id="firstName" placeholder="First Name" value="${CitizenDetailsVO.firstName }"required><input
						type="text" name="middleName" id="middleName"
						placeholder="Middle Name" value="${CitizenDetailsVO.middleName }"><input type="text"
						name="lastName" id="lastName" placeholder="Last Name" value="${CitizenDetailsVO.lastName }" required>
					
				</div>
				<div class="col1" id="citizenUsername">
					<label class="required-field"> Enter your username</label><input type="text"
						name="username" id="username"
						placeholder="Enter your username." value="${LoginVO.userName }"required><br>
				</div>
				<div class="col1" id="citizenPassword">
					<label class="required-field"> Enter your password</label><input type="password"
						name="password" id="password"
						placeholder="Enter your password." value="${LoginVO.password }" required><br>
			
				</div>
				<div class="col1" id="dob">
					<label class="required-field"> Enter your Date of Birth</label><input type="text"
						name="dateOfBirth" id="dateOfBirth"
						placeholder="Enter your Date of Birth.(YYYY-MMM-DD)" value="${CitizenDetailsVO.dateOfBirth }"required><br>
				</div>
				<div class="col1">
					<label class="required-field">Select gender</label>

				</div>
				<div class="col1" id="col2">
					<!--<button type="submit" id="submit" value="submit" onclick="add(col2)">Add eligibility criteria.</button>-->

					<input type="radio" id="male" name="gender" value="male"> <label
						for="male"> Male</label><br> <input type="radio" id="female"
						name="gender" value="female"> <label for="female">
						Female</label><br> <input type="radio" id="other" name="gender"
						value="others"> <label for="other"> Other</label><br>


				</div>
				<div class="col1" id="phoneNumber">
					<label class="required-field"> Enter your Phone Number</label><input type="text"
						name="phone" id="phone" placeholder="Enter your Phone Number." value="${CitizenDetailsVO.phone }"
						required pattern="[0-9]{10}"><br>
					
				</div>
				<div class="col1" id="emailId">
					<label class="required-field"> Enter your Email ID</label><input type="email" name="email"
						placeholder="Enter your Email ID." value="${CitizenDetailsVO.email }" required><br>

				</div>
				<div class="col1" id="address">
					<label class="required-field"> Enter your Address</label><input type="text" name="street"
						id="street" placeholder="Enter your street" value="${AddressVO.street }" required> <input
						type="text" name="city" id="city" placeholder="Enter your city" value="${AddressVO.state }"
						required> <input type="text" name="state" id="state"
						placeholder="Enter your state" value="${AddressVO.city }" required> <input
						type="text" name="pincode" id="pincode"
						placeholder="Enter your pincode" value="${AddressVO.pincode }"required pattern="[0-9]{6}">

			
				</div>
				<div class="col1" >
					<label for="profession" class="required-field">Choose a profession:</label> <select
							name="profession" id="professon" >
							<c:forEach items="${professionList}" var="profession">
								<option value="${profession.professionId}">${profession.professionName}</option>
							</c:forEach>
						</select>
				</div>
				<div class="col1">
						<label for="incomeGroup" class="required-field">Choose a income group:</label> <select
							name="incomeGroup" >
							<c:forEach items="${incomeGroupList}" var="incomeGroup">
								<option value="${incomeGroup.incomeGroupId}">${incomeGroup.incomeGroupName}</option>
							</c:forEach>
						</select>
					</div>
				<div class="col1">
					<label class="required-field"> Enter your Aadhar Number</label><input type="text"
						name="adharNumber" id="adharNumber"
						placeholder="Enter your Aadhar Number." value="${CitizenDetailsVO.adharNumber }" required><br>
			
				</div>
				<div class="col1">
					<label class="required-field"> Enter your PAN Number</label><input type="text"
						name="pancardNumber" id="pancardNumber"
						placeholder="Enter your PAN Number." value="${CitizenDetailsVO.panCardNumber }" required
						pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}"><br>
				</div>

				<div class="col1">
					<label>
						<button type="submit">Submit</button>
					</label>
				</div>

			</form>

		</div>
	</div>



	<div class="footer">
		<h2>Footer</h2>
	</div>

    
    </body>
</html>