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

        user = new User("Max", "02.04.2003", "123");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

        switch (action) {
            case "authorization":
            	request.getRequestDispatcher("/WEB-INF/jsp/authorization.jsp").forward(request, response);
                break;
            case "registration":
            	request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp").forward(request, response);	
        		break;
            default:
            	System.out.println("Error");
                break;
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        
        if ("register".equals(action)) {
    		user.setLogin(request.getParameter("login"));
    		user.setDateOfBirthday(request.getParameter("dateOfBirthday"));
    		user.setPassword(request.getParameter("password"));
    		
    		request.setAttribute("user", user);
    		
    		request.getRequestDispatcher("/WEB-INF/jsp/resultAuth.jsp").forward(request, response);	
        }
        else if ("login".equals(action)) {
        	request.setAttribute("user", user);
        	if(request.getParameter("login").equals(user.getLogin()) && request.getParameter("password").equals(user.getPassword())) {
            	request.getRequestDispatcher("/WEB-INF/jsp/resultAuth.jsp").forward(request, response);
        	}
        	else {
        		System.out.println("Invalid login or password");
            	request.getRequestDispatcher("/WEB-INF/jsp/authorization.jsp").forward(request, response);
        	}
        }
	}

}
