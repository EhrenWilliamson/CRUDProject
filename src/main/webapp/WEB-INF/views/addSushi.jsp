<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>

  <div class="container-fluid">

<nav class="navbar navbar-default">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Welcome to my sushi list App!</a>

    <ul class="nav navbar-nav">
           <li><a href="home.do">Home</a></li>
      <li><a href="seeSushi.do">See List</a></li>
    </ul> 
    </div>
</nav>
    	<form action='seeSushi.do' method="POST">
  
   <!-- 	ID:<input type="text" name="id"/><br/>
  Fish:<input type="text" name="fish"><br>
 Rice:<input type="text" name="rice"><br>
 Wrapper:<input type= 'text' name = wrapper><br>
  

-->
<div class="form-group">
  <label for="usr">ID:</label>
  <input type="number" class="form-control" id="usr" name='id'>
</div>
<div class="form-group">
  <label for="usr">Fish:</label>
  <input type="text" class="form-control" id="pwd" name='fish'>
  
</div>
<div class="form-group">
  <label for="usr">Rice:</label>
  <input type="text" class="form-control" id="usr" name='rice'>
</div>
<div class="form-group">
  <label for="usr">Wrapper:</label>
  <input type="text" class="form-control" id="pwd" name="wrapper">
<input type="submit" value="Submit">
  
</div>
</form>
</body>
</html>
