<head>
<title>Vraptor Agenda 2 | Usuário [Editar]</title>
</head>
<body>
	<script type="text/javascript">
		$(function() {
			var senha = $("#senha"), senha2 = $("#senha2"), allFields = $([])
					.add(senha).add(senha2), tips = $(".validateTips");

			function updateTips(t) {
				tips.text(t).addClass("ui-state-highlight");
				setTimeout(function() {
					tips.removeClass("ui-state-highlight", 1500);
				}, 500);

			}

			function ehIgual(o, n) {
				//if ( o.val().length > max || o.val().length < min ) {
				if (o.val() != n.val()) {
					n.addClass("ui-state-error");
					updateTips("Atençao , as senhas não comferem !");
					return false;
				} else {
					return true;
				}
			}

			$('#tabs').tabs();
			$("#dialog").dialog(
					{
						autoOpen : false,
						show : "blind",
						hide : "blind",
						modal : true,
						buttons : {
							"Comfirmar" : function() {
								var bValid = true;
								allFields.removeClass("ui-state-error");
								bValid = bValid && ehIgual(senha, senha2);
								if (bValid) {
									$("#users tbody").append(
											"<tr>" + "<td> abc" + "</td>"
													+ "</tr>");
									$(this).dialog("close");
								}
							},
							Cancel : function() {
								$(this).dialog("close");
							}
						},
						close : function() {
							allFields.val("").removeClass("ui-state-error");
						}
					});

			$("#opener").click(function() {
				$("#dialog").dialog("open");
				return false;
			});

		});
	</script>



	<form id="dusrForm" action="${pageContext.request.contextPath}/dusr/atualiza" method="post" enctype="multipart/form-data">
		<div class="formulario">

			<%-- 			<input type="hidden" name="dusr.id" value="${dusr.id}" />  --%>
			<%-- 			<input type="hidden" name="dusr.dusrnome" value="${dusr.dusrnome}" />  --%>
			<input type="hidden" name="dusr.dusrsenha" value="${dusr.dusrsenha}" />
			<%-- 			<input type="hidden" name="dusr.dusrdtnas" value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrdtnas}" />" /> --%>
			<%-- 			<input type="hidden" name="dusr.dusrstabl" value="${dusr.dusrstabl}" /> --%>
			<input type="hidden" name="dusr.dusrend" value="${dusr.dusrend}" />
			<input type="hidden" name="dusr.dusrbai" value="${dusr.dusrbai}" />
			<input type="hidden" name="dusr.dusrcid" value="${dusr.dusrcid}" />
			<input type="hidden" name="dusr.dusrcep" value="${dusr.dusrcep}" />
			<input type="hidden" name="dusr.dusrddd" value="${dusr.dusrddd}" />
			<input type="hidden" name="dusr.dusrtel" value="${dusr.dusrtel}" />
			<input type="hidden" name="dusr.dusresp" value="${dusr.dusresp}" />
			<input type="hidden" name="dusr.dusrobs" value="${dusr.dusrobs}" />
			<%-- 			<input type="hidden" name="dusr.dusrCPF" value="${dusr.dusrCPF}" /> --%>
			<input type="hidden" name="dusr.dusrHab" value="${dusr.dusrHab}" />
			<input type="hidden" name="dusr.dusrRepB" value="${dusr.dusrRepB}" />
			<input type="hidden" name="dusr.dusrEstB" value="${dusr.dusrEstB}" />
			<input type="hidden" name="dusr.dusrdtalt"
				value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrdtalt}" />" />
			<%-- 			<input type="hidden" name="dusr.dusrusr" value="${dusr.dusrusr}" /> --%>
			<%-- 			<input type="hidden" name="dusr.dusrnomec" value="${dusr.dusrnomec}" /> --%>
			<input type="hidden" name="dusr.dusrCaixa" value="${dusr.dusrCaixa}" />
			<input type="hidden" name="dusr.dusrLocal" value="${dusr.dusrLocal}" />
			<input type="hidden" name="dusr.dusrPar1" value="${dusr.dusrPar1}" />
			<input type="hidden" name="dusr.dusrPar2" value="${dusr.dusrPar2}" />
			<input type="hidden" name="dusr.dusrMsg" value="${dusr.dusrMsg}" />
			<input type="hidden" name="dusr.dusrEspec" value="${dusr.dusrEspec}" />
			<input type="hidden" name="dusr.dusrPdescto"
				value="${dusr.dusrPdescto}" /> <input type="hidden"
				name="dusr.dusrSerial" value="${dusr.dusrSerial}" /> <input
				type="hidden" name="dusr.dusrPar3" value="${dusr.dusrPar3}" /> <input
				type="hidden" name="dusr.dusrpar4" value="${dusr.dusrpar4}" /> <input
				type="hidden" name="dusr.dusrpar5" value="${dusr.dusrpar5}" /> <input
				type="hidden" name="dusr.dusrRPL" value="${dusr.dusrRPL}" /> <input
				type="hidden" name="dusr.dusrXestB" value="${dusr.dusrXestB}" /> <input
				type="hidden" name="dusr.dusrEstB2" value="${dusr.dusrEstB2}" /> <input
				type="hidden" name="dusr.dusrEstB3" value="${dusr.dusrEstB3}" /> <input
				type="hidden" name="dusr.dusrMtip" value="${dusr.dusrMtip}" /> <input
				type="hidden" name="dusr.dusrUF" value="${dusr.dusrUF}" /> <input
				type="hidden" name="dusr.dusrHabVal"
				value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrHabVal}" />" />
			<input type="hidden" name="dusr.dusrPDV" value="${dusr.dusrPDV}" />
			<input type="hidden" name="dusr.dusrdtacessoU"
				value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrdtacessoU}" />" />
			<input type="hidden" name="dusr.dusrnrECF" value="${dusr.dusrnrECF}" />
			<input type="hidden" name="dusr.dusrXemp" value="${dusr.dusrXemp}" />
			
			<input type="hidden" name="dusr.dusrGav01" value="${dusr.dusrGav01}" />
			<input type="hidden" name="dusr.dusrdtadm"
				value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrdtadm}" />" />
			<input type="hidden" name="dusr.dusrFotoBext" value="${dusr.dusrFotoBext}" /> 
			<input type="hidden" name="dusr.dusrAEprof" value="${dusr.dusrAEprof}" /> 
			<input type="hidden" name="dusr.dusrConect01" value="${dusr.dusrConect01}" />
			<input type="hidden" name="dusr.dusrAEacervoB" value="${dusr.dusrAEacervoB}" /> 
			<input type="hidden" name="dusr.dusrXAEacervoB" value="${dusr.dusrXAEacervoB}" /> 
			<input type="hidden" name="dusr.dusrCcusto" value="${dusr.dusrCcusto}" />
			<input type="hidden" name="dusr.dusrCdepto" value="${dusr.dusrCdepto}" /> 
			<input type="hidden" name="dusr.dusrMTAB" value="${dusr.dusrMTAB}" /> 
			<input type="hidden" name="dusr.dusrMatTransfEst"
				value="${dusr.dusrMatTransfEst}" /> <input type="hidden"
				name="dusr.dusrMatTransfDep" value="${dusr.dusrMatTransfDep}" /> <input
				type="hidden" name="dusr.dusrMatGer" value="${dusr.dusrMatGer}" />
			<input type="hidden" name="dusr.dusrRPLb" value="${dusr.dusrRPLb}" />
			<input type="hidden" name="dusr.dusrSACGer"
				value="${dusr.dusrSACGer}" /> <input type="hidden"
				name="dusr.dusrEndNr" value="${dusr.dusrEndNr}" /> <input
				type="hidden" name="dusr.dusrEndCompl" value="${dusr.dusrEndCompl}" />
			<input type="hidden" name="dusr.dusrDiasRetroativo"
				value="${dusr.dusrDiasRetroativo}" /> <input type="hidden"
				name="dusr.dusrDiasPosterior" value="${dusr.dusrDiasPosterior}" />
			<input type="hidden" name="dusr.dusrPerfil"
				value="${dusr.dusrPerfil}" />


			<div id="tabs" class="tabs">

				<ul>
					<li><a href="#tabs-1">Dados I</a></li>
					<li><a href="#tabs-2">Dados II</a></li>
					<li><a href="#tabs-3">Rotinas</a></li>
				</ul>

				<div id="tabs-1">
					<div class="celula">
						<img src="${pageContext.request.contextPath}/dusr/${dusr.id}/imagem" width="120" height="130" />
					</div>

					<div class="celula">
						<label>Usuário</label> <input type="text" class="integer"
							placeholder="Código do Usuário" name="dusr.id" maxlength="4"
							value="${dusr.id}" />
					</div>

					<div class="celula">
						<label>Nome</label> <input class="maiusculo" type="text"
							placeholder="Nome" name="dusr.dusrnome" maxlength="20"
							value="${dusr.dusrnome}" />
					</div>

					<div class="celula">
						<label>Nome Completo</label> <input class="maiusculo" type="text"
							placeholder="Nome Completo" name="dusr.dusrnomec" maxlength="40"
							value="${dusr.dusrnome}" />
					</div>

				</div>
				<div id="tabs-2">

					<div class="celula">
						<label>Status</label> <select name="dusr.dusrstabl">

							<c:forEach items="${UsuarioStatus}" var="status">
								<option value="${status}"
									<c:if test="${dusr.dusrstabl eq status}">selected="selected"</c:if>>${status.label}</option>
							</c:forEach>
						</select>
					</div>


					<div class="celula">
						<label>Data Nascimento</label> <input type="text" placeholder=""
							id="datepicker" name="dusr.dusrdtnas"
							value=" <fmt:formatDate pattern="dd/MM/yyyy" value="${dusr.dusrdtnas}" />" />
					</div>

					<div class="celula">
						<label>CPF</label> <input type="text" placeholder=""
							name="dusr.dusrCPF" value="${dusr.dusrCPF}" />
					</div>
				</div>
				<div id="tabs-3">


					<div class="celula">
						<label>Foto</label> <input type="file" name="foto" />
					</div>
				</div>

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
			<div class="form-actions">
				<button type="submit" class="btn btn-primary">Salvar</button>
				<button type="button" class="btn btn-primary" id="opener">Trocar
					Senha</button>
			</div>
		</div>
	</form>






	<div id="dialog" title="Alterar Senha">
		<p class="validateTips">Digite a senha 2 vezes igualmente.</p>

		<form>
			<fieldset>
				<label for="senha">Senha</label> <input type="password" name="name"
					id="senha" class="text ui-widget-content ui-corner-all" /> <label
					for="senha2">Comfirmação de senha</label> <input type="password"
					name="email" id="senha2" value=""
					class="text ui-widget-content ui-corner-all" />
			</fieldset>
		</form>
	</div>


	<script type="text/javascript">
		$("#dusrForm").validate();
		$(function() {
			console.log('Ready! (:');

			$('input#datepicker').datepicker({
				dateFormat : 'dd/mm/yy',
				changeMonth : true,
				changeYear : true,
				minDate : '-90Y',
				maxDate : '-7Y'
			});
		});
	</script>
</body>




