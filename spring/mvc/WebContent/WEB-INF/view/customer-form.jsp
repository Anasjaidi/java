<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
			.err {
				color: red;
			}
		</style>
	</head>
	
	<body>
		<form:form action="processForm" modelAttribute="customer">
			<div>
				<label for="first-name">First Name</label>
				<form:input type="text" path="firstName" id="first-name"/>
			</div>
			<div>
				<label for="last-name">last Name</label>
				<form:input type="text" path="lastName" id="last-name"/>
				<form:errors path="lastName"  cssClass="err"/>
			</div>
			<form:button>add</form:button>
		</form:form>
	</body>
</html>