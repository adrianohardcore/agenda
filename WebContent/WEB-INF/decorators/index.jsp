<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<jsp:include page="../fragmentos/cabecalho.jsp" />
	<div class="container">
		<jsp:include page="../fragmentos/topo.jsp" />

		<!-- Conteudo
      ================================================== -->		
		
		<div id="conteudo">
			<c:if test="${not empty error}">${error}</c:if>
			<c:if test="${not empty message}">			
				<div class="alert alert-info">${message}</div>
			</c:if>
			<c:forEach var="error" items="${errors}">
				<div class="alert alert-error">${error.category} -
					${error.message}</div>					
			</c:forEach>
			<decorator:body />
		</div>

		<!-- Rodap�
      ================================================== -->
		<jsp:include page="../fragmentos/rodape.jsp" />
	</div>
</body>
</html>