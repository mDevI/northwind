<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
          integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <title><spring:message code="customer.form.title"/></title>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1><spring:message code="customer.form.jumbo.h"/></h1>
            <p><spring:message code="customer.form.jumbo.p"/></p>
        </div>
    </div>
</section>
<section class="container">
    <form:form method="POST" modelAttribute="theCustomer">
        <form:errors path="*" cssClass="alert alert-danger" element="div"/>
        <div class="form-row">
            <div class="form-group col-md-2">
                <label for="customerId"><spring:message code="customer.form.label.customerid"/></label>
                <spring:message code="customer.form.customerid.placeholder" var="idPlaceholder"/>
                <form:input path="customerid" type="text" cssClass="form-control" id="customerId"
                            placeholder="${idPlaceholder}"/>
            </div>
            <div class="form-group col-md-10">
                <label for="customerCompanyName"><spring:message code="customer.form.label.customername"/></label>
                <spring:message code="customer.form.customername.placeholder" var="namePlaceholder"/>
                <form:input path="companyname" type="text" cssClass="form-control" id="customerCompanyName"
                            placeholder="${namePlaceholder}"/>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-7">
                <label for="customerContact"><spring:message code="customer.form.label.contactname"/></label>
                <spring:message code="customer.form.contactname.placeholder" var="contactPlaceholder"/>
                <form:input path="contactname" cssClass="form-control" id="customerContact"
                            placeholder="${contactPlaceholder}"/>
            </div>
            <div class="form-group col-md-5">
                <label for="contactTitle"><spring:message code="customer.form.label.contacttitle"/></label>
                <spring:message code="customer.form.contacttitle.placeholder" var="contacttitlePlaceholder"/>
                <form:input path="contacttitle" cssClass="form-control" id="contactTitle"
                            placeholder="${contacttitlePlaceholder}"/>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-12">
                <label for="customerAddress"><spring:message code="customer.form.label.address"/></label>
                <spring:message code="customer.form.address.placeholder" var="addressPlaceholder"/>
                <form:input path="address" cssClass="form-control" id="customerAddress"
                            placeholder="${addressPlaceholder}"/>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-3">
                <label for="customerPostalCode"><spring:message code="customer.form.label.zipcode"/></label>
                <spring:message code="customer.form.zipcode.placeholder" var="zipPlaceholder"/>
                <form:input path="postalcode" cssClass="form-control" id="customerPostalCode"
                            placeholder="${zipPlaceholder}"/>
            </div>
            <div class="form-group col-md-3">
                <label for="customerCity"><spring:message code="customer.form.label.city"/></label>
                <spring:message code="customer.form.city.placeholder" var="cityPlaceholder"/>
                <form:input path="city" cssClass="form-control" id="customerCity" placeholder="${cityPlaceholder}"/>
            </div>
            <div class="form-group col-md-3">
                <label for="customerRegion"><spring:message code="customer.form.label.region"/></label>
                <spring:message code="customer.form.region.placeholder" var="regionPlaceholder"/>
                <form:input path="region" cssClass="form-control" id="customerRegion"
                            placeholder="${regionPlaceholder}"/>
            </div>
            <div class="form-group col-md-3">
                <label for="customerCountry"><spring:message code="customer.form.label.country"/></label>
                <spring:message code="customer.form.country.placeholder" var="countryPlaceholder"/>
                <form:input path="country" cssClass="form-control" id="customerCountry"
                            placeholder="${countryPlaceholder}"/>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-12">
                <spring:message code="customer.form.button.submit" var="btnSubmit"/>
                <spring:message code="customer.form.button.reset" var="btnReset"/>
                <input type="submit" class="btn btn-primary col-2" value="${btnSubmit}">
                <input type="reset" class="btn btn-secondary col-2" value="${btnReset}">
                <a href="${pageContext.request.contextPath}/customers" class="btn btn-primary float-right col-2"
                   role="button"><spring:message code="customer.form.button.back"/></a>
            </div>
        </div>
    </form:form>
</section>
</body>
</html>
