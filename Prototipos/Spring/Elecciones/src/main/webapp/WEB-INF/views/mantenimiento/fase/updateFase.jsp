<%@ include file="../../../tiles/taglibs.jsp" %>


<div >
			<h4>Modificar fase</h4>
			<form:form id="faseForm" modelAttribute="FaseForm" action="" method="POST">
				<div class="form-group">
					<label for="InputNombre">Nombre</label> 
					<form:input type="text" path="nombre" class="form-control" id="InputNombre" value="${Fase.nombre}"/> 
				</div>
				<div class="form-group">
					<label for="InputPrioridad">Prioridad</label> 
					<form:input type="number" path="prioridad" class="form-control" id="InputPrioridad" value="${Fase.prioridad}"/> 
				</div>	
				<button type="submit" class="btn btn-primary">Modificar fase</button>
			</form:form>
</div>


 


