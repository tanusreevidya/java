<%@page import="java.io.PrintWriter"%>
<%@include file="header.jsp" %> 
</html>
<body>
<%
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>
</body>
</html>