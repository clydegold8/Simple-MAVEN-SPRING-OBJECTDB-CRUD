<%-- 
    Document   : logInForm
    Created on : 06/07/2016, 1:05:46 PM
    Author     : VIZI-BILL PH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.simplecrud.*"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <!-- Latest compiled and minified JavaScript -->
        <script   src="https://code.jquery.com/jquery-2.2.4.min.js"   integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple CRUD LogIn</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div style="padding: 10px;" class="col-md-12"></div>
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <h1 class="text-center">Log In Here</h1>
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title">Log In Form</h3>
                        </div>
                        <div class="panel-body">
                            <!-- Form -->
                            <form method="POST" action="logging.html" commandName="LogInForm" modelattribute="login">
                                <!-- Username Input --> 
                                <div class="form-group <c:out value='${status.getsInput()}'/>">
                                    <label for="exampleInputUsername">Username</label>
                                    <input required type="text" class="form-control" name="username" id="exampleInputUsername" placeholder="Username">
                                </div>
                                <!-- Password Input --> 
                                <div class="form-group <c:out value='${status.getsInput()}'/>">
                                    <label for="exampleInputPassword">Password</label>
                                    <input required type="password" class="form-control" name="password" id="exampleInputPassword" placeholder="Password">
                                </div>

                                <button type="submit" class="btn btn-info">Log In</button>
                                <a class="btn btn-info" href="registration.html"> Register</a>
                                <br />
                                <!-- Display Status Text -->
                                <div class="form-group <c:out value='${status.getsInput()}'/>"> 
                                    <p class="help-block"> <b> <c:out value='${status.getsStatus()}'/></b></p> 
                                </div>
                            </form>
                        </div>
                    </div>

                </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    </body>
</html>
