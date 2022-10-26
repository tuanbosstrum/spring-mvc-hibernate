
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Listing product</title>
</head>
<body>
    <h1>Products</h1>
    <p><a href="new">Add new product</a></p>
    <p>There are ${products.size()} products in this list.</p>
    <table border="1">
        <tr>
            <td>Code</td>
            <td>Name</td>
            <td>Name</td>
            <td>Price</td>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.getId()}</td>
                <td><a href="view?id=${product.getId()}"> ${product.getName()}</a></td>
                 <td><a href="viewpathvariable/${product.getId()}"> ${product.getName()}</a></td>
                <td>${product.getPrice()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
