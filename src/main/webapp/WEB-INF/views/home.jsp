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
<button id ="getRandom">Find Random Pet</button>
<button id ="getRandomCat">Find Random Cat</button>
<form id ="randomPet" name="randomPet" action = "randomPet" method ="POST">
	<input type ="hidden" id="petInfo" name ="petInfo"/>
</form>
<form id ="petList" name = "petList" action ="petList" method = "POST">
	<input type ="hidden" id="petListInfo" name ="petListInfo"/>
	<select id = "catBreedSelect"></select>
	<button id ="getPetList" type ="button">Find Pets</button>
</form>




</body>
</html>
