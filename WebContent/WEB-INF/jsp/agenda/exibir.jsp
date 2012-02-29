<head>
<title>Vraptor Agenda 2 | Agenda [Exibir]</title>
</head>
<body>
	<table id="grid"
		class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>


				<th>Nome</th>
				<th>Atividade</th>
				<th>Cidade</th>
				<th>DDD</th>
				<th>Tel</th>
				<th>Contato</th>
				<th>Email</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>

			<tr>
				<td>${agenda.agdnome}</td>
				<td>${agenda.agdativ}</td>
				<td>${agenda.agdcid}</td>
				<td>${agenda.agdddd1}</td>
				<td>${agenda.agdtel1}</td>
				<td>${agenda.agdcont1}</td>
				<td>${agenda.agdemail}</td>
				<td><a class="btn btn-info"
					href="${pageContext.request.contextPath}/agenda/${agenda.id}/editar"><i
						class="icon-pencil icon-white"></i> Editar</a></td>
				<td>
					<form
						action="${pageContext.request.contextPath}/agenda/${agenda.id}"
						method="post">
						<input type="hidden" name="_method" value="delete" /> <input
							class="btn btn-danger " type="submit" value="Remover" />
					</form>
				</td>
			</tr>

		</tbody>
	</table>
</body>




