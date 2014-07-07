<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet</title>
</head>
<body>
	<p>A List of Pets!!</p>
	<!-- //petInfo.getPetfinder().getPet().getName().get$t() -->
	<table>
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Sex</th>
			<th>Animal</th>
			<th>City</th>
			<th>State</th>
		</tr>
			<c:forEach items="${pet.petfinder.pets.pet}" var ="pet">
				<tr>
					<td>${pet.name.$t}</td>
				</tr>
			</c:forEach>

	</table>
<%-- 	<p>${pet.petfinder.pet.description.$t}</p> --%>
</body>
</html>