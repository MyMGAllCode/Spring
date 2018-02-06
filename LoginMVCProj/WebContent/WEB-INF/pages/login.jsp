<%@taglib uri="http://www.springframework.org/tags/form"  prefix="c"%>
<c:form commandName="loginCMD">
Username:<c:input path="userName" /><br>
password<c:input path="password" /><br>
	DOB:<c:input path="dob" /><br>
	<input type="submit" value="login">
</c:form>

