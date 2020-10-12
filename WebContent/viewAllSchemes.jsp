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
                width: 80%;
                height: auto;
                padding: 50px;
                text-align: center;
                align-self: center;
                opacity: 0.8;
                margin:8px;
              
                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
            }
        </style>
        
    </head>
    <body>
    <script src="JS\navigation.js"></script>
        <div class="header">
            <h1>Schemes</h1>
        </div>
        <div class="sidenav">
        <div class="image">
                <img src="logo\logo.jpeg">
            </div>
            
            <div class="heading">
                <h2> Menu </h2>
            </div>
            <div class="content" id="first">
                <a href="EditCitizenDetailsServlet">Edit Details</a>
            </div>
            <div class="content">
             <a href="index.jsp">Logout</a>
            </div>
            
            
     </div>
     
        <div class="main">
            <div class="main1">
			<h1>Schemes</h1>
			<div class="row">
			<form action="ApplySchemeServlet">
				<c:forEach items="${notAppliedSchemeList}" var="notAppliedSchemeList">
					<div class="column">
						<div class="card">
							
							<h2>${notAppliedSchemeList.schemeName } </h2>
							<img src="${notAppliedSchemeList.imagePath }" class=".cardImage">
							<p>${notAppliedSchemeList.summary }</p>
							<p>
								<button type="submit" name="${notAppliedSchemeList.schemeId }" id="${notAppliedSchemeList.schemeId }">Apply</button>
							</p>

						</div>
						</div>
							</c:forEach>
							</form>
					</div>
					</div>
                <div class="main1">
                    <h1> Applied Schemes</h1>
                </div>
                <div class="main1">
                    <h1> Rejected Schemes</h1>
                </div>

            
        </div>
        
 

        <div class="footer">
            <h2>Footer</h2>
        </div>
        
    
    </body>
</html>