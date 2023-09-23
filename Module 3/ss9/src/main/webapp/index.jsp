<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form method="post" action="/discount-servlet">
    <h1>Product Discount</h1>
    <div>
        <label>Product Description: </label>
        <input type="text" name="description">
    </div>
    <div>
        <label>List Price: </label>
        <input type="number" name="price">
    </div>
    <div>
        <label>Discount Percent: </label>
        <input type="number" name="percent">
    </div>
    <button>Calculate</button>
</form>
</body>
</html>