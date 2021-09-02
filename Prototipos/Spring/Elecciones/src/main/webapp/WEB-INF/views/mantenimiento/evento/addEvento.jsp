<%@ include file="../../../tiles/taglibs.jsp" %>

<div >
			<h4>Añadir evento</h4>
			<form:form id="eventoForm" modelAttribute="EventoForm" action="" method="POST" accept-charset="ISO-8859-1">
				<div class="form-group">
					<label for="InputIdFase">Fase</label> 
					<form:select path="idFase">
	      				<c:forEach items="${ListaFases}" var="fase">
	      					<form:option value="${fase.idFase}" label="${fase.nombre}" />
	      				</c:forEach>
	 				</form:select>
 				</div>
				<div class="form-group">
					<label for="InputTitulo">Titulo</label> 
					<form:input type="text" path="titulo" class="form-control" id="InputTitulo" /> 
				</div>
				<div class="form-group">
					<label for="InputLey">Ley</label> 
					<form:input type="text" path="ley" class="form-control" id="InputLey" /> 
				</div>
				<div class="form-group">
					<label for="InputFechaTexto">Fecha en texto</label> 
					<form:input type="text" path="fechaTexto" class="form-control" id="InputFechaTexto" /> 
				</div>
				<div class="form-group">
					<label for="InputFechaInicio">Fecha Inicio</label> 
					<form:input type="date" path="fechaInicio" class="form-control" id="InputFechaInicio" /> 
				</div>
				<div class="form-group">
					<label for="InputFechaFin">Fecha Fin</label> 
					<form:input type="date" path="fechaFin" class="form-control" id="InputFechaFin" /> 
				</div>
			
				<button type="submit" class="btn btn-primary">Añadir evento</button>
			</form:form>
</div>


 


