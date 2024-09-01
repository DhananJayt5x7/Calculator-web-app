<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculation Result</title>
    <style>
        body {
            font-size: 40px;
            text-align: center;
            background: linear-gradient(to right, #2b40ff, #07121a);
            color: white;
        }
        h1 {
            margin-top: 50px;
        }
    </style>
</head>
<body>
    <h1>Calculation Result</h1>
    <p>The result of the operation is: <strong><%= request.getAttribute("result") %></strong></p>
    <p>Operation details: <strong><%= request.getAttribute("operation") %></strong></p>

    <form action="index.html">
        <button type="submit">Perform Another Calculation</button>
    </form>
</body>
</html>
