package com.example.ss9;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/discount-servlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double price = Float.parseFloat(request.getParameter("price"));
        double percent = Float.parseFloat(request.getParameter("percent"));

        double amount = price * percent * 0.01;
        double discountPrice = price + amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<p>Price: " + price + "</p>");
        writer.println("<p>Percent: " + percent + "</p>");
        writer.println("<p>Discount Amount: " + amount + "</p>");
        writer.println("<p>Discount Price: " + discountPrice + "</p>");
        writer.println("</html>");
    }
}