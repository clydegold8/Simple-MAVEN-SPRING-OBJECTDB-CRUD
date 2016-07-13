<%-- 
    Document   : registeredMember
    Created on : 06/07/2016, 1:07:46 PM
    Author     : VIZI-BILL PH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample CRUD User Info</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div style="padding: 10px;" class="col-md-12"></div>
                <div class="col-md-3"></div>
                <div class="col-md-6">
                    <h1 class="text-center">Registered User</h1>
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title">User Info</h3>
                            <a style="margin-top:-23px;" class="pull-right text-right btn btn-danger btn-sm" href="<c:url value="j_spring_security_logout"/>"> Log Out</a>
                        </div>
                        <div class="panel-body">
                            <!-- Table -->
                            <table class="table table-responsive table-hover table-bordered">
                                <thead>
                                    <tr>
                                        <td><b>Username</b></td>
                                        <td><b>Email</b></td>
                                        <td><b>Signing Date</b></td>
                                        <td><b>Options</b></td>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="text-center">
                                        <td><c:out value="${UserInfo.getUsername()}"/></td> 
                                        <td><c:out value="${UserInfo.getEmail()}"/></td>
                                        <td><c:out value="${UserInfo.getDate()}"/></td>
                                        <td>
                                            <a href="#" class="btn btn-info">Edit</a>
                                            <a href="#" class="btn btn-danger">Delete</a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    </body>
</body>
</html>
