<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/includes/header.html" %>

<h2>Thanks for joining our email list</h2>
<p>Here is the information that you entered:</p>

<ul>
  <li><strong>Email:</strong> ${user.email}</li>
  <li><strong>First Name:</strong> ${user.firstName}</li>
  <li><strong>Last Name:</strong> ${user.lastName}</li>
</ul>

<form action="${pageContext.request.contextPath}/" method="get">
  <input type="submit" value="Return">
</form>

<%@ include file="/includes/footer.jsp" %>
