<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>Add new policy</h1>

	<form:form modelAttribute="form">
		<form:errors path="" element="div" />
		<div>
			<form:label path="name">Customer Name</form:label>
			<form:input path="name" />
			<form:errors path="name" />
			<br />
			<form:label path="policyType">Policy Type</form:label>
			<form:select name="policyType" path="policyType">
				<option value="Auto">Auto</option>
				<option value="Rental">Renters</option>
				<option value="Home">Home</option>
			</form:select>
			<form:errors path="policyType" />
		</div>
		<div>
			<input type="submit" />
		</div>
	</form:form>
</body>
</html>
