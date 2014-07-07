<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet</title>
</head>
<body>
	<p>I'm a Random Pet!!</p>
	<!-- //petInfo.getPetfinder().getPet().getName().get$t() -->
	<table>
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Sex</th>
			<th>Animal</th>
			<th>City</th>
		</tr>
		<tr>
			<td>${pet.petfinder.pet.name.$t}</td>
			<td>${pet.petfinder.pet.age.$t}</td>
			<td>${pet.petfinder.pet.sex.$t}</td>
			<td>${pet.petfinder.pet.animal.$t}</td>
			<td>${pet.petfinder.pet.contact.city.$t}</td>
		</tr>
	</table>
	<p>${pet.petfinder.pet.description.$t}</p>
</body>
</html>