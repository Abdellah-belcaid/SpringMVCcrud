<%@ include file="includes/header.jspf"%>
<body>
	<%@ include file="includes/navbar.jspf"%>
	<div class="container ">
		<div class="row">
			<div class="col s12 m12 ">
				<div class="card white darken-3">
					<div class="card-content dark">
						<span class="card-title">Register</span>
						<div class="row">
							<form class="col s12 " action="/Register" method="Post">
								<div class="row">
									<div class="input-field col s6">
										<i class="material-icons prefix">perm_identity</i> <input
											id="username" name=username type="text" class="validate"
											required> <label for="username">UserName</label>
									</div>
									<div class="input-field col s6">
										<i class="material-icons prefix">https</i> <input
											id="password" name="password" type="password"
											class="validate" required> <label for="password">Password
										</label>
									</div>
								</div>
								<input type="submit" value="Save"
									class="waves-effect waves-light btn-small" /> <input
									type="reset" value="Reset"
									class="waves-effect waves-light btn-small" />
							</form>
						</div>
					</div>
					<div class="card-action">
						<p>
							if you already have an account just <a href="#">login</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>