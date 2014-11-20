<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h1>SpringMVC example input</h1>

	<form:form modelAttribute="messageBean" action="${appUrl}/output">
		<p>
			<form:label path="message">
			Input message.
			</form:label>
			<form:input path="message" />
		<p>
			<input type="submit" name="submit" value="SUBMIT" />
	</form:form>
</body>
</html>
