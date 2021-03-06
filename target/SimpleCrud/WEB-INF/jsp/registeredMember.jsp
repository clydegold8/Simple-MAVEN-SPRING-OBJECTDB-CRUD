<%-- 
    Document   : registeredMember
    Created on : 06/07/2016, 1:07:46 PM
    Author     : VIZI-BILL PH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="form"%>
<%@page import="com.simplecrud.*"%>

<!DOCTYPE html>
<html>
    <head>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <!-- Latest compiled and minified JavaScript -->
        <script   src="https://code.jquery.com/jquery-2.2.4.min.js"   integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/bootbox/4.4.0/bootbox.min.js"></script>

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
                                        <td><b>Password</b></td>
                                        <td><b>Signing Date</b></td>
                                        <td><b>Role</b></td>
                                        <td><b>Options</b></td>
                                    </tr>
                                </thead>
                                <tbody>
                                <form id="form_update" method="POST" action="updateuser.html" commandName="UpdateMemberForm" modelattribute="member">
                                    <tr class="text-center">
                                    <input type="hidden" name="id" value="<c:out value="${UserInfo.getId()}"/><c:out value="${status.getId()}"/>"/>
                                    <td>
                                        <span class="user_name"><c:out value="${UserInfo.getUsername()}"/></span>
                                        <input style="display:none;"  value="<c:out value="${UserInfo.getUsername()}"/>" type="text" class="form-control edit_input" name="username" placeholder="Username">
                                        <div class="form-group <c:out value='${status.getsInput()}'/>"> 
                                            <p class="help-block"> <small><b><c:out value='${status.sUsername}'/></b></small></p> 
                                        </div>
                                    </td> 
                                    <td>
                                        <span class="user_email"><c:out value="${UserInfo.getEmail()}"/></span>
                                        <input style="display:none;"  value="<c:out value="${UserInfo.getEmail()}"/>" type="email" class="form-control edit_input" name="email" placeholder="Email">
                                        <div class="form-group <c:out value='${status.getsInput()}'/>"> 
                                            <p class="help-block"> <small><b><c:out value='${status.getsEmail()}'/></b></small></p> 
                                        </div>
                                    </td>
                                    <td>
                                        <span class="user_password">To Change Password Click Edit Button</span>
                                        <input style="display:none;"  value="<c:out value="${UserInfo.getPassword()}"/>" type="password" class="form-control edit_input" name="password" placeholder="Password">
                                        <div class="form-group <c:out value='${status.getsInput()}'/>"> 
                                            <p class="help-block"> <small><b><c:out value='${status.getsPassword()}'/></b></small></p>
                                        </div>
                                    </td>
                                    <td>
                                        <c:out value="${UserInfo.getDate()}"/>
                                    </td>
                                    <td>
                                        <c:out value="${UserInfo.getHas_Role()}"/> 
                                    </td>
                                    <td>
                                        <a href="#" class="btn btn-info edit_btn">Edit</a>
                                        <a style="display:none;" class="btn btn-info update_btn" href="#">Update</a>
                                        <a href="#" style="display:none;" class="btn btn-warning edit_cancel">Cancel</a>
                                        <a href="#" class="btn btn-danger btn-delete">Delete</a>
                                    </td>
                                    </tr>
                                </form>
                                </tbody>
                            </table>
                            <!-- Display Status Text --> 
                            <div class="form-group <c:out value='${status.getsInput()}'/>"> 
                                <p class="help-block"> <small><b><c:out value='${status.getsStatus()}'/></b></small></p> 
                            </div>
                            <div class="form-group <c:out value='${UserInfo.getErrorInput()}'/>"> 
                                <p class="help-block"> <small><b><c:out value='${UserInfo.getResponse()}'/></b></small></p> 
                            </div> 
                        </div>
                    </div>
                </div>
                <div class="col-md-3"></div>
            </div>
        </div>
    </body>
</body>
</html>
<!-- Added Javascript to beautify UI -->
<script type="text/javascript">
    $('.edit_btn').click(function() {
        $('.user_name').hide();
        $('.user_email').hide();
        $('.user_password').hide();
        $('.edit_input').show();
        $('.edit_btn').hide();
        $('.update_btn').show();
        $('.edit_cancel').show();
    });
    $('.edit_cancel').click(function() {
        $('.user_name').show();
        $('.user_email').show();
        $('.user_password').show();
        $('.edit_input').hide();
        $('.edit_btn').show();
        $('.update_btn').hide();
        $('.edit_cancel').hide();
    });
    $('.btn-delete').click(function() {
        bootbox.confirm("Are you sure you want to Delete User <c:out value="${UserInfo.getUsername()}"/> ?", function(result) {
            if (result) {
                window.location = "deleteuser.html?id=<c:out value="${UserInfo.getId()}"/><c:out value="${status.getId()}"/>";
            }
        });
    });
    $('.update_btn').click(function() {
        bootbox.confirm("Are you sure you want to Update User <c:out value="${UserInfo.getUsername()}"/> ?", function(result) {
            if (result) {
                document.getElementById("form_update").submit();
            }
        });
    });
</script>
