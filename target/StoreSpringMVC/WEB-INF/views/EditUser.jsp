<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>

<html>
   <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <script src="<c:url value="/resources/jquery-3.0.0.min.js" />"></script>
       <title>Edit User.</title>
   </head>
   <body>
      <div id="formsContent">
           <h4>Edit User.</h4>
           <c:url var="addAction" value="/Edit" ></c:url>
           <form:form id="form" action="${addAction}" commandName="userDetails">
             <table>
               <tr><td>User Name:</td><td><input name="name" type="textbox" value=${userDetails.name}></td></tr>
               <tr><td>Password:</td><td><input name="password" type="textbox" value=${userDetails.password}></td></tr>
               <tr><td>Enable:</td><td><input name="isEnable" type="checkbox" checked=${userDetails.isEnable}></td></tr>
               <tr><input name="id" type="hidden" value=${userDetails.id}></tr>
               <tr><td colspan="2" align="right"><input type="submit" value="Submit"></td></tr>
             </table>
             <div style="color:red">${error}</div>
           </form:form>
      </div>
   </body>
</html>
