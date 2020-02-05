
<%@page import="java.util.Date"%>
<%@include file = "header.jsp" %>

   <% 
    Date date = new Date();
   out.println(date);
   %>
   <%= date %>
   <br>
   <%= getSum(3,4) %>
   
   <%! 
    public static int getSum(int a, int b){
	   return a+b;
   }
   %>
</body>
</html>