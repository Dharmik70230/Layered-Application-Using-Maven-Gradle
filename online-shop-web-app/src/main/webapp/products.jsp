

<%@page import="java.util.List"%>
<%@page import="com.phoenix.web.contorllers.ProductAllServlet"%>
<%@page import="com.phoenix.daos.ProductDao"%>
<%@page import="com.phoenix.data.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product..</title>
</head>
<body style="background-color:#00de86">
	<jsp:include page="header.html"></jsp:include>
	<%
	HttpSession ss = request.getSession(false);
	if (ss != null) {
		List<Product> products =(List<Product>)ss.getAttribute("products");
	%>
	<h2>Dear <%=ss.getAttribute("user")%>, Select Products;</h2>
	<table  border = 1px >
	<tr>
		<td>Product ID</td>
		<td>Name</td>
		<td>Brand</td>
		<td>Price</td>
	</tr>
	<% for(Product product : products){ %>
	<tr>
	<td><%= product.getId() %></td>
	<td><%= product.getName() %></td>
	<td><%= product.getBrand() %></td>
	<td><%= product.getPrice() %></td>
	</tr>
		<% } %>
	</table>
	<%
	} else {
	%>
	<h2>Sorry! No Session</h2>
	<%
	}
	%>
	<jsp:include page="footer.html"></jsp:include>
</body>
</html>