<%@ include file="includes/header.jspf"%>
<body>
	<%@ include file="includes/navbar.jspf"%>

	<div class="row">
		<div class="col s12 ">
			<div class="card grey  darken-1">
				<div class="card-content white-text">
					<span class="card-title">Authors list</span>

					<table>
						<thead>
							<tr>
								<th>#</th>
								<th>first Name</th>
								<th>Last Name</th>
								<th>birthDate</th>
								<th>Address</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${Authors}" var="author">
								<tr>
									<td>${author.getId() }</td>
									<td>${author.getFirstName() }</td>
									<td>${author.getLastName()}</td>
									<td>${author.getBirthDate() }</td>
									<td>${author.getAddress()}</td>
									<td><a href="/Authors/update/${author.getId()}"
										class="waves-effect waves-light btn-small">Edit</a> <a
										href="/Authors/delete/${author.getId()}"
										class="waves-effect waves-light btn-small red">Delete</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="card-action grey  darken-2">
					<a href="/Books-Authors/add">add an Author</a>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="includes/footer.jspf"%>
</body>
</html>