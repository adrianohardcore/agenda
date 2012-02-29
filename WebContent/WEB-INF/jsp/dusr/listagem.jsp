<head>
<title>Agenda | Usuário [listagem]</title>
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
						find : 'dusrnome',
						findsName   : [ [ 'dusrnome', 'Nome' ],[ 'id', 'Usuário' ],[ 'dusnomec', 'Nome Completo']],
						headersName : [ [ 'id', 'Usuário' ],[ 'dusrnome', 'Nome' ],[ 'dusnomec', 'Nome Completo']],
						hoverFx : false,
						url : '${pageContext.request.contextPath}/dusr/gridy'
					});
		});
	</script>
	<script id="template" type="text/x-jquery-tmpl">
		<tr>
			<td>\${id}</td>
			<td>\${dusrnome}</td>
			<td>\${dusnomec}</td>			
	
			<td class="gridy-button">
				<form action="${pageContext.request.contextPath}/dusr/\${id}" method="get">
					<input  type="submit" value="exibir"/>
				</form>
			</td>		

			<td class="gridy-button">
				<form action="${pageContext.request.contextPath}/dusr/\${id}/editar" method="get">
					<input  type="submit" value="editar"/> 
				</form>
			</td>

			<td class="gridy-button">
				<form action="${pageContext.request.contextPath}/dusr/\${id}" method="post">
					<input type="hidden" name="_method" value="delete"/>
					<input onclick="return confirm('Deseja realmente excluir este registro?')" type="submit" value="remover"/>
				</form>
			</td>
		</tr>
	</script>
</body>





