package com.example.ss10;

import java.io.*;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CustomerServlet", value = "/customer-servlet")
public class CustomersServlet extends HttpServlet {
    private static List<Customers> list;
    static {
        list = new ArrayList<>();
        list.add(new Customers(1,"Mai Văn Hoàn","1983-08-20","Hà Nội"));
        list.add(new Customers(2,"Nguyễn Văn Nam","1983-08-21","Bắc Giang"));
        list.add(new Customers(1,"Nguyễn Thái Hòa","1983-08-22","Nam Định"));
        list.add(new Customers(1,"Trần Đăng Khoa","1983-08-17","Hà Tây"));
        list.add(new Customers(1,"Nguyễn Đình Thi","1983-08-19","Hà Nội"));
    }

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("list",list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
        requestDispatcher.forward(request,response);
    }

    public void destroy() {
    }
}