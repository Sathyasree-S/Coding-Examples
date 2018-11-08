<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1>Policy View Page</h1>

<ul>

	<c:if test="${getAllPolicies=='[]'}">
		<h4>No Active Policy!</h4>
	</c:if>
	<c:forEach items="${getAllPolicies}" var="policy">
		<c:out value="${items}"></c:out>
		<li>${policy}</li>
	</c:forEach>

</ul>