<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Edit User">
  <h1>Edit User</h1>
  <form method="POST" action="${pageContext.request.contextPath}/EditUser">
    <input type="hidden" name="user_id" value="${user.id}"/>
    <div>
      <label for="username">Username:</label>
      <input type="text" id="username" name="username" value="${user.username}" required/>
    </div>
    <div>
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" value="${user.email}" required/>
    </div>
    <div>
      <label for="password">Password:</label>
      <input type="password" id="password" name="password"/>
    </div>
    <button type="submit">Save</button>
  </form>
</t:pageTemplate>