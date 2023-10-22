<%@page import="java.util.*" %>

<% List<String> list= new ArrayList<>(); 
list.add("Mahesh");
list.add("charan");
list.add("kannaiah");
list.add("lachaiah");
list.add("mallamma");
list.add("ganga");

%>

<html>
<head>

</head>

<body>
 <div style="padding-left:500px;padding-top:30px">Table</div>
  <div style="padding-left:500px;padding-top:30px">
    <table >
    <tr>
     <th >Date</th>
     <th>Actions</th>
     </tr>
     <tr>
     <% if(list.size()==0){ %>
     <td colspan="4">
      No user details
     </td>
     <%} %>
     <% for( String s:list){%>
     <td>
     <%= s%>
     </td>
     <% String str="mahesh"; %>
      <td><form action="login.jsp"><button name="entrydate" type="submit" value="<%= str%>">View</button></form>
     </td>
     <td>
     <a href="">update</a>
     </td>
     <td>
     <a href="">Delete</a>
     </td>
     <tr></tr>
     <%} %>
    
     </tr>
    </table>
  </div>
</body>
</html>