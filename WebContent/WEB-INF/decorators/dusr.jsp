<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title><decorator:title default="Vraptor Agenda" /></title>
<jsp:include page="../fragmentos/cabecalho.jsp" />
<decorator:head></decorator:head>
</head>



<body>
	<jsp:include page="../fragmentos/menugeral.jsp" />

	<div class="container">

		<!-- Topo - Sub Menu
      ================================================== -->
		<jsp:include page="../fragmentos/menudusr.jsp" />
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
		<!-- Rodapé
      ================================================== -->
		<jsp:include page="../fragmentos/rodape.jsp" />
	</div>
</body>
</html>