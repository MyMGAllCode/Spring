<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="studentSearch.jsp"></jsp:include>
<html>
<body>

<c:choose>
<c:when test="${studentResult.size()>0}">
<table style="border:1px; text-align: center;">
<tr><th>Student id</th><th>Student Name</th><th>Student Course </th><th> Student Fees</th></tr>
<c:forEach items="${studentResult}" var="sResult">
<tr>
<td>${sResult.sId}</td>
<td>${sResult.sName}</td>
<td>${sResult.course}</td>
<td>${sResult.fee}</td>


</tr>




</c:forEach>



</table>


</c:when>
<c:otherwise>

<c:out value="No Record Found "></c:out>
</c:otherwise>



</c:choose>
</body>
</html>