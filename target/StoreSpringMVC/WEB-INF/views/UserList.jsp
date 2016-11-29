<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>User Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script src="https://use.fontawesome.com/c929efb672.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>
        $(function(){
           debugger;
           console.log("ready!");
           $("#delete").hide();
           $("#edit").hide();
        });
     </script>
</head>
<body>
    <div class = "panel panel-primary">
        <div class = "panel-heading">
            <h2>Users List</h2>
        </div>
        <table class="table table-hover">
        <thead>
           <tr>
             <th>Id</th>
             <th>Name</th>
             <th id="edit">Edit</th>
             <th id="delete">Delete</th>
           </tr>
           </thead>
           <tbody>
            <c:forEach items="${listUsers}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td><a href="<c:url value='/Edit/${user.id}' />" ><i class="fa fa-pencil fa-fw"></a></td>
                    <td><a href="<c:url value='/Delete/${user.id}' />" ><i class="fa fa-trash fa-fw"></a></td>
                </tr>
            </c:forEach>
           </tbody>
        </table>
    </div>
</body>
</html>