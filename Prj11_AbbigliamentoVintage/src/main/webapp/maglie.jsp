<%@page import="java.util.List"%>
<%@page import="model.Maglia"%>
<main>
  <div class="container">

    <h1>
      <%=request.getAttribute("titolo")%>
    </h1>

	<table class="table">
	
		<tr>
			<th>Scritta</th>
			<th>Colore</th>
			<th>Taglia</th>
			<th>Prezzo</th>
		
		</tr>
		<% for (Maglia m : ((List<Maglia>)request.getAttribute("maglie"))){ %>
		<tr>
			<th><%m.getScritta(); %></th>
			<th><%m.getColore(); %></th>
			<th><%m.getTaglia(); %></th>
			<th><%m.getPrezzo(); %></th>
		
		</tr>
		
		<%} %>
	</table>





  </div>

</main>