<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
		<form:form action="processtheForm" modelAttribute="student">
			<span>first Name</span>
			<form:input type="text" path="firstName"/>
			<span>last Name</span>
			<form:input type="text" path="lastName"/>
			<br>
			<span>Country</span>
			<form:select path="country">
				<form:option value="germany" label="germany" />
			</form:select>
			<button type="submit">add</button>
		</form:form>
	</body>
</html>