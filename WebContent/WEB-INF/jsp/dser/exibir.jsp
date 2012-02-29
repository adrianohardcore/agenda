<head>
<title>Vraptor Agenda 2 | Serialização [listagem]</title>
</head>
<body>
	<table class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>

				<th></th>
				<th></th>
				<th>Est</th>
				<th>Parâmetro</th>
				<th>Nome</th>
				<th>Serial</th>
				<th>Dt.Alt</th>
				<th>Par1</th>
				<th>Par2</th>
				<th>Par3</th>
				<th>Par4</th>
				<th>Hist</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>
					<form
						action="${pageContext.request.contextPath}/dser/${dser.id.dserest}/${dser.id.dserpar}/editar"
						method="get">
						<input type="submit" value="Editar" />
					</form>
				</td>
				<td>
					<form
						action="${pageContext.request.contextPath}/dser/${dser.id.dserest}/${dser.id.dserpar}"
						method="post">
						<input type="submit" value="Excluir" />
					</form>
				</td>
				<td>${dser.id.dserest}</td>
				<td>${dser.id.dserpar}</td>
				<td>${dser.dsernome}</td>
				<td>${dser.dserserial}</td>
				<td>${dser.dserdtalt}</td>
				<td>${dser.dserpar1}</td>
				<td>${dser.dserpar2}</td>
				<td>${dser.dserpar3}</td>
				<td>${dser.dserpar4}</td>
				<td>${dser.dserhis}</td>
			</tr>
		</tbody>
	</table>
</body>




