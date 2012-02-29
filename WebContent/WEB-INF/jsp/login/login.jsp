<body>
	<form id="loginForm" class="well form-inline"
		action="${pageContext.request.contextPath}/autenticar" method="post">
		<input type="text" maxlength="4" class="required input-small" placeholder="Usuário"  
			name="dusr.id" value="${dusr.id}" required
		> 
		<input type="password"
			class="input-small" placeholder="Senha" name="dusr.dusrsenha"
			value="${dusr.dusrsenha}"
		>
		<button type="submit" class="btn">Acessar</button>
	</form>
<!-- 	<script type="text/javascript"> -->
<!-- 		$("#loginForm").validate(); -->
<!-- 	</script> -->
</body>