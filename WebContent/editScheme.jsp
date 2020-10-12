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
                 border: 1px solid red;
                /*border-radius: 5px;
                background-color: brown;*/
                padding: 20px;
                text-align: center;
                align-self: center;
                opacity: 0.8;
            }
        </style>
            </head>
    <body>
        <div class="header">
            <h1>Add Scheme</h1>
            
        </div>
        <div class="sidenav">
        <div class="image">
                <img src="logo\logo.jpeg">
            </div>
            
            <div class="heading">
                <h2> Menu </h2>
            </div>
            <div class="content" id="first">
                <a href="index.jsp">Logout</a>
            </div>
            <div class="content">
             <a href="schemeManagementPage.jsp">Add more Schemes</a>
            </div>
            
     </div>
     
        <div class="main">
		<div class="main1">
			<form method="POST" action="UpdateSchemeServlet">
			<input type="hidden" name="schemeId" id="schemeId" value="${SchemeVO.schemeId }">
				<div class="col1">
					<label class="required-field">Enter scheme name</label> <input type="text"
						name="schemeName" id="schemeName" placeholder="Enter scheme name" value="${SchemeVO.schemeName }"
						required>
				</div>
				<div class="col1">
					<label class="required-field"> Summary of the scheme </label><textarea rows="4" cols="30"
							id="summary" name="summary" value="${SchemeVO.summary }"required>Enter your summary..</textarea>
					

				</div>
				<div class="col1">
					<label class="required-field">Description of the scheme </label><textarea rows="4"
							cols="50" id="description" name="descritption" value="${SchemeVO.description }" required>Enter your description..</textarea>
				</div>
				<div class="col1">
					<label class="required-field">Upload Image </label><input type="file" id="image" name="image" value="${SchemeVO.imagePath }" required>

				</div>
				<div class="col1">
					<label for="ministry" class="required-field">Choose a ministry:</label> <select
						name="ministry" required>
						<c:forEach items="${ministryList}" var="ministry">
							<option value="${ministry.ministryId}">${ministry.ministryName}</option>
						</c:forEach>
					</select>
				</div>
				<div class="col1">
					<label for="sector" class="required-field">Choose a sector:</label> <select name="sector" required>
						<c:forEach items="${sectorList}" var="sector">
							<option value="${sector.sectorId}">${sector.sectorName}</option>
						</c:forEach>
					</select>
				</div>
				<div class="col1">
					<label for="startDate" class="required-field">Enter start date</label> <input type="date"
						name="startDate" id="startDate" value="${SchemeVO.startDate }" required><br>

				</div>
				<div class="col1">Select eligibility criteria</div>
				<div class="section">
					<div class="eligibilityCol">
						<label>Enter minimum age</label> <input type="number"
							name="minAge" id="minAge" placeholder="Enter min age" value="${SchemeEligibilityVO.minAge }"><br>
					</div>
					<div class="eligibilityCol">
						<label>Enter maximum age</label> <input type="number"
							name="maxAge" id="maxAge" placeholder="Enter max age" value="${SchemeEligibilityVO.maxAge }"><br>
					</div>

					<div class="col1">
						<label for="profession">Choose a profession:</label> <select
							name="profession">
							<c:forEach items="${professionList}" var="profession">
								<option value="${profession.professionId}">${profession.professionName}</option>
							</c:forEach>
						</select>
					</div>
					<div class="gender">
						<label>Select gender</label>

					</div>
					<div class="genderCol">

						<input type="radio" id="male" name="gender" value="${SchemeEligibilityVO.gender }">
						<label for="male"> Male</label><br> <input type="radio"
							id="female" name="gender"  value="${SchemeEligibilityVO.gender }"> <label
							for="female"> Female</label><br> <input type="radio"
							id="other" name="gender"  value="${SchemeEligibilityVO.gender }"> <label
							for="other"> Other</label><br>


					</div>
					<div class="col1">
						<label for="incomeGroup">Choose a income group:</label> <select
							name="incomeGroup">
							<c:forEach items="${incomeGroupList}" var="incomeGroup">
								<option value="${incomeGroupList.incomeGroupId}">${incomeGroup.incomeGroupName}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				<div class="col1">
					<label class="required-field">Choose Documents</label>

				</div>
				<div class="documentsCol" id="documentsCol">


					<input type="checkbox" id="panCard" name="panCard" value="panCard">
					<label for="panCard"> Pan Card</label><br> <input
						type="checkbox" id="passport" name="passport" value="passport">
					<label for="passport"> Passport</label><br> <input
						type="checkbox" id="aadharCard" name="aadharCard"
						value="aadharCard"> <label for="aadharCard">
						Aadhar Card</label><br>


				</div>
				<div class="col1">
					<label class="required-field">Choose Bank</label>

				</div>
				<div class="bankCol" id="bankCol">


					<input type="checkbox" id="HSBC" name="HSBC" value="HSBC">
					<label for="HSBC"> HSBC</label><br> <input type="checkbox"
						id="ICICI" name="ICICI" value="ICICI"> <label for="pvt">
						ICICI</label><br> <input type="checkbox" id="HDFC" name="HDFC"
						value="HDFC"> <label for="HDFC"> HDFC</label><br>


				</div>
				<div class="col1">
					
					<button type="submit" id="submit">Submit</button>
					
				</div>
				

			</form>

		</div>
	</div>
 

        <div class="footer">
            <h2>Footer</h2>
        </div>
    
    </body>
</html>