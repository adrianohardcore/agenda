<head>
<title>Vraptor Agenda 2 | Usuário [Editar]</title>
</head>
<body>

	<form id="dusrForm" action="${pageContext.request.contextPath}/dusr"
		method="post">
		<div class="formulario">

<%-- 			<input type="hidden" name="dusr.id" value="${dusr.id}" />  --%>
<%-- 			<input type="hidden" name="dusr.dusrnome" value="${dusr.dusrnome}" />  --%>
<%-- 				<input type="hidden" name="dusr.dusrsenha" value="${dusr.dusrsenha}" />  --%>
				<input type="hidden" name="dusr.dusrdtnas" value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrdtnas}" />" /> 
				<input type="hidden" name="dusr.dusrstabl" value="${dusr.dusrstabl}" /> 
				<input type="hidden" name="dusr.dusrend" value="${dusr.dusrend}" /> 
				<input type="hidden" name="dusr.dusrbai" value="${dusr.dusrbai}" /> 
				<input type="hidden" name="dusr.dusrcid" value="${dusr.dusrcid}" /> 
				<input type="hidden" name="dusr.dusrcep" value="${dusr.dusrcep}" /> 
				<input type="hidden" name="dusr.dusrddd" value="${dusr.dusrddd}" /> 
				<input type="hidden" name="dusr.dusrtel" value="${dusr.dusrtel}" /> 
				<input type="hidden" name="dusr.dusresp" value="${dusr.dusresp}" /> 
				<input type="hidden" name="dusr.dusrobs" value="${dusr.dusrobs}" /> 
				<input type="hidden" name="dusr.dusrCPF" value="${dusr.dusrCPF}" /> 
				<input type="hidden" name="dusr.dusrHab" value="${dusr.dusrHab}" /> 
				<input type="hidden" name="dusr.dusrRepB" value="${dusr.dusrRepB}" /> 
				<input type="hidden" name="dusr.dusrEstB" value="${dusr.dusrEstB}" /> 
<%-- 				<input type="hidden" name="dusr.dusrdtalt" value="${dusr.dusrdtalt}" />  --%>
				<input type="hidden" name="dusr.dusrusr" value="${dusr.dusrusr}" /> 
				<input type="hidden" name="dusr.dusrnomec" value="${dusr.dusrnomec}" /> 
				<input type="hidden" name="dusr.dusrCaixa" value="${dusr.dusrCaixa}" /> 
				<input type="hidden" name="dusr.dusrLocal" value="${dusr.dusrLocal}" /> 
				<input type="hidden" name="dusr.dusrPar1" value="${dusr.dusrPar1}" /> 
				<input type="hidden" name="dusr.dusrPar2" value="${dusr.dusrPar2}" /> 
				<input type="hidden" name="dusr.dusrMsg" value="${dusr.dusrMsg}" /> 
				<input type="hidden" name="dusr.dusrEspec" value="${dusr.dusrEspec}" /> 
				<input type="hidden" name="dusr.dusrPdescto" value="${dusr.dusrPdescto}" />
				<input type="hidden" name="dusr.dusrSerial" value="${dusr.dusrSerial}" />
				<input type="hidden" name="dusr.dusrPar3" value="${dusr.dusrPar3}" /> 
				<input type="hidden" name="dusr.dusrpar4" value="${dusr.dusrpar4}" /> 
				<input type="hidden" name="dusr.dusrpar5" value="${dusr.dusrpar5}" /> 
				<input type="hidden" name="dusr.dusrRPL" value="${dusr.dusrRPL}" /> 
				<input type="hidden" name="dusr.dusrXestB" value="${dusr.dusrXestB}" /> 
				<input type="hidden" name="dusr.dusrEstB2" value="${dusr.dusrEstB2}" /> 
				<input type="hidden" name="dusr.dusrEstB3" value="${dusr.dusrEstB3}" /> 
				<input type="hidden" name="dusr.dusrMtip" value="${dusr.dusrMtip}" /> 
				<input type="hidden" name="dusr.dusrUF" value="${dusr.dusrUF}" /> 
				<input type="hidden" name="dusr.dusrHabVal" value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrHabVal}" />" />
			    <input type="hidden" name="dusr.dusrPDV" value="${dusr.dusrPDV}" />
			    <input type="hidden" name="dusr.dusrdtacessoU" value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrdtacessoU}" />" />
			    
			    
			     
			    <input type="hidden" name="dusr.dusrnrECF" value="${dusr.dusrnrECF}" /> 
			    <input type="hidden" name="dusr.dusrXemp" value="${dusr.dusrXemp}" /> 				
				<input type="hidden" name="dusr.dusrFotoB" value="${dusr.dusrFotoB}" />				
				<input type="hidden" name="dusr.dusrGav01" value="${dusr.dusrGav01}" /> 
				<input type="hidden" name="dusr.dusrdtadm" value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrdtadm}" />" />				 
				<input type="hidden" name="dusr.dusrFotoBext" value="${dusr.dusrFotoBext}" />
			    <input type="hidden" name="dusr.dusrAEprof" value="${dusr.dusrAEprof}" />    
			    <input type="hidden" name="dusr.dusrConect01" value="${dusr.dusrConect01}" /> 
			    <input type="hidden" name="dusr.dusrAEacervoB" value="${dusr.dusrAEacervoB}" /> 
			    <input type="hidden" name="dusr.dusrXAEacervoB" value="${dusr.dusrXAEacervoB}" /> 
			    <input type="hidden" name="dusr.dusrCcusto" value="${dusr.dusrCcusto}" />
			    <input type="hidden" name="dusr.dusrCdepto" value="${dusr.dusrCdepto}" /> 
			    <input type="hidden" name="dusr.dusrMTAB" value="${dusr.dusrMTAB}" /> 
			    <input type="hidden" name="dusr.dusrMatTransfEst" value="${dusr.dusrMatTransfEst}" /> 
			    <input type="hidden" name="dusr.dusrMatTransfDep" value="${dusr.dusrMatTransfDep}" /> 
			    <input type="hidden" name="dusr.dusrMatGer" value="${dusr.dusrMatGer}" />
			    <input type="hidden" name="dusr.dusrRPLb" value="${dusr.dusrRPLb}" />
			    <input type="hidden" name="dusr.dusrSACGer" value="${dusr.dusrSACGer}" /> 
			    <input type="hidden" name="dusr.dusrEndNr" value="${dusr.dusrEndNr}" /> 
			    <input type="hidden" name="dusr.dusrEndCompl" value="${dusr.dusrEndCompl}" />
			    <input type="hidden" name="dusr.dusrDiasRetroativo" value="${dusr.dusrDiasRetroativo}" /> 
			    <input type="hidden" name="dusr.dusrDiasPosterior" value="${dusr.dusrDiasPosterior}" />
				<input type="hidden" name="dusr.dusrPerfil" value="${dusr.dusrPerfil}" />
				
				
				
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
				<label>Data Alteração</label> 
				<input type="text" class="input-medium" placeholder="Dt.Alteração" disabled name="dusr.dusrdtalt"
					value=" <fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${dusr.dusrdtalt}" />" 
				/>
			</div>
			<!-- 		<br clear="all"> -->
			<div class="form-actions">
				<button type="submit" class="btn btn-primary">Salvar</button>
			</div>	
	</form>
	<script type="text/javascript">
		$("#dusrForm").validate();
	</script>
</body>




