package com.fastrack.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password= request.getParameter("password");

        // In a real app, save to DB (for now, just log it)
        System.out.println("New user registered: " + username + " | " + email);

        // Redirect to login after successful registration
        response.sendRedirect("login.jsp?success=registered");
    }
}
