<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
          integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <title>Employee List</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Employees</h1>
            <p>All the registered employees for our store</p>
        </div>
    </div>
</section>
<section class="container">
    <table class="table table-striped table-bordered table-dark">
        <thead class="thead-dark">
        <tr>
            <th id="IdColumn" class="bg-primary"># ID</th>
            <th id="courtesyColumn" class="bg-primary">courtesy</th>
            <th id="LastNameColumn" class="bg-primary">Last Name</th>
            <th id="FirstNameColumn" class="bg-primary">First Name</th>
            <th id="BirthDateColumn" class="bg-primary">Birth date</th>
            <th id="titleColumn" class="bg-primary">Job title</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td>${employee.employeeid}</td>
                <td>${employee.titleofcourtesy}</td>
                <td>${employee.lastName}</td>
                <td>${employee.firstName}</td>
                <td><fmt:formatDate value="${employee.birthdate}" pattern="yyyy-MM-dd"/></td>
                <td>${employee.title}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"
        integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"
        integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ"
        crossorigin="anonymous"></script>
</body>
</html>
