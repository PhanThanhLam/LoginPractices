<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Login</title>

<!-- Our CSS stylesheet file -->
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="assets/css/chpassw.css" />
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

</head>

<body>
	<form action="ChangePassword" method="Post" class="container bootstrap snippet">
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-6 col-md-offset-2">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h3 class="panel-title">
							<span class="glyphicon glyphicon-th"></span> Change password
						</h3>
					</div>
					<div class="panel-body">
						<div class="row">
							<div
								class="col-xs-6 col-sm-6 col-md-6 separator social-login-box">
								<br> <img alt="" class="img-thumbnail"
									src="https://bootdey.com/img/Content/avatar/avatar1.png">
							</div>
							<div style="margin-top: 80px;"
								class="col-xs-6 col-sm-6 col-md-6 login-box">
								<div class="form-group">
									<div class="input-group">
										<div class="input-group-addon">
											<span class="glyphicon glyphicon-lock"></span>
										</div>
										<input class="form-control" type="password" name="currentPw"
											placeholder="Current Password">
									</div>
								</div>
								<div class="form-group">
									<div class="input-group">
										<div class="input-group-addon">
											<span class="glyphicon glyphicon-log-in"></span>
										</div>
										<input class="form-control" type="password" name="newPw"
											placeholder="New Password">
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="panel-footer">
						<div class="row">
							<div class="col-xs-6 col-sm-6 col-md-6"></div>
							<div class="col-xs-6 col-sm-6 col-md-6">
								<button class="btn icon-btn-save btn-success" type="submit">
									<span class="btn-save-label"><i
										class="glyphicon glyphicon-floppy-disk"></i></span>save
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>