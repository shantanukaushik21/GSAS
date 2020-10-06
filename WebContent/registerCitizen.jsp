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
            <h1>Citizen Registration</h1>
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
            <a href="listSchemes.jsp">List Schemes</a>
            </div>
            <div class="content">
            <a href="registerCitizen.jsp">Citizen Register</a>
            </div>
            
     </div>
     
        <div class="main">
            <div class="main1">
                <form method="POST" action="">
                    <div class="col1">
                        <label>
                            Enter your Name<input type="text" name="firstName" id="firstName" placeholder="First Name" required><input type="text" name="middleName" id="middleName" placeholder="Middle Name"><input type="text" name="lastName" id="lastName" placeholder="Last Name" required>
                        </label>
                    </div>
                    <div class="col1">
                        <label>
                            Enter your password<input type="password" name="citizenPassword" id="citizenPassword" placeholder="Enter your password." required><br>
                        </label>
                    </div>
                    <div class="col1">
                        <label>
                            Confirm your password<input type="password" name="citizenPassword1" id="citizenPassword1" placeholder="Enter your password." required><br>
                        </label>
                    </div>
                    <div class="col1">
                        <label>
                            Enter your Date of Birth<input type="text" name="dateOfBirth" id="dateOfBirth" placeholder="Enter your Date of Birth.(YYYY-MM-DD)" required><br>
                        </label>
                    </div>
                    <div class="col1">
                        <label>Select gender</label>

                    </div>
                    <div class="col1"  id="col2">
                        <!--<button type="submit" id="submit" value="submit" onclick="add(col2)">Add eligibility criteria.</button>-->
                        
                        <input type="radio" id="male" name="gender" value="male">
                        <label for="male"> Male</label><br>
                        <input type="radio" id="female" name="gender" value="female">
                        <label for="female"> Female</label><br>
                        <input type="radio" id="other" name="gender" value="others">
                        <label for="other"> Other</label><br>

                        
                    </div>
                    <div class="col1">
                        <label>
                            Enter your Phone Number<input type="text" name="phoneNumber" id="phoneNumber" placeholder="Enter your Phone Number." required pattern="[0-9]{10}"><br>
                        </label>
                    </div>
                    <div class="col1">
                        <label>
                            Enter your Email ID<input type="email" name="email" placeholder="Enter your Email ID." required><br>
                        </label>
                    </div>
                    <div class="col1">
                        <label>
                            Enter your Address<input type="text" name="street" id="street" placeholder="Enter your street" required>
                            <input type="text" name="city" id="city" placeholder="Enter your city" required>
                            <input type="text" name="state" id="state" placeholder="Enter your state" required>
                            <input type="number" name="pinCode" id="pinCode" placeholder="Enter your pincode" required pattern="[0-9]{6}">

                        </label>
                    </div>
                    <div class="col1">
                        <label>
                            Enter your Profession<input type="text" name="profession" placeholder="Enter your Profession." required><br>
                        </label>
                    </div>
                    <div class="col1">
                        <label>
                            Enter your Aadhar Number<input type="text" name="adharNumber" id="adharNumber" placeholder="Enter your Aadhar Number." required><br>
                        </label>
                    </div>
                    <div class="col1">
                        <label>
                            Enter your PAN Number<input type="text" name="pancardNumber" id="pancardNumber" placeholder="Enter your PAN Number." required pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}"><br>
                        </label>
                    </div>
                    
                    <div class="col1">
                        <label>
                            <button type="submit" class="submit"> Submit </button>
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