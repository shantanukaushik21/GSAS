<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <script>
            function switchPage() {
                location.replace("displaySchemes.jsp")
                }
        </script>
        <div class="header">
            <h1>Employee Login</h1>
        </div>
        <div class="sidenav">
        <div class="image">
                <img src="logo\logo.jpeg">
            </div>
            
            <div class="heading">
                <h2> Menu </h2>
            </div>
            <div class="content" id="first">
                <a href="employeeLogin.jsp">Employee Login</a>
            </div>
            <div class="content">
             <a href="citizenLogin.jsp">Citizen Login</a>
            </div>
            <div class="content">
            <a href="displaySchemes.jsp">List Schemes</a>
            </div>
            <div class="content">
            <a href="registerCitizen.jsp">Citizen Register</a>
            </div>
            
     </div>
     
        <div class="main">
            <div class="main1">
                <form method="POST" action="">
                    <div class="col1">
                        <input type="number" name="eid" id="eid" placeholder="Enter your employee ID" required><br>
                    </div>
                    <div class="col2">
                        <input type="password" name="epwd" id="epwd" placeholder="Enter your password." required><br>

                    </div>
                    <div class="col3">
                        <button type="submit" id="submit" class="submit" onclick="switchPage()"> Submit </button>
                    </div>
                    
                </form>

            </div>
        </div>
        
 

        <div class="footer">
            <h2>Footer</h2>
        </div>
    
    </body>
</html>