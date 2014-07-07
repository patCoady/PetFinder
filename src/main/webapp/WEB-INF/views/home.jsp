<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Home</title>
	<script type="text/javascript"
	src="<c:url value="/resources/jquery-1.4.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/randomPet.js" />"></script>
<title>Books</title>
</head>
<body>
<h1>
	Welcome to Pet Rescue 
</h1>
<p></p>
<button id ="getRest">REST</button>
<form name="randomPet" action = "randomPet" method ="POST">
	<input type ="text" id="randomPet" name ="randomPet"/>
	<input type ="text" id="petInfo" name ="petInfo"/>
	<button type="submit">Find Random Pet</button>
</form>


</body>
</html>
