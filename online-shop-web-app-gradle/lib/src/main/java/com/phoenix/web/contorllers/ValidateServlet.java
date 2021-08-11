package com.phoenix.web.contorllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phoenix.exceptions.UserNotFoundExceptions;
import com.phoenix.web.models.LoginBean;
/* 
* Auther : Dharmik Maru
* Date : 26/06/2021
* Version : 2.0
* Copyright : Sterlite Technologies
* 
* */
/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String uname = request.getParameter("username");
		String password = request.getParameter("password");

		// create a instance of LoginBean and set the value
		LoginBean lgn = new LoginBean();
		request.setAttribute("ob", lgn);
		lgn.setUsername(uname);
		lgn.setPassword(password);

		PrintWriter out = response.getWriter();
		try {
			if (lgn.isValid()) {
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
				out.println("<h2 style ='color : red'>Invalid Login</h2>");
			}
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UserNotFoundExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
