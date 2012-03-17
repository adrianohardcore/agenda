function existe(id) {
	$
	.ajax({
		method : 'get',
		url : "existe/"	+ id,
			dataType : 'html',
			beforeSend : function() {
				$('#carregando').show(100);
			},
			complete : function() {
				$('#carregando').hide(100);
			},  
			success : function(retorno) {
				console.log(retorno);  
				$('body').html(retorno);				
			},
			error : function(retorno) {
				console.log(retorno);
				if (retorno.status == 404) {
					$('#dusrForm').html(
							'Houve um erro: ' + retorno.status + ' '
							+ retorno.statusText);
				} else {
					$('#dusrForm')
					.html(
					'Houve um erro desconhecido entre em contato com o administrador.');
				}
			}
	});
}

function existe2(id) {
	$.get("existe/" + id,
			function call_back(data) {
				$('body').html(data);	
			});
}


