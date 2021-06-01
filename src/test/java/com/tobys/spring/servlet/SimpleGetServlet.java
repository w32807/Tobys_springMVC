package com.tobys.spring.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SimpleGetServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.getWriter().print("<HTML><BODY>");
        resp.getWriter().print("Hello " + req.getParameter("name"));
        resp.getWriter().print("</BODY></HTML>");
    }
}
