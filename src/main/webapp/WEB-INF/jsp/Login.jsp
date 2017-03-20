<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login.</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
        <script src="https://use.fontawesome.com/c929efb672.js"></script>
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <!-- <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link> -->
   </head>

   <body>
      <div class="formcontainer">
           <c:url var="addAction" value="/Login" ></c:url>
           <form:form class="form-horizontal" id="form" action="${addAction}" commandName="user">
            <fieldset>
                <legend>
                <center>
                    Login Form
                </center>
                </legend>
                <div class="form-group">
                    <label class="col-md-4 control-label" for="User">User Name</label>
                    <div class="col-md-3">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user fa-fw"></i></span>
                            <input id="name" name="name" type="textBox" placeholder="Enter Your User" class="form-control input-md">
                        </div>
                    </div>
               </div>
               <div class="form-group">
                    <label class="col-md-4 control-label" for="Password">Password</label>
                    <div class="col-md-3">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-key fa-fw"></i></span>
                            <input id="password" name="password" type="password" placeholder="Enter Your Password" class="form-control input-md">
                        </div>
                    </div>
                </div>
               <div class="form-group"><label class="col-md-4 control-label" for="Submit"></label>
                   <div class="col-md-4"><button id="Submit" class="btn btn-success" type="Submit">Press To Validate</button></div>
                </div>
            </fieldset>
             <div style="color:red">${error}</div>
           </form:form>
      </div>
   </body>
</html>