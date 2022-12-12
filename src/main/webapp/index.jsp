<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<section class="container forms">
			<div class="form login">
		    	<div class="form-content">
		    		<header>Servlet auth project</header>
		    		<form method="get" action="Controller">
		    			<input type="hidden" name="action" value="authorization" /> 
		    			<div class="field button-field">
			        		<button>Login</button>
			        	</div>
		    		</form>
		    		<form method="get" action="Controller">
		    			<input type="hidden" name="action" value="registration" /> 
		    			<div class="field button-field">
			        		<button>Register</button>
			        	</div>
		    		</form>
			    </div>
			</div>
		</section>
	</body>
</html>