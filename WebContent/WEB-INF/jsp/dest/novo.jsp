<head>
<title>Vraptor Agenda 2 | Serializa��o [Editar]</title>
</head>
<body>

	<form id="dserForm" action="${pageContext.request.contextPath}/dser"
		method="post">
		<div class="formulario">


			<div class="celula">
				<label>Estabelecimento</label> <input type="text" class="integer"
					placeholder="Estabelecimento Base" name="dser.id.dserest"
					maxlength="10" value="${dser.id.dserest}" />
			</div>

			<div class="celula">
				<label>Par�metro</label> <input class="maiusculo" type="text" placeholder="Par�metro"
					name="dser.id.dserpar" maxlength="15" value="${dser.id.dserpar}" />
			</div>


			<div class="celula">
				<label">Nome</label>

				<textarea maxlength="60" placeholder="Descri��o do Par�metro"
					name="dser.dsernome">${dser.dsernome}
						</textarea>
				<br>
			</div>

			<div class="celula">
				<label>Serial</label> <input type="text" class="integer"
					placeholder="Serial" name="dser.dserserial" maxlength="14"
					value="${dser.dserserial}" / onkeypress="Numero(event)"><br>
			</div>



			
			<div class="celula">
				<label>Par 1</label> <input class="integer" type="text"
					placeholder="Par�metro 1" name="dser.dserpar1" maxlength="10"
					value="${dser.dserpar1}" /><br>
			</div>

			<div class="celula">
				<label>Par 2</label> <input class="integer" type="text"
					placeholder="Par�metro 2" name="dser.dserpar2" maxlength="10"
					value="${dser.dserpar2}" /><br>
			</div>


			<div class="celula">
				<label>Par 3</label> <input class="numeric" type="text"
					placeholder="Par�metro 3" name="dser.dserpar3" maxlength="16"
					value="${dser.dserpar3}" /><br>
			</div>

			<div class="celula">
				<label>Par 4</label> <input type="text" placeholder="Par�metro 4"
					name="dser.dserpar4" maxlength="20" value="${dser.dserpar4}" /><br>
			</div>

			<div class="celula">
				<label>Obs</label>

				<textarea id="descricao" maxlength="60" name="dser.dserhis"
					placeholder="Hist�rico / Observa��o">${dser.dserhis}
						</textarea>
			</div>
		</div>

		<div class="datausr">
			<label>Usu�rio</label> <input type="text" class="input-medium"
				placeholder="Usu�rio" disabled name="dser.dserusr" maxlength="40"
				value="${dser.dserusr}" />
		</div>
		<div class="datausr">
			<label>Data</label> <input type="text" class="input-medium"
				placeholder="Dt.Altera��o" disabled name="dser.dserdtalt"
				value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dser.dserdtalt}" />  " />
		</div>

<!-- 		<br clear="all"> -->















		<div class="form-actions">
			<button type="submit" class="btn btn-primary">Salvar</button>
		</div>



	</form>

	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							$('#dserForm')
									.validate(
											{
												rules : {
													"dser.id.dserest" : {
														required : true,
														maxlength : 5
													},

													"dser.id.dserpar" : { //email
														required : true
													},
													"dser.dserserial" : {
														number : true
													}

												},
												errorElement : "label",
												errorPlacement : function(
														error, element) {
													error.insertBefore(element);
												},
												messages : {
													"dser.id.dserest" : {
														required : "O campo Estabelecimento � obrigatorio.",
														maxlength : "O campo Estabelecimento deve conter no m�ximo 5 n�meros ."
													},
													"dser.id.dserpar" : {
														required : "O campo Par�metro � obrigatorio."
													},
													"dser.dserest" : {
														number : "Campo num�rico."
													}
												}
											});
						});
	</script>
</body>




