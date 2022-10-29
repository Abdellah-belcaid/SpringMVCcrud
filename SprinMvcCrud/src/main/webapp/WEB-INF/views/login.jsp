<%@ include file="includes/header.jspf"%>
<body>
	<%@ include file="includes/navbar.jspf"%>
	<div class="container ">
		<div class="row">
			<div class="col s12  ">
				<div class="card">
					<div class="card-action teal lighten-1 white-text">
						<h3>Login Form</h3>
					</div>
					<form action="/login" method="POST">
						<input type="hidden" name="${_csrf.parameterName }"
							value="${_csrf.token }">
						<div class="card-content">
							<div class="form-field">
								<label for="username">Username</label> <input type="text"
									id="username" name="username" required>
							</div>
							<br>
							<div class="form-field">
								<label for="password">Password</label> <input type="password"
									id="password" name="password" required>
							</div>
							<br>
							<div class="red lighten-1 white-text ">
								<c:if test="${param.error!=null }">
							<h6 class="center">invalid username or password</h6>
								</c:if>
							</div>
							<br>
							<div class="form-field">
								<button type="submit" class="btn-large waves-effect waves-dark"
									style="width: 100%;">Login</button>
							</div>
							<br>
						</div>
					</form>
				</div>
			</div>
		</div>




	</div>
</body>
</html>