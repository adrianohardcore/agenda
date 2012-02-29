<head>
<title>Agenda | Serialização [listagem]</title>
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
						find : 'id.dserpar',
						findsName : [ [ 'id.dserpar', 'Par' ],[ 'id.dserest', 'Estabelecimento' ],[ 'dsernome', 'Nome' ] ],
						headersName : [ [ 'id.dserest', 'Estabelecimento' ],[ 'id.dserpar', 'Parâmetro' ],[ 'dsernome', 'Nome' ],['dserserial','Serial']  ],
						hoverFx : false,
						url : '${pageContext.request.contextPath}/dser/gridy'
					});
		});
	</script>
	<script id="template" type="text/x-jquery-tmpl">
		<tr>
			<td>\${id.dserest}</td>
			<td>\${id.dserpar}</td>
			<td>\${dsernome}</td>
			<td>\${dserserial}</td>
	
			<td class="gridy-button">
				<form action="${pageContext.request.contextPath}/dser/\${id.dserest}/\${id.dserpar}" method="get">
					<input  type="submit" value="exibir"/>
				</form>
			</td>		

			<td class="gridy-button">
				<form action="${pageContext.request.contextPath}/dser/\${id.dserest}/\${id.dserpar}/editar" method="get">
					<input  type="submit" value="editar"/> 
				</form>
			</td>

			<td class="gridy-button">
				<form action="${pageContext.request.contextPath}/dser/\${id.dserest}/\${id.dserpar}" method="post">
					<input type="hidden" name="_method" value="delete"/>
					<input onclick="return confirm('Deseja realmente excluir este registro?')" type="submit" value="remover"/>
				</form>
			</td>
		</tr>
	</script>
</body>





