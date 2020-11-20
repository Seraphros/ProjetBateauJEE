package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Hello World en GET!!!</h3>");
        out.println("<a href='/demo_war'><- Retour</a>");

        out.println("<h1 style='color:darkgreen'>FNAME : " + request.getParameter("fname") + "</h1>");
        out.println("<h1 style='color:darkred'>LNAME : " + request.getParameter("lname") + "</h1>");

        for (int i = 1; i<10; i++) {
            out.println("<h1 style='color:darkorange'>" + i + "</h1>");
        }

        //
        //

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Hello World en  POST!!!</h3>");
        out.println("<a href='/demo_war'><- Retour</a>");

        out.println("<h1 style='color:darkgreen'>FNAME : " + request.getParameter("fname") + "</h1>");
        out.println("<h1 style='color:darkred'>LNAME : " + request.getParameter("lname") + "</h1>");

        for (int i = 1; i<11; i++) {
            out.println("<h1 style='color:darkorange'>" + i + "</h1>");
        }
    }
}