<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense Calculator</title>
</head>
<body>
	<h1>Hello! Welcome to Expense Calculator.</h1>
	
	<form action="getExpenseServlet" method="post">
	
	<h2>Enter your personal expenses as whole numbers:</h2>
	
	<label for="rent">Rent:</label>
	<input type="number" id="rent" name="rent"><br>
	
	<label for="groceries">Groceries:</label>
	<input type="number" id="groceries" name="groceries"><br>
	
	<label for="gas">Gasoline:</label>
	<input type="number" id="gas" name="gas"><br>
	
	<label for="entertainment">Entertainment:</label>
	<input type="number" id="entertainment" name="entertainment"><br>
	
	<label for="other">Other:</label>
	<input type="number" id="other" name="other"><br>
	
	<input type="submit" value="Calculate Expenses" /> </form>

</body>
</html>