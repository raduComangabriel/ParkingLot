<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Add Car">

  <form class="needs-validation" novalidate method="POST" action="${pageContext.request.contextPath}/AddCar">
    <h1>Add Car</h1>
    <div class="row">
      <div class="col-md-6 mb-3">
        <label for="license_plate">License Plate</label>
        <input type="text" class="form-control" id="license_plate" name="license_plate" placeholder="" value="" required>
        <div class="invalid-feedback">
          License Plate is required.
        </div>
      </div>
     <div class="row">
       <div class="col-md-6 mb-3">
         <label for="parking-spot">Parking Spot</label>
         <input type="text" class="form-control" id="parking-spot" name="parking-spot" placeholder="" value="" required>
         <div class="invalid-feedback">
           Parking Spot is required.
         </div>
       </div>
     </div>
      <div class="row">
        <div class="col-md-3">
          <label for="owner-id">Owner</label>
          <select class="custom-select d-block w-100" id="owner-id" name="owner-id" required>
            <option value="">Choose...</option>
            <c:forEach var="user" items="${users}" varStatus="status">
              <option value="${user.id}">${user.username}</option>
            </c:forEach>
          </select>
          <div class="invalid-feedback">
            Please select an owner.
          </div>
        </div>
      </div>
    </div>
  </form>
  <a class="w-20 btn btn-primary btn-lg mt-3" type="submit" href="${pageContext.request.contextPath}/Save">Save</a>
</t:pageTemplate>
