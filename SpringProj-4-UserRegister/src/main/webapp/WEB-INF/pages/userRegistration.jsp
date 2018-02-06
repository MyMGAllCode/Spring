<%@page  isELIgnored="false" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<body>


<div align="center">
<spring:message code="user.regForm"/>
<h1 style="text-align: center; color: green; font-size: large;">${msg}</h1>
<form:form action="registerform" method="post" commandName="user" ><br/>
<spring:message code="user.userId"/>:<form:input path="userId"/><br/>
<spring:message code="user.name"/>:<form:input path="name"/><br/>
<spring:message code="user.mobile"/>:<form:input path="mobile"/><br/>
<spring:message code="user.city"/>:<form:input path="city"/><br/>
<spring:message code="user.state"/>:<form:input path="state"/><br/>
<spring:message code="user.education"/>:<form:input path="education"/><br/>
<spring:message code="user.jobtype"/>:<form:input path="jobtype"/><br/>
<spring:message code="user.salary"/>:<form:input path="salary"/><br/>
<input type="submit" value="Register">



</form:form>



</div>

</body>

</html>
