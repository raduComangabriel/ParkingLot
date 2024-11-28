package com.parking.parking_lot.entities;

import com.parking.parkinglot.common.UserDto;
import com.parking.parkinglot.ejb.UsersBean;
import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddCar", value = "/AddCar")
public class AddCar extends HttpServlet {

    @Inject
    UsersBean userBean;

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
    List<UserDto> users=userBean.findAllUsers();
    request.setAttribute("users", users);
    request.getRequestDispatcher("/WEB-INF/pages/addCar.jsp").forward(request,response);
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
}
}