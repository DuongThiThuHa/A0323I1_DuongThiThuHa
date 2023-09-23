<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of customers</title>
</head>
<style>
    table{
        width: 50%;
        height: 50%;
        border-collapse: collapse;
        text-align: center;
    }
</style>
<body>
<h1>Danh sách khách hàng</h1>
<table border="-1">
    <thead>
    <tr>
        <td>STT</td>
        <td>Tên</td>
        <td>Ngày Sinh</td>
        <td>Địa Chỉ </td>
        <td>Ảnh</td>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${list}" var="customer" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td>${customer.name}</td>
            <td>${customer.dateOfBirth}</td>
            <td>${customer.address}</td>
            <td>${custome}<img style="width: 40px;height: 40px" src="https://ceacopiniones.es/wp-content/uploads/2019/03/user-8-1024x1024.png"></td>
        </tr>

    </c:forEach>
    </tbody>
</table>
</body>
</html>
