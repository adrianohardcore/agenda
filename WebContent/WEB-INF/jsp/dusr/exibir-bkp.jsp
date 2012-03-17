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
<%-- 	<img src="${pageContext.request.contextPath}/dusr/${dusr.id}/imagem" alt="${not empty dusr.dusrnome ? dusr.dusrnome : dusr.nomeOriginal}" width="120" height="130" /><br/><br/> --%>

	<form action="${pageContext.request.contextPath}/dusr/${dusr.id}/imagem" enctype="multipart/form-data" method="post">
		<input type="file" name="file"/>
		<p>
		<input type="submit" value="enviar"/>
	</form><br/><br/>
	
	<form action="${pageContext.request.contextPath}/dusr/${dusr.id}/imagem" method="post">
		<input type="hidden" name="_method" value="delete"/>
		<input type="submit" value="remover imagem"/>
	</form><br/><br/>
	

</body>




