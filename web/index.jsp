<form action="${pageContext.request.contextPath}/emailList" method="post">
  <input type="hidden" name="action" value="add">
  <p>
    <label>Email:</label>
    <input type="email" name="email" required>
  </p>
  <p>
    <label>First Name:</label>
    <input type="text" name="firstName" required>
  </p>
  <p>
    <label>Last Name:</label>
    <input type="text" name="lastName" required>
  </p>
  <p><input type="submit" value="Join Now"></p>
</form>
