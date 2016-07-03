<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<html>
   <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>User Login.</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
   </head>
   <body>
      <div class="formcontainer">
           <h4>User Login.</h4>
           <c:url var="addAction" value="/Login" ></c:url>
           <form:form class="form-control input-sm" id="form" action="${addAction}" commandName="user">
             <table>
               <tr><td>User Name:</td><td><input name="name" type="textbox"</td></tr>
               <tr><td>Password:</td><td><input name="password" type="password"</td></tr>
               <tr><td colspan="2" align="right"><input type="submit" value="Submit"></td></tr>
             </table>
             <div style="color:red">${error}</div>
           </form:form>
      </div>
   </body>
</html>