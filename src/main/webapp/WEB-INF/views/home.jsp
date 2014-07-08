<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Home</title>
	<script type="text/javascript"
	src="<c:url value="/resources/jquery-1.4.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/getPets.js" />"></script>
<title>Books</title>
</head>
<body>
<h1>
	Welcome to Pet Rescue 
</h1>
<p></p>
<button id ="getRandom">Find Random Pet</button>
<button id ="getRandomCat">Find Random Cat</button>
<button id ="getRandomDog">Find Random Dog</button>
<form id ="randomPet" name="randomPet" action = "randomPet" method ="POST">
	<input type ="hidden" id="petInfo" name ="petInfo"/>
</form>
<h4>Cat breeds</h4>
<form id ="catList" name = "petList" action ="petList" method = "POST">
	<input type ="hidden" id="catListInfo" name ="petListInfo"/>
	<select id = "catBreedSelect"></select>
	<button id ="getCatList" type ="button">Find Cats</button>
</form>
<h4>Dog breeds</h4>
<form id ="dogList" name = "petList" action ="petList" method = "POST">
	<input type ="hidden" id="dogListInfo" name ="petListInfo"/>
	<select id = "dogBreedSelect"></select>
	<button id ="getDogList" type ="button">Find Dogs</button>
</form>
<h4>Custom search</h4>
<div>Zipcode</div>
<form id ="petList" name ="petList" action ="petList" method ="POST">
	<input type ="hidden" id ="petListInfo" name ="petListInfo"/>
	<input type ="text" id = "zipCode" name ="zipCode"/>
	<select id ="animalSelect">
		<option value ="barnyard">barnyard</option>
		<option value ="bird">bird</option>
		<option value ="cat">cat</option>
		<option value ="dog">dog</option>
		<option value ="horse">horse</option>
		<option value ="pig">pig</option>
		<option value ="reptile">reptile</option>
		<option value ="smallfurry">smallfurry</option>
		<option value ="other">Other</option>
	</select>
	<input type ="text" id ="other" style="display: none;"/>
	<button id ="getPetList" type ="button">Find Pets</button>
	<!--style="display: none;"  -->
</form>


</body>
</html>
