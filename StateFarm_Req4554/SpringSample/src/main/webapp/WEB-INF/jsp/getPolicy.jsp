<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>Add new policy</h1>

	<form:form modelAttribute="form">
		<form:errors path="" element="div" />
		<div>
			<form:label path="policyId">Policy ID</form:label>
			<form:input path="policyId" />
			<form:errors path="policyId" />
		</div>
		<div>
			<input type="submit" />
		</div>
	</form:form>
</body>
</html>
