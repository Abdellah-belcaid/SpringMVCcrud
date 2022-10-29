<%@ include file="includes/header.jspf"%>
<body >
	<%@ include file="includes/navbar.jspf"%>

	<div class="row">
		<div class="col s12 ">
			<div class="card teal  lighten-1">
				<div class="card-content white-text">
					<span class="card-title">Books list</span>

					<table>
						<thead>
							<tr>
								<th>#</th>
								<th>Title</th>
								<th>Author</th>
								<th>price</th>
								<th>Amount</th>
								<th>publishDate</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${Books}" var="book">
								<tr>
									<td>${book.getId() }</td>
									<td>${book.getTitle() }</td>
									<td>${book.getAuthor().getFullName()}</td>
									<td>${book.getPrice() }</td>
									<td>${book.getAmount() }</td>
									<td>${book.getPublishDate() }</td>
									<td><a href="/Books/update/${book.getId()}"
										class="waves-effect waves-light btn-small tooltipped"
										data-position="bottom" data-tooltip="Edit the book">Edit</a> <a
										href="/Books/delete/${book.getId()}"
										class="waves-effect waves-light btn-small red">Delete</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="card-action">
					<a href="/Books-Authors/add">add a Book</a>
				</div>
			</div>
		</div>
	</div>
	<hr>
	<div class="row">
		<div class="col s12 ">
			<div class="dark-text lighten-1">									
					<div class="slider">
						<ul class="slides">
							<c:forEach items="${Books}" var="book">
								<li><img src="https://picsum.photos/640/360">
									<!-- random image -->
									<div class="caption center-align">
										<h3>${book.getTitle() }</h3>
										<h5 class="light dark-text text-lighten-3">Author :
											${book.getAuthor().getFullName()}</h5>
											<h6 class=" light dark-text text-lighten-3">Price :
											${book.getPrice()} Dhs</h6>
									</div></li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
		</div>
	




	<%@ include file="includes/footer.jspf"%>
</body>
</html>