package com.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name = "ServletHello", value = "/ServletHello")
public class ServletHello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String number = request.getParameter("number");
        int p = Integer.parseInt(number);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        for(int i = 0 ; i<=p;i++) {

            out.println("<h"+i+">  Hello , i am a Mango" + "</h"+i+">");

        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
