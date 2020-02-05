<%@ include file="header.jsp" %>

<c:out value="hello world"/>
<br/>
<c:set var="name" value="tanu"></c:set>
<c:out value="${name}"></c:out>
<br>
<br>
<c:if test="${name.equals('tanu')}">
  <p>name is tanu</p>
</c:if><br>
loop with array: <br>
<c:forEach var="i" items="1,2,3,4,22,45,67,89,344">
<c:choose>
<c:when test="${i%2==0}">
<p><c:out value="${i}"/>is even</p>
</c:when>
<c:when test="${i%2!=0}">
<p><c:out value="${i}"/>is odd</p>
</c:when>
<c:otherwise><p>not a number</p></c:otherwise>
</c:choose>
</c:forEach>
<c
</body>
</html>