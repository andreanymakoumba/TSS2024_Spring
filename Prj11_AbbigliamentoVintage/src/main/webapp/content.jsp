<main>
	<div class="container">

		<h1>
			<%=request.getAttribute("titolo")%>
		</h1>

		<div>
			<p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.
				Delectus illo hic necessitatibus deserunt unde facilis praesentium,
				velit rerum placeat? Vitae sapiente animi, dolor accusantium unde
				temporibus natus. Natus, ut consequatur! praesentium, velit rerum
				placeat? Vitae sapiente animi, dolor accusantium unde temporibus
				natus. Natus, ut consequatur!</p>
		</div>

		<%
		if (session.getAttribute("logged") != null && session.getAttribute("logged").equals("test")) {
		%>
			<h2> Benvenuto utente <%=session.getAttribute("logged")%></h2>
		<%
		} else {
		%>

		<form action="login" method="post">
			<input class="form-control" type="text" name="username" id="username"
				placeholder="username"> <input class="form-control"
				type="password" name="password" id="password" placeholder="password">
			<input class="btn" type="submit" value="Login">
		</form>
		<%
		}
		%>
	</div>

</main>