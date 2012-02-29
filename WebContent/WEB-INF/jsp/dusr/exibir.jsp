<head>
<title>Vraptor Agenda 2 | Usuário [Exibir]</title>
</head>
<body>
	<table class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>	
				<th></th>			
				<th></th>
				<th>Usuário</th>
				<th>Nome</th>
				<th>Nome Completo</th>				
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>
					<form
						action="${pageContext.request.contextPath}/dusr/${dusr.id}/editar"
						method="get">
						<input type="submit" value="Editar" />
					</form>
				</td>
				<td>
					<form
						action="${pageContext.request.contextPath}/dusr/${dusr.id}"
						method="post">
						<input type="submit" value="Excluir" />
					</form>
				</td>
				<td>${dusr.id}</td>
				<td>${dusr.dusrnome}</td>
				<td>${dusr.dusrnomec}</td>
			</tr>
		</tbody>
	</table>
</body>




