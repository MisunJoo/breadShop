<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>상품 목록 페이지</title>
</head>
<body>
<c:forEach items="${productList}" var="product">
    ${product.name} <br>
</c:forEach>


<c:forEach begin="1" end="${pageCount}" step="1" var="start">
    <a href="/product/list?start=${start-1}"><b>${start}</b></a>
</c:forEach>


</body>
</html>