/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

/**
 *
 * @author jweit
 */
public class HomeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
            if(session.getAttribute("user") != null) {
                 response.sendRedirect("home");
            } else {
                  response.sendRedirect("login");
            }
               
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        AccountService as = new AccountService();
        String UserName = request.getParameter("username");
        String Password = request.getParameter("password");
        if (as.login(UserName, Password) != null) {
            User user = as.login(UserName, Password);
            session.setAttribute("user", user);
             getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
            
        } else {
            request.setAttribute("loginMessage", "wrong login details, homie" );
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        
    }

}
