package com.servlets;

import javax.servlet.*;
import java.io.*;
import java.util.*;

public class FirstServlet implements Servlet{


    ServletConfig conf;

    public void init(ServletConfig conf){

        this.conf=conf;
        System.out.println("creating object.....");

    }

    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
    {

        System.out.println("Servicing");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> this is my output from servlet method:</h1>");
        out.println("<h1>Today's date and time is approx " + (new Date()).toString() + "</h1>" );
        for(int i = 0 ; i<=5 ; i++){


            out.println("<h"+i+"> Today's date and time is approx " + (new Date()).toString()  + "</h"+i+">");


        }



    }

    public void destroy(){

        System.out.println("Going to destroy servlet object");


    }

    //non lifecycle object

    public ServletConfig getServletConfig(){

        return this.conf;

    }

    public String getServletInfo()
    {

        return " this Servlet is created by Gursimar Singh ";


    }














}
