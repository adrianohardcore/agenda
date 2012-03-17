<head>
<title>Vraptor Agenda 2 | Agenda [Editar]</title>
</head>
<body>

	<form id="agendaForm"
		action="${pageContext.request.contextPath}/agenda" method="post">

		<div class="formulario">

			<input type="hidden" name="agenda.id"   value="${agenda.id}" />			
<%-- 			<input type="hidden" name="agenda.agddtalt" value="${agenda.agddtalt}" />  --%>
			<input type="hidden" name="agenda.agdusr" value="${agenda.agdusr}" /> 
			<input type="hidden" name="agenda.agduf4" value="${agenda.agduf4}" /> 
			<input type="hidden" name="agenda.agduf5" value="${agenda.agduf5}" /> 
			<input type="hidden" name="agenda.agdddd4" value="${agenda.agdddd4}" /> 
			<input type="hidden" name="agenda.agdddd5" value="${agenda.agdddd5}" /> 
			<input type="hidden" name="agenda.agdtel4" value="${agenda.agdtel4}" /> 
			<input type="hidden" name="agenda.agdtel5" value="${agenda.agdtel5}" /> 
			<input type="hidden" name="agenda.agdcont4" value="${agenda.agdcont4}" />
			<input type="hidden" name="agenda.agdcont5" value="${agenda.agdcont5}" /> 
			<input type="hidden" name="agenda.agdRPL" value="${agenda.agdRPL}" /> 
			<input type="hidden" name="agenda.agdEndNr" value="${agenda.agdEndNr}" />
			<input type="hidden" name="agenda.agdEndCompl" value="${agenda.agdEndCompl}" /> 
				
			<div class="celula">	
			<label> Código </label>			
				<input disabled type="text" id="id" name="agenda.id" maxlength="40"
					value="${agenda.id}" /><br>
			</div>


			<div class="celula">
				<label>Nome</label>

				<textarea maxlength="40" name="agenda.agdnome">${agenda.agdnome}
				</textarea>
				<br>
			</div>
			
			<div class="celula">
				<label>Atividade</label> <input type="text" id="agdativ"
					name="agenda.agdativ" maxlength="30" value="${agenda.agdativ}" /><br>
			</div>
			
			<div class="celula">
				<label>Endereço</label>

				<textarea maxlength="40" name="agenda.agdend">${agenda.agdend}
				</textarea>

				<br>
			</div>
			
			<div class="celula">
				<label>Bairro</label> <input type="text" id="agdativ"
					name="agenda.agdbai" maxlength="30" value="${agenda.agdbai}" /><br>
			</div>
			
			<div class="celula">
				<label>Cidade</label> <input type="text" id="agdativ"
					name="agenda.agdcid" maxlength="30" value="${agenda.agdcid}" /><br>
			</div>
			
			<div class="celula">
				<label>UF</label> <input class="uf maiusculo" type="text"
					id="agdativ" name="agenda.agduf" maxlength="2"
					value="${agenda.agduf}" /><br>
			</div>
			
			<div class="celula">
				<label>Cep</label> <input class="cep" type="text" id="agdativ"
					name="agenda.agdcep" maxlength="40" value="${agenda.agdcep}" /><br>
			</div>
			
			<div class="celula">
				<label>MD</label> <input type="text" id="agdativ"
					name="agenda.dmdcod" maxlength="40" value="${agenda.dmdcod}" /><br>
			</div>
			
			<div class="celula">
				<label>Email</label>
				<textarea maxlength="100" name="agenda.agdemail">${agenda.agdemail}</textarea>					
			</div>
			
			<div class="celula">
				<label>Site</label>

				<textarea maxlength="100" name="agenda.agdsite">${agenda.agdsite}
					</textarea>
			</div>
			
			<br clear="none">
			
			<p></p>
			
		</div>	
			
			<br clear="all">
			
			
			
			
	<div>			
	<table class="table table-bordered tablemargin">
		<thead>
			<tr>
				<th>UF</th>
				<th>DDD</th>
				<th>Telefone</th>
				<th>Contato</th>				
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>
				<input class="uf maiusculo" type="text" name="agenda.agduf1" maxlength="4" value="${agenda.agduf1}" />
				</td>
				<td>
				<input class="ddd" type="text" name="agenda.agdddd1" maxlength="4" value="${agenda.agdddd1}" />
				</td>
				<td>
				<input class="telefone" type="text" id="agdativ" name="agenda.agdtel1" maxlength="40" value="${agenda.agdtel1}" />				
				</td>				
				<td>				
				<textarea maxlength="100" name="agenda.agdcont1">${agenda.agdcont1}</textarea>			
				</td>
			</tr>
			
			
			<tr>
				<td>
				<input class="uf maiusculo" type="text" name="agenda.agduf2" maxlength="4" value="${agenda.agduf2}" />
				</td>
				<td>
				<input class="ddd" type="text" name="agenda.agdddd2" maxlength="4" value="${agenda.agdddd2}" />
				</td>
				<td>
				<input class="telefone" type="text" id="agdativ" name="agenda.agdtel2" maxlength="40" value="${agenda.agdtel2}" />				
				</td>				
				<td>				
				<textarea maxlength="100" name="agenda.agdcont2">${agenda.agdcont2}</textarea>				
				</td>
			</tr>
			
			
			
			<tr>
				<td>
				<input class="uf maiusculo" type="text" name="agenda.agduf3" maxlength="4" value="${agenda.agduf3}" />
				</td>
				<td>
				<input class="ddd" type="text" name="agenda.agdddd3" maxlength="4" value="${agenda.agdddd3}" />
				</td>
				<td>
				<input class="telefone" type="text" id="agdativ" name="agenda.agdtel3" maxlength="40" value="${agenda.agdtel3}" />				
				</td>				
				<td>				
				<textarea maxlength="100" name="agenda.agdcont3">${agenda.agdcont3}</textarea>	
							
				</td>
			</tr>
			
			
			
		</tbody>
	</table>
	</div>
			
			
			
			
			
			
			
			
			
			<div class="formulario">
			
			
			
			
			
			
			<div class="celula">
				<label>Info</label>

				<textarea maxlength="200" name="agenda.agdobs2">${agenda.agdobs2}
					</textarea>
			</div>
			
			<div class="celula">
				<label>Observações</label>

				<textarea maxlength="1000" name="agenda.agdobs">${agenda.agdobs}
					</textarea>


			</div>
			
			<div class="datausr">
				<label for="input01">Data Última Alteração</label> <input
					type="text" name="agenda.agddtalt" maxlength="40"
					value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${agenda.agddtalt}" />  "
					disabled /> <br>
			</div>
			
			<div class="datausr">
				<label for="input01">Usuário</label> <input type="text"
					name="agenda.agdusr" maxlength="40" value="${agenda.agdusr}"
					disabled /><br>
			</div>
			

			<div class="form-actions">
				<button type="submit" class="btn btn-primary">Salvar</button>
				<!--             <button type="reset" class="btn">Cancel</button> -->
			</div>
		</div>
	</form>

	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							$('#agendaForm')
									.validate(
											{
												rules : {
													"agenda.agdnome" : {
														required : true,
														minlength : 3,
														maxlength : 40
													},
													"agenda.agdemail" : {
														email : true
													}
												},
												errorElement : "label",
												errorPlacement : function(
														error, element) {
													error.insertBefore(element);
												},

												messages : {
													"agenda.agdnome" : {
														required : "O campo Nome é obrigatorio.",
														minlength : "O campo nome deve conter no mínimo 3 caracteres."
													},
													"agenda.agdemail" : {
														email : "Favor , inserir um email válido."
													}
												}
											});
						});
	</script>
	<script type="text/javascript">
		
	</script>

</body>










