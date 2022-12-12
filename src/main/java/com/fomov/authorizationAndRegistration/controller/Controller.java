package com.fomov.authorizationAndRegistration.controller;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.fomov.authorizationAndRegistration.bean.User;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Controller() {
    }
    
    private User user;

    public void init(ServletConfig config) throws ServletException {
        super.init();

        user = new User("maksimfomov26@gmail.com", "02.04.2003", "123");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if("authorization".equals(action)) {
			request.getRequestDispatcher("/WEB-INF/jsp/authorization.jsp").forward(request, response);
		}
		else if("registration".equals(action)) {
			request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp").forward(request, response);
		}
		else {
			System.out.println("Error");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        
        if ("register".equals(action)) {
        	if(request.getParameter("password").equals(request.getParameter("confirmPassword")) && request.getParameter("email") != "" && request.getParameter("password") != "" && request.getParameter("dateOfBirthday") != "") {
        		String dateOfBirthday = "";
            	var arrayOfStrings = request.getParameter("dateOfBirthday").split("-");
            	for(int i = 2; i >= 0; --i) {
           			dateOfBirthday += arrayOfStrings[i];
           			if(i != 0) {
               			dateOfBirthday += ".";
           			}
           		}
        		
        		user.setEmail(request.getParameter("email"));
        		user.setDateOfBirthday(dateOfBirthday);
        		user.setPassword(request.getParameter("password"));
        		
        		request.setAttribute("user", user);
        		request.getRequestDispatcher("/WEB-INF/jsp/resultAuth.jsp").forward(request, response);	
        	}
        	else {
         		System.out.println("Passwords do not match or you did not complete all the fields");
            	request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp").forward(request, response);
        	}
        }
        else if ("login".equals(action)) {
        	if(request.getParameter("email").equals(user.getEmail()) && request.getParameter("password").equals(user.getPassword())) {
            	request.setAttribute("user", user);
            	request.getRequestDispatcher("/WEB-INF/jsp/resultAuth.jsp").forward(request, response);
        	}
        	else {
        		System.out.println("Invalid login or password");
            	request.getRequestDispatcher("/WEB-INF/jsp/authorization.jsp").forward(request, response);
        	}
        }
		else {
			System.out.println("Error");
		}
	}

}
