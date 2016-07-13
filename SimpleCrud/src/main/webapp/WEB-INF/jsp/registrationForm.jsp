<%-- 
    Document   : registrationForm
    Created on : 05/07/2016, 10:46:40 AM
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
        <title>Simple CRUD</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div style="padding: 10px;" class="col-md-12"></div>
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <h1 class="text-center">Register Here</h1>
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title">Register Form</h3>
                        </div>
                        <div class="panel-body">
                            <!-- Form -->
                            <form method="POST" action="" commandName="newMemberForm" modelattribute="member">
                                <!-- Username Input --> 
                                <div class="form-group <c:out value='${status.getsUsernameInput()}'/>">
                                    <label for="exampleInputUsername">Username</label>
                                    <input required type="text" class="form-control" name="username" id="exampleInputUsername" placeholder="Username">
                                </div>
                                <!-- Display Error Text -->
                                <div class="form-group has-error"> 
                                    <p class="help-block"> <small><b><c:out value='${status.sUsername}'/></b></small></p> 
                                </div> 

                                <!-- Password Input --> 
                                <div class="form-group <c:out value='${status.getsPasswordInput()}'/>">
                                    <label for="exampleInputPassword">Password</label>
                                    <input required type="password" class="form-control" name="password" id="exampleInputPassword" placeholder="Password">
                                </div>
                                <!-- Display Error Text -->
                                <div class="form-group has-error"> 
                                    <p class="help-block"> <small><b><c:out value='${status.getsPassword()}'/></b></small></p> 
                                </div> 

                                <!-- Email Input --> 
                                <div class="form-group <c:out value='${status.getsEmailInput()}'/>">
                                    <label for="exampleInputEmail">Email address</label>
                                    <input required type="email" class="form-control" name="email" id="exampleInputEmail" placeholder="Email">
                                </div>
                                <!-- Display Error Text -->
                                <div class="form-group has-error"> 
                                    <p class="help-block"> <small><b><c:out value='${status.getsEmail()}'/></b></small></p> 
                                </div> 

                                <button type="submit" class="btn btn-info">Submit</button>
                                <a class="btn btn-info" href="login.html"> Log In</a>
                                <br />
                                <!-- Display Status Text --> 
                                <div class="form-group <c:out value='${status.getsInput()}'/>"> 
                                    <p class="help-block"> <small><b><c:out value='${status.getsStatus()}'/></b></small></p> 
                                </div> 
                            </form>
                        </div>
                    </div

                </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    </body>
</html>
