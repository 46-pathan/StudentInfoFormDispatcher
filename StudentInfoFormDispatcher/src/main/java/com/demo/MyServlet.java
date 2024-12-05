package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */

//Write above Java program and print fetched data on another jsp using expression 
//language. 


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String gender=request.getParameter("gender");
		String password=request.getParameter("password");
		
		System.out.println("firstname: "+fname);
		System.out.println("lastname: "+lname);
		System.out.println("email: "+email);
		System.out.println("mobile: "+mobile);
		System.out.println("gender: "+gender);
		System.out.println("password: "+password);
		
		request.setAttribute("fname",fname);
		request.setAttribute("lname",lname);
		request.setAttribute("email",email);
		request.setAttribute("mobile",mobile);
		request.setAttribute("gender",gender);
		request.setAttribute("password",password);
		
		request.getRequestDispatcher("/display.jsp").forward(request,response);
	}

}
