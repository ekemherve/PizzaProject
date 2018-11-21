<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${titre}</title>
    <link type="text/css" href="<spring:url value='/css/pizza.css' />" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row bg-blue">
        <div class="card text-white bg-info">
            <div class="card-header ">Encoding stock</div>
            <div class="card-body ">
                <h5 class="card-title">Register Your Ingredients</h5>
                <div class="row">
                    <form:form method="post" action="${pageContext.request.contextPath}/pizza"
                               modelAttribute="pizza">

                        <div class="form-group">
                            <form:label path="name"><label>Name</label></form:label>
                            <form:input path="name" cssClass="form-control"></form:input>
                        </div>
                        <div class="form-group">
                            <form:label path="description"><label>Description</label></form:label>
                            <form:input path="description" cssClass="form-control"></form:input>
                        </div>

                        <button id="submitform" type="submit" class="btn btn-primary  offset-5">Submit</button>
                    </form:form>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>