package com.parking.parking_lot;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ejb.EJB;
import java.io.IOException;
import java.util.List;
import com.parking.parkinglot.common.UserDto;
import com.parking.parkinglot.ejb.UserBean;

@WebServlet(name = "usersServlet", value = "/Users")
public class HelloServlet extends HttpServlet {

    @EJB
    private UserBean userBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obține lista de utilizatori din UserBean
        List<UserDto> users = userBean.getAllUsers();

        // Setează lista de utilizatori ca atribut în cerere
        request.setAttribute("users", users);

        // Trimite cererea către users.jsp pentru afișare
        request.getRequestDispatcher("/WEB-INF/pages/users.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Obține parametrii trimiși din formularul HTML
        String username = request.getParameter("username");
        String email = request.getParameter("email");

        // Adaugă utilizatorul folosind UserBean
        userBean.addUser(username, email);

        // Redirecționează înapoi către pagina Users pentru a afișa lista actualizată
        response.sendRedirect(request.getContextPath() + "/Users");
    }
}
