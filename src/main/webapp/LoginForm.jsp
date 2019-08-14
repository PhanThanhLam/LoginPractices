<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Login</title>

<!-- Our CSS stylesheet file -->
<link rel="stylesheet" href="assets/css/styles.css" />
<script src="assets/js/jquery.js"></script>
<script src="assets/js/script.js" type="text/javascript"></script>
</head>

<body>

	<div class="materialContainer">


		<form class="box">

			<div class="title">LOGIN</div>

			<div class="input">
				<label for="name">Username</label> <input type="text" name="name"
					id="name"> <span class="spin"></span>
			</div>

			<div class="input">
				<label for="pass">Password</label> <input type="password"
					name="pass" id="pass"> <span class="spin"></span>
			</div>

			<div class="button login">
				<button>
					<span>GO</span> <i class="fa fa-check"></i>
				</button>
			</div>

			<a href="" class="pass-forgot">Forgot your password?</a>

		</form>

		<div class="overbox">
			<div class="material-button alt-2">
				<span class="shape"></span>
			</div>

			<div class="title">REGISTER</div>

			<div class="input">
				<label for="regname">Username</label> <input type="text"
					name="regname" id="regname"> <span class="spin"></span>
			</div>

			<div class="input">
				<label for="regpass">Password</label> <input type="password"
					name="regpass" id="regpass"> <span class="spin"></span>
			</div>

			<div class="input">
				<label for="reregpass">Repeat Password</label> <input
					type="password" name="reregpass" id="reregpass"> <span
					class="spin"></span>
			</div>

			<div class="button">
				<button>
					<span>NEXT</span>
				</button>
			</div>


		</div>

	</div>

</body>
</html>