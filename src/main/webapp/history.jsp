<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculation History</title>
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
        table {
            margin: 0 auto;
            border-collapse: collapse;
            width: 80%;
            color: white;
        }
        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid white;
        }
    </style>
</head>
<body>
    <h1>Calculation History</h1>
    <table>
        <tr>
            <th>Operation</th>
        </tr>
        <%
            List<String> history = (List<String>) request.getAttribute("history");
            if (history != null) {
                for (String record : history) {
        %>
                    <tr>
                        <td><%= record %></td>
                    </tr>
        <%
                }
            } else {
        %>
                <tr>
                    <td>No history available.</td>
                </tr>
        <%
            }
        %>
    </table>

    <form action="index.html">
        <button type="submit">Back to Calculator</button>
    </form>
</body>
</html>
