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
                <form method="POST" action="">
                    <div class="col1">
                        <input type="text" name="sname" id="sname" placeholder="Enter scheme name" required><br>
                    </div>
                    <div class="col1">
                        <textarea rows="4" cols="30" id="summary" name="summary" required>Enter your summary..</textarea>

                    </div>
                    <div class="col1">
                        <textarea rows="4" cols="50" id="description" name="descritption" required>Enter your description..</textarea>
                    </div>
                    <div class="col1">
                        Upload Image <input type="file" id="image" name="image" >

                    </div>
                    <div class="col1">
                        <label for="ministry">Choose a ministry:</label>

                        <select name="ministry" id="ministry">
                            <option value="finance">Finance</option>
                            <option value="saab">Agriculture</option>
                            <option value="mercedes">Education</option>
                            <option value="audi">Textile</option>
                        </select>
                    </div>
                    <div class="col1">
                        <label for="sector">Choose a sector:</label>

                        <select name="sector" id="sector">
                            <option value="finance">Pension</option>
                            <option value="saab">Child Care</option>
                            <option value="mercedes">Agriculture</option>
                            <option value="audi">Education</option>
                        </select>
                    </div>
                    <div class="col1">
                        <label for="startDate">Enter start date</label>
                        <input type="date" name="startDate" id="startDate" required><br>

                    </div>
                    <div class="col1">
                        <label>Select eligibility criteria</label>

                    </div>
                    <div class="col1" id="col2">
                        <!--<button type="submit" id="submit" value="submit" onclick="add(col2)">Add eligibility criteria.</button>-->
                        
                        <input type="checkbox" id="govt" name="govt" value="govt">
                        <label for="govt"> Government</label><br>
                        <input type="checkbox" id="pvt" name="pvt" value="pvt">
                        <label for="pvt"> Private</label><br>
                        <input type="checkbox" id="farmer" name="farmer" value="farmer">
                        <label for="farmer"> Farmer</label><br>

                        
                    </div>
                    <div class="col1">
                        Upload supporting documents <input type="file" id="files" name="files" multiple >
                    </div>
                    <div class="col1">
                        <label>Choose Bank</label>

                    </div>
                    <div class="col1" id="col2">
                        <!--<button type="submit" id="submit" value="submit" onclick="add(col2)">Add eligibility criteria.</button>-->
                        
                        <input type="checkbox" id="HSBC" name="HSBC" value="HSBC">
                        <label for="HSBC"> HSBC</label><br>
                        <input type="checkbox" id="ICICI" name="ICICI" value="ICICI">
                        <label for="pvt"> ICICI</label><br>
                        <input type="checkbox" id="HDFC" name="HDFC" value="HDFC">
                        <label for="HDFC"> HDFC</label><br>

                        
                    </div>
                    <div class="col1">
                        <button type="submit" id="submit" class="submit"> Submit </button>
                    </div>
                    
                </form>

            </div>
        </div>
        
 

        <div class="footer">
            <h2>Footer</h2>
        </div>
    
    </body>
</html>