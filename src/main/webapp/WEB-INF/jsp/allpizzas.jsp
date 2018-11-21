<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${titre}</title>
    <link type="text/css" href="<spring:url value='/css/allpizza.css' />" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Description</th>
            </tr>
            </thead>
            <tbody>
                <c:if test="${pizzas != null && not empty pizzas}">
                    <c:forEach items="${pizzas}" var="pizza">
                        <tr>
                            <td>${pizza.name}</td>
                            <td>${pizza.description}</td>
                        </tr>
                    </c:forEach>
                </c:if>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>