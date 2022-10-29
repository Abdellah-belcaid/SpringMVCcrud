<%@ include file="includes/header.jspf"%>
<body>
	<%@ include file="includes/navbar.jspf"%>



	<div class="section white">
		<div class="container ">
			<div class="row">
				<div class="col s12 ">
					<div class="card blue-grey darken-1">
						<div class="card-content white-text">
							<span class="card-title">Welcome ${user} </span>
							<p>this is a simple crud project using spring MVC and
								Hibernate Frameworks</p>
						</div>
						<div class="card-action">
							<a href="/login">Login</a>or you can <a href="Register">Register</a>if
							this is your first time
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>





</body>
</html>