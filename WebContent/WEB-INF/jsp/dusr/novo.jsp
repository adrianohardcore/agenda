<head>
<title>Novo Usuário</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/dusrNovo.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#carregando').hide(100);
		$('#id').blur(function() {
			//existe($("#id").attr('value'));
		});
		$('#existe').click(function() {
			existe($("#id").attr('value'));
		});
		$('#existe2').live('click', function() {
			existe($("#id").attr('value'));
		});

		$('#existe3').live("click", function() {
			$(this).after("	Another paragraph!");
		});

		$('#existe4').live("click", function() {
			$('#existe4').after("	Another paragraph!");
		});

		$('#existe5').click(function() {
			$('#dusrForm').load('existe/2 #dusrForm', function() {
				$('pre').text($('#dusrForm').html());
			});
		});

		$('#valor').click(function() {
			alert("Código: " + $("#id").attr('value'));
		});

	});
</script>
</head>
<body>
	<form id="dusrForm" action="${pageContext.request.contextPath}/dusr"
		method="post">
		<div id="formulario">
			<div>
				<span id="carregando">carregando..</span>
			</div>
			<div class="celula">
				<label>Usuário</label> <input type="text" class="integer"
					placeholder="Código do Usuário" name="dusr.id" maxlength="4"
					id="id" value="${dusr.id}" />
			</div>
			<div class="celula">
				<label>Nome</label> <input class="maiusculo" type="text"
					placeholder="Nome" name="dusr.dusrnome" maxlength="20"
					value="${dusr.dusrnome}" />
			</div>
			<div class="celula">
				<label>Senha</label> <input id="senha" class="required"
					type="password" placeholder="Senha" name="dusr.dusrsenha"
					maxlength="10" value="${dusr.dusrsenha}" />
			</div>
			<div class="celula">
				<label>Repetição Senha</label> <input id="confirmacao"
					type="password" equalTo="#senha" placeholder="Senha confirmação"
					name="senha2" maxlength="10" value="${senha2}" />
			</div>
			<div class="datausr">
				<label>Usuário Alteração</label> <input type="text"
					class="input-medium" placeholder="Usuário" disabled
					name="dusr.dusrusr" maxlength="40" value="${dusr.dusrusr}" />
			</div>
			<div class="datausr">
				<label>Data Alteração</label> <input type="text"
					class="input-medium" placeholder="Dt.Alteração" disabled
					name="dusr.dusrdtalt"
					value=" <fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrdtalt}" />" />
			</div>
			<!-- 		<br clear="all"> -->
		</div>
		<div class="form-actions">
			<button type="submit" class="btn btn-primary">Salvar</button>
			<button type="button" class="btn btn-primary" id="valor">Valor</button>
			<button type="button" class="btn btn-primary" id="existe">Existe</button>
			<button type="button" class="btn btn-primary" id="existe2">Existe2</button>
			<button type="button" class="btn btn-primary" id="existe3">Existe3</button>
			<button type="button" class="btn btn-primary" id="existe4">Existe4</button>
			<button type="button" class="btn btn-primary" id="existe5">Existe5</button>
		</div>
	</form>


	<script type="text/javascript">
		$("#dusrForm").validate();
	</script>
</body>




