<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense Tracker - Results Page</title>
</head>
<body>
    <h1>Expense Tracker Results List</h1>
    
    Rent:$ ${param.rent}
    <br>
    Groceries:$ ${param.groceries}
    <br>
    Gas:$ ${param.gas}
    <br>
    Entertainment:$ ${param.entertainment}
    <br>
    Other:$ ${param.other}
    <br>
    
    <p>Your total expenses: $${totalExpenses}</p>
    
    
    <a href="index.jsp">Back to home page.</a>
</body>
</html>