/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sukhpal
 */
@WebServlet(urlPatterns = {"/HomeServlet"})
public class HomeServet extends HttpServlet {

 
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request,response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        
         String login1 = request.getParameter("username");
        String login2 = request.getParameter("username");
        String password = request.getParameter("password");
     
        
     if(login1 == login1 || password == password) {
                request.setAttribute("login1", "abe");
                request.setAttribute("hello", true);
              getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request,response);
    
            }
     else if(login2 == login2 || password == password) {
                request.setAttribute("login1", "barb");
                request.setAttribute("hello2", true);
              getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request,response);
    
            }
     
    }

}