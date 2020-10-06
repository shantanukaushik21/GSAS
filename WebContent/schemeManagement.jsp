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
            function addScheme() {
                location.replace("addScheme.jsp")
                }
        </script>
        <div class="header">
            <h1>Scheme Management Page</h1>
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
            
     </div>
     
        <div class="main">
            <div class="main1">
                
            </div>
            <div class="add">
                <button type="submit" name="add" id="add" onclick="addScheme()">Add Scheme</button>

            </div>
            <div class="add">
                    Upload scheme in JSON/XML format <input type="file" id="files" name="files" multiple >

                
            </div>
        </div>
        
 

        <div class="footer">
            <h2>Footer</h2>
        </div>
    
    </body>
</html>