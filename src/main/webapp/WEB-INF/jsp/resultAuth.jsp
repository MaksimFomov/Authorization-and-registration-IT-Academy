<%@ page language="java" contentType="text/html; charset=UTF-8"
   import="com.fomov.authorizationAndRegistration.bean.User" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- CSS -->
        <link rel="stylesheet" href="css/authentication.css">
                
        <!-- Boxicons CSS -->
        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
                        
    </head>
    
	<body>
		<jsp:useBean id="user" class="com.fomov.authorizationAndRegistration.bean.User" scope="request" />
		
		<section class="container forms">
			<div class="form login">
		    	<div class="form-content">
		    		<header>My details</header>
		    		<div class="form-link">
                        <span>
                        	Email:
                        	<jsp:getProperty property="email" name="user" />
                        </span>
                        <br/>
                        <span>
                        	Date of birthday:
                        	<jsp:getProperty property="dateOfBirthday" name="user" />
                        </span>
                        <br/>
                        <span>
                        	Password:
                        	<jsp:getProperty property="password" name="user" />
                        </span>
                    </div>
                    
                    <form method="get" action="Controller">
		    			<input type="hidden" name="action" value="authorization" /> 
		    			<div class="field button-field">
			        		<button>Exit</button>
			        	</div>
		    		</form>
			    </div>
			</div>
		</section>
	</body>
</html>