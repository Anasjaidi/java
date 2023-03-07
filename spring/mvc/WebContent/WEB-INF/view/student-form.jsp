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
				<form:options items="${ student.countryOptions }"/>
				<%-- <form:option value="germany" label="germany" /> --%>
			</form:select>
			<div>
			<p>select language</p>
			<label for="c++">C++</label>
			<form:radiobutton path="language" value="c++" id="c++"/>
			<label for="js">js</label>
			<form:radiobutton path="language" value="js" id="js"/> 
			<label for="rust">rust</label>
			<form:radiobutton path="language" value="rust" id="rust" />
			</div>
			<div>
				<p>select operating systems</p>
				Macos <form:checkbox path="os" value="mac"/>
			windows <form:checkbox path="os" value="msw"/>
				linux<form:checkbox path="os" value="linux"/>
			</div>
			<button type="submit">add</button>
		</form:form>
	</body>
</html>