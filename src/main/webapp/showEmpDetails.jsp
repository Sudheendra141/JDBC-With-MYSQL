<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@page import="entity.*"%>
<%@page import="dao.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee data</title>
<link rel="stylesheet" href="showEmpDetails.css">
</head>
<body>
<table>
<caption>Employee Details</caption>
<thead>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Department</th>
<th>Salary</th>
</tr>
</thead>
<tbody>
<tr>

<%
ArrayList<Employee> al=(ArrayList<Employee>)request.getAttribute("empDetails");

for(Employee e:al)
{
	out.print("<tr>");
	System.out.println(e.getLastName());
	out.print("<td>  "+e.getId() +" </td>");
	out.print("<td>  "+e.getFirstName() +" </td>");
	out.print("<td>  "+e.getLastName()+" </td>");
	out.print("<td>  "+e.getDepartment() +" </td>");
	out.print("<td>  "+e.getSalary() +" </td>");
	out.print("</tr>");
}	

%>



</tr>

</tbody>
</table>

</body>
</html>