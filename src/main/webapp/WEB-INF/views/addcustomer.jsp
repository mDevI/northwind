<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!Doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
          integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <title><spring:message code="addCustomer.form.title"/></title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1><spring:message code="addCustomer.form.jumbo.h"/></h1>
            <p><spring:message code="addCustomer.form.jumbo.p"/></p>
        </div>
    </div>
</section>
<section class="container">
    <form:form method="POST" modelAttribute="customerToBeAdd" class="form-horizontal">
        <fieldset>
            <legend><spring:message code="addCustomer.form.legend"/></legend>
            <!-- id -->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2"
                       for="customerId"><spring:message code="addCustomer.form.field.CustomerID"/></label>
                <div class="col-lg-10">
                    <form:input id="customerId" path="customerid" type="text" class="form:input-large"/>
                </div>
            </div>
            <!-- company name -->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2"
                       for="companyName"><spring:message code="addCustomer.form.field.CompanyName"/></label>
                <div class="col-lg-10">
                    <form:input id="companyName" path="companyname" type="text" class="form:input-large"/>
                </div>
            </div>
            <!-- contact name-->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2" for="lastName"><spring:message
                        code="addCustomer.form.field.ContactName"/></label>
                <div class="col-lg-10">
                    <form:input id="contactName" path="contactname" type="text" class="form:input-large"/>
                </div>
            </div>
            <!-- contact title-->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2" for="contactTitle"><spring:message
                        code="addCustomer.form.field.ContactTitle"/></label>
                <div class="col-lg-10">
                    <form:input id="contactTitle" path="contacttitle" type="text" class="form:input-large"/>
                </div>
            </div>
            <!-- address-->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2" for="address"><spring:message
                        code="addCustomer.form.field.address"/></label>
                <div class="col-lg-10">
                    <form:input id="address" path="address" type="text" class="form:input-large"/>
                </div>
            </div>
            <!-- city-->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2" for="city"><spring:message
                        code="addCustomer.form.field.city"/></label>
                <div class="col-lg-10">
                    <form:input id="city" path="city" type="text" class="form:input-large"/>
                </div>
            </div>
            <!-- region-->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2" for="region"><spring:message
                        code="addCustomer.form.field.region"/></label>
                <div class="col-lg-10">
                    <form:input id="region" path="region" type="text" class="form:input-large"/>
                </div>
            </div>
            <!-- postalcode-->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2" for="postalcode"><spring:message
                        code="addCustomer.form.field.postalcode"/></label>
                <div class="col-lg-10">
                    <form:input id="postalcode" path="postalcode" type="text" class="form:input-large"/>
                </div>
            </div>
            <!-- country-->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2" for="country"><spring:message
                        code="addCustomer.form.field.country"/></label>
                <div class="col-lg-10">
                    <form:input id="country" path="country" type="text" class="form:input-large"/>
                </div>
            </div>
            <!-- phone-->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2" for="phone"><spring:message
                        code="addCustomer.form.field.phone"/></label>
                <div class="col-lg-10">
                    <form:input id="phone" path="phone" type="text" class="form:input-large"/>
                </div>
            </div>
            <!-- fax-->
            <div class="form-group">
                <label class="control-label col-md-2 col-md-2" for="fax"><spring:message
                        code="addCustomer.form.field.fax"/></label>
                <div class="col-lg-10">
                    <form:input id="fax" path="fax" type="text" class="form:input-large"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-10">
                    <spring:message code="addCustomer.form.button.addNew" var="buttonAddCustomer"/>
                    <spring:message code="addCustomer.form.button.clear" var="buttonClear"/>
                    <input type="submit" id="btnAdd" class="btn btn-primary" value="${buttonAddCustomer}"/>
                    <input type="reset" class="btn btn-secondary" value="${buttonClear}"/>
                </div>
            </div>
        </fieldset>
    </form:form>
</section>
</body>
</html>