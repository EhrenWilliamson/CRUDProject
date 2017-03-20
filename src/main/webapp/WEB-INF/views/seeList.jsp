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
<div>
  <h2> Below is your sushi list</h2>

      	 <table class="table">
      
          <thead>
      <tr>

        <th>Entry number</th>
        <th>Fish</th>
        <th>Rice</th>
        <th>Wrapper</th>
      </tr>
    </thead>

	<c:forEach var="Sushi" items="${sushi}">

    <tbody>
      <tr>
         <td>${Sushi.id}</td>
         <td>${Sushi.fish}</td>
        <td>${Sushi.rice}</td>
        <td>${Sushi.wrapper}</td>
        <td>
	   </td>
	    <td><form action="removeSushi.do" method="POST">
		<a href="removeSushi.do?id=${Sushi.id}" class="btn btn-default">Remove sushi</a>
		</form> </td>
			    <td>
			    <form action="editSushiForm.do" method="GET">		
		<a href="editSushiForm.do?id=${Sushi.id}" class="btn btn-default">Edit sushi</a>
		</form>
	 </td>
      
      </tr>
    </tbody>
  

   	</c:forEach>	
   	</table>
    </ul>
       <a href="addSushi.do" class="btn btn-default">add sushi</a>
    </div>
  </div>


</body>
</html>
