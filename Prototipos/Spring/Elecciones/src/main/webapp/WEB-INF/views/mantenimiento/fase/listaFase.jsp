<%@ include file="../../../tiles/taglibs.jsp" %>

<table class="table table-hover table-bordered">
	<thead>
		<tr>
			<th scope="col">Prioridad</th>
			<th scope="col">Nombre</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="fase" items="${ListaFases}">
		<tr>
			<td>${fase.prioridad}</td>
			<td>${fase.nombre}</td>
			<td>
				<a href="${'updateFase/'}${fase.idFase}"><i class="fa fa-pencil" aria-hidden="true"></i></a>
				<c:set var="url" value="${'deleteFase/'}${fase.idFase}"/>
				<a href="" data-toggle="modal" data-target="#exampleModal${fase.idFase}"><i class="fa fa-trash" aria-hidden="true"></i></a>
			</td>
		</tr>
		
		
		<!-- Modal -->
		<div class="modal fade" id="exampleModal${fase.idFase}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLabel">Borrar fase</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        Esta accion tambien eliminara los eventos de la fase 
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
		        <a href="${url}"><input type=button class="btn btn-primary" value='Eliminar'></a>
		      </div>
		    </div>
		  </div>
		</div>
	</c:forEach>
	</tbody>
</table>




