<%@ include file="../../../tiles/taglibs.jsp" %>

<div class="container-fluid">
			<h4>Borrar evento</h4>
			<form:form id="SearchEventoForm" modelAttribute="SearchEventoForm" action="" method="POST">
				<div class="form-group">
					<label for="InputIdFase">Fase</label> 
					<form:select path="idFase">
	      				<c:forEach items="${ListaFases}" var="fase">
	      					<form:option value="${fase.idFase}" label="${fase.nombre}"/>
	      				</c:forEach>
	 				</form:select>
	 				<button type="submit" class="btn btn-primary">Buscar</button>
 				</div>
				
			</form:form>
</div>

<div class="container-fluid">
	<h3>${FaseNombre}</h3>
	<c:forEach items="${ListaEventos}" var="evento">
		<h3 style="color:blue">${evento.fechaTexto} <a href="${'updateEvento/'}${evento.idEvento}"><i class="fa fa-pencil" aria-hidden="true"></i></a> <a href="${'deleteEvento/'}${evento.idEvento}"><i class="fa fa-trash" aria-hidden="true"></i></a></h3>
		<p><b>${evento.titulo}</b></p>
		<h6 class="text-primary">${FaseNombre} | ${evento.ley}</h6>  
	</c:forEach>
</div>


 


