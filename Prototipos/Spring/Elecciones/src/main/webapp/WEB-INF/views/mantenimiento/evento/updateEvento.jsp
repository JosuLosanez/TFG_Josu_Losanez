<%@ include file="../../../tiles/taglibs.jsp" %>
<%@ page pageEncoding="UTF-8" %>
<div >
			<h4>Modificar evento</h4>
			<form:form id="eventoForm" modelAttribute="EventoForm" action="" method="POST">
				<div class="form-group">
					<label for="InputIdFase">Fase</label> 
					<form:select path="idFase">
						<form:option value="${Evento.PFase.idFase}" label="${Evento.PFase.nombre}" />
	      				<c:forEach items="${ListaFases}" var="fase">
	      				<c:if test="${fase.idFase ne Evento.PFase.idFase}">
	      					<form:option value="${fase.idFase}" label="${fase.nombre}" />
	      				</c:if>
	      				</c:forEach>
	 				</form:select>
 				</div>
				<div class="form-group">
					<label for="InputTitulo">Titulo</label> 
					<form:input type="text" path="titulo" class="form-control" id="InputTitulo" value="${Evento.titulo}"/> 
				</div>
				<div class="form-group">
					<label for="InputLey">Ley</label> 
					<form:input type="text" path="ley" class="form-control" id="InputLey" value="${Evento.ley}"/> 
				</div>
				<div class="form-group">
					<label for="InputFechaTexto">Fecha en texto </label> 
					<form:input type="text" path="fechaTexto" class="form-control" id="InputFechaTexto" value="${Evento.fechaTexto}"/> 
				</div>
				<div class="form-group">
					<label for="InputFechaInicio">Fecha Inicio  (${Evento.fechaInicio.toString().split(" ")[0]})</label> 
					<form:input type="date" path="fechaInicio" class="form-control" id="InputFechaInicio" value="${Evento.fechaInicio}"/> 
				</div>
				<div class="form-group">
					<label for="InputFechaFin">Fecha Fin  (${Evento.fechaFin.toString().split(" ")[0]})</label> 
					<form:input type="date" path="fechaFin" class="form-control" id="InputFechaFin" value="${Evento.fechaFin}"/> 
				</div>
			
				<button type="submit" class="btn btn-primary">Modificar evento</button>
			</form:form>
</div>


 


