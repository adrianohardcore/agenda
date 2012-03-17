<head>
<title>Vraptor Agenda 2 | Usuário [Editar]</title>
</head>
<body>

	<script type="text/javascript">
		$(document).ready(function() {
			//alert("teste" + $("#id"));
			//$("#id").hide();
			
			function aviso(){				
				alert('Atenção!!!');				
			}

			//$("button").click(function() {
			$("#teste").click(function() {
				$("p").hide("slow");
			});

			$("#teste2").click(function() {
				$("p").show();
			});

			$("#teste3").click(function() {
				$("p").fadeOut();
			});

// 			$("p").click(function() {
// 				$(this).hide();
// 			});

			$(".flip").click(function() {
				$(".panel").slideToggle("slow");
			});
			
			 $("#teste4").click(function(){
				    $(".flip").after(" ATENÇÂO.");
			});
			 
			$("#teste5").click(function(){
				    $("h2").css("background-color","yellow");
			});			
			
			
			$("#teste6").click(function(event) {
				$(".campo").load('../../agenda/agenda',aviso());
			});
			
			$("#teste7").click(function(event) {				
				var acao = $("#id").attr('value');		  		
				$(".campo2").load('existe',{acc:acao});				
			});
			
			$('#teste8').click(function(){
				alert($('#id').attr('value'));				
			});
			
			

		});
	</script>




	<form id="dusrForm"
		action="${pageContext.request.contextPath}/dusr/existe" method="post">
		<input type="text" name="dusr.id" id="id" value="${dusr.id}" /> 
		<input type="submit" value="Existe" />


		<h2>Isto é um titulo</h2>
		<p>Isto é um parágrafo.</p>
		<p>Isto é mais um parágrafo.</p>
		<input type="button" name="button" value="hide" id="teste"> 
		<input type="button" name="button" value="show" id="teste2"> 
		<input type="button" name="button" value="fadeOut" id="teste3">
		<input type="button" name="button" value="Atenção" id="teste4">
		<input type="button" name="button" value="Amarelo" id="teste5">
		<input type="button" name="button" value="Ret texto" id="teste8">
		<input type="button" name="button" value="Ajax Teste1" id="teste6">
		<input type="button" name="button" value="Ajax Teste2" id="teste7">
		
		<p>
		<div class="panel">
			<h2>Texto</h2>
		</div>

		<p class="flip">Mostrar / Esconder</p>
		
		<div class="campo" style="background: gray">
		campo de teste
		
		</div>
		
		<div class="campo2" style="background: gray">
		campo de teste
		
		</div>



	</form>
</body>




