<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<script type="text/javascript"
	src="<c:url value="/resources/jquery-1.4.min.js" />"></script>
	<script type="text/javascript"
	src="<c:url value="/resources/pagging.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet</title>
</head>
<body>
	<p>A List of Pets!!</p>
	<!-- //petInfo.getPetfinder().getPet().getName().get$t() -->
	<table class = "petList" id ="petList">
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Sex</th>
			<th>Animal</th>
			<th>City</th>
			<th>State</th>
		</tr>
		<tbody>
			<c:forEach items="${pet.petfinder.pets.pet}" var ="pet">
				<tr>
					<td>${pet.name.$t}</td>
					<td>${pet.age.$t}</td>
					<td>${pet.sex.$t}</td>
					<td>${pet.animal.$t}</td>
					<td>${pet.contact.city.$t}</td>
					<td>${pet.contact.state.$t}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<select id ="numRowsPerPage">
	</select>
</body>
</html>