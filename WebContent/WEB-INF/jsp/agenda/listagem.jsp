<head>
<title>Agenda | Contatos [listagem]</title>
</head>
<body>
	<div class="gridy-search">
		<h2>Pesquisar</h2>
		<div class="gridy-search-content"></div>
	</div>
	<div>
		<table class="table-gridy" id="grid"></table>
	</div>
	<script type="text/javascript">
		$(function() {
			$('#grid').gridy(
					{
						buttonMax : 5,
						clickFx : true,

						evenOdd : true,
						find : 'agdnome',
						findsName : [ [ 'agdnome', 'Nome' ],
								[ 'agdativ', 'Atividade' ],
								[ 'agdcid', 'Cidade' ] ],
						headersName : [ [ 'agdnome', 'Nome' ],
								[ 'agdativ', 'Atividade' ],
								[ 'agdcid', 'Cidade' ], [ 'agdddd1', 'DDD' ],
								[ 'agdtel1', 'Telefone' ],
								[ 'agdcont1', 'Contato' ] ],
						hoverFx : false,
						url : '${pageContext.request.contextPath}/agenda/gridy'
					});
		});
	</script>
	<script id="template" type="text/x-jquery-tmpl">
		<tr>
			<td>\${agdnome}</td>
			<td>\${agdativ}</td>
			<td>\${agdcid}</td>
			<td>\${agdddd1}</td>
			<td>\${agdtel1}</td>
			<td>\${agdcont1}</td>	
			<td class="gridy-button">
				<form action="${pageContext.request.contextPath}/agenda/\${id}" method="get">
					<input  type="submit" value="exibir"/>
				</form>
			</td>
			<td class="gridy-button">
				<form action="${pageContext.request.contextPath}/agenda/\${id}/editar" method="get">
					<input  type="submit" value="editar"/> 
				</form>
			</td>
			<td class="gridy-button">
				<form action="${pageContext.request.contextPath}/agenda/\${id}" method="post">
					<input type="hidden" name="_method" value="delete"/>
					<input onclick="return confirm('Deseja realmente excluir este registro?')" type="submit" value="remover"/>
				</form>
			</td>
		</tr>
	</script>
</body>





