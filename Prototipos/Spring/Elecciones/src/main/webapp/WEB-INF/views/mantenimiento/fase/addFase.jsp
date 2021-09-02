<%@ include file="../../../tiles/taglibs.jsp" %>

  
<div >
			<h4>Añadir fase</h4>
			<form:form id="faseForm" modelAttribute="FaseForm" action="" method="POST">
				<div class="form-group">
					<label for="InputNombre">Nombre</label> 
					<form:input type="text" path="nombre" class="form-control" id="InputNombre"/> 
				</div>
				<div class="form-group">
					<label for="InputPrioridad">Prioridad</label> 
					<form:input type="number" path="prioridad" class="form-control" id="InputPrioridad"/> 
				</div>			
				<button type="submit" class="btn btn-primary">Añadir fase</button>
			</form:form>
</div>


 


