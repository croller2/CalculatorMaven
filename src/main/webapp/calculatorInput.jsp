<%-- 
    Document   : calculatorInput
    Created on : Feb 6, 2017, 9:34:37 AM
    Author     : chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Class 3</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
        <link href="resources/css/main.css" rel="stylesheet">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1 style="text-align: center">Calculate Areas</h1>
            <div class="row">
            <div class="col-xs-4 col-xs-offset-4">
                <h3>The answer for a ${type} is : ${area}</h3>  
            </div>
            </div>
        <div class="row">
            <div class="container">
                <div class ="col-xs-4 col-xs-offset-4">
                    
                    <img style="margin:auto;" src="resources/images/rectangle.gif" alt="rectangle">
                </div>    
            </div>
            <div class="container">
                <div class="col-xs-4 col-xs-offset-4">
                    <h2 style="text-align: center">Rectangle</h2>
                    <form id="rectForm" name="rectForm" method="POST" action="calc?calcType=Rectangle">
                            <div class="form-group">
                                <label for="rectangleHeight">Height</label>
                                <input type="text" class="form-control" id="rectangleHeight" name="rectangleHeight" placeholder="15.0" required>
                            </div>
                            <div class="form-group">
                                <label for="rectangleWidth">Width</label>
                                <input type="text" class="form-control" id="rectangleWidth" name="rectangleWidth" placeholder="12.0" required>
                            </div>
                            <button type="submit" name="submit" class="btn btn-default">Calculate Area</button>
                    </form>
                </div>    
            </div>
 
        </div>
        <div class="row">
            <div class="container">
                <div class="col-xs-4 col-xs-offset-4">
                    <h2 style="text-align: center">Circle</h2>
                    <form id="circleForm" name="circleForm" method="POST" action="calc?calcType=Circle">
                            <div class="form-group">
                                <label for="cirleRadius">Radius</label>
                                <input type="text" class="form-control" id="circleRadius" name="circleRadius" placeholder="15.0" required>
                            </div>
                            <button type="submit" name="submit" class="btn btn-default">Calculate Area</button>
                    </form>
                </div>    
            </div>
        </div>
        <div class="row">
            <div class="container">
                <div class="col-xs-4 col-xs-offset-4">
                    <h2 style="text-align: center">Triangle</h2>
                    <p>Given a right triangle with sides a and b, calculate side c
                    <form id="triangleForm" name="triangleForm" method="POST" action="calc?calcType=Triangle">
                            <div class="form-group">
                                <label for="triangleSideA">Side A</label>
                                <input type="text" class="form-control" id="triangleSideA" name="triangleSideA" placeholder="15.0" required>
                            </div>
                            <div class="form-group">
                                <label for="triangleSideB">Side B</label>
                                <input type="text" class="form-control" id="triangleSideB" name="triangleSideB" placeholder="15.0" required>
                            </div>
                            <button type="submit" name="submit" class="btn btn-default">Calculate Hypotenuse</button>
                    </form>
                </div>    
            </div>
        </div>
    </body> 
</html>
