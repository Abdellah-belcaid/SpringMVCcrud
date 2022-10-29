<%@ include file="includes/header.jspf"%>
<body>
	<%@ include file="includes/navbar.jspf"%>


	<div class="row">
		<div class="col s12 ">
			<div class="card white darken-1">
				<div class="card-content dark">
					<span class="card-title">add Author</span>
					<div class="row">
						<form class="col s12" action="/Authors/update" method="Post">
							<input type="hidden" name="id" value="${author.id}">
							<div class="row">
								<div class="input-field col s6">
									<i class="material-icons prefix">perm_identity</i> <input
										id="firstName" value="${author.firstName }" name="firstName"
										type="text" class="validate" required> <label
										for="firstName">First Name</label>
								</div>
								<div class="input-field col s6">
									<i class="material-icons prefix">perm_identity</i> <input
										id="lastName" value="${author.lastName }" name="lastName"
										type="text" class="validate" required> <label
										for="lastName">Last Name</label>
								</div>
							</div>
							<div class="row">
								<div class="input-field col s6">
									<i class="material-icons prefix">date_range</i> <input
										id="birthDate" value="${author.birthDate }" name="birthDate"
										type="date" class="validate" required> <label
										for="birthDate">Birth Date</label>
								</div>
								<div class="input-field col s6">
									<i class="material-icons prefix">location_on</i> <input
										id="address" value="${author.address }" name="address"
										type="text" class="validate" required> <label
										for="address">Address</label>
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
					<a href="#">This is a link</a> <a href="#">This is a link</a>
				</div>
			</div>
		</div>
	</div>






	<%@ include file="includes/footer.jspf"%>
</body>
</html>