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
    <a href="/products/list?start=${start-1}&keyword=${keyword}"><b>${start}</b></a>
</c:forEach>

<form method="post" action="/products/list">
    <input type="text" name="keyword"><br>
    <button type="submit">검색 : </button>
</form>


</body>
</html>