<%@ include file="includes/header.jspf"%>
<body>
	<%@ include file="includes/navbar.jspf"%>


	<div class="row">
		<div class="col s12 m6">
			<div class="card white darken-1">
				<div class="card-content dark">
					<span class="card-title">add Book</span>
					<div class="row">
						<form class="col s12" action="/Books/add" method="POST">
							<div class="row">
								<div class="input-field col s6">
									<i class="material-icons prefix">title</i> <input
										id="icon_prefix" name="title" type="text" class="validate" required>
									<label for="icon_prefix">Book Title</label>
								</div>
								<div class="input-field col s6">
									<i class="material-icons prefix">perm_identity</i> <select
										name="author_id" required >										
										<c:forEach items="${Authors}" var="author">
											<option value="${author.id}">${author.getFullName()}</option>
										</c:forEach>
									</select> <label> Author</label>
								</div>
							</div>
							<div class="row">
								<div class="input-field col s6">
									<i class="material-icons prefix">date_range</i> <input
										id="icon_prefix" name="publishDate" type="date"
										class="validate" required> <label for="icon_prefix">Publish
										Date</label>
								</div>
								<div class="input-field col s6">
									<i class="material-icons prefix">attach_money</i> <input
										id="icon_telephone" name="price" type="number" class="validate" required>
									<label for="icon_telephone">Price</label>
								</div>
							</div>
							<div class="row">
								<div class="input-field col s6">
									<i class="material-icons prefix">receipt</i> <input
										id="icon_prefix" name="amount" type="number" class="validate" required>
									<label for="icon_prefix">Amount</label>
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

		<div class="col s12 m6">
			<div class="card white darken-1">
				<div class="card-content dark">
					<span class="card-title">add Author</span>
					<div class="row">
						<form class="col s12" action="/Authors/add" method="Post">							
							<div class="row">
								<div class="input-field col s6">
									<i class="material-icons prefix">perm_identity</i> <input
										id="firstName" name="firstName" type="text" class="validate" required>
									<label for="firstName">First Name</label>
								</div>
								<div class="input-field col s6">
									<i class="material-icons prefix">perm_identity</i> <input
										id="lastName" name="lastName" type="text" class="validate" required>
									<label for="lastName">Last Name</label>
								</div>
							</div>
							<div class="row">
								<div class="input-field col s6">
									<i class="material-icons prefix">date_range</i> <input
										id="birthDate" name="birthDate" type="date" class="validate" required>
									<label for="birthDate">Birth Date</label>
								</div>
								<div class="input-field col s6">
									<i class="material-icons prefix">location_on</i> <input
										id="address" name="address" type="text" class="validate" required>
									<label for="address">Address</label>
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