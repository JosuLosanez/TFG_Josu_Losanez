<%@ include file="../tiles/taglibs.jsp" %>


<div class="panel panel-default">
<c:forEach items="${ListaM}" var="mapa">
    <c:forEach items="${mapa}" var="element">
    	<c:set var = "faseNombre" value = "${element.key.nombre}"/>
    	<c:set var = "idFase" value = "${element.key.idFase}"/>
    	<c:set var = "faseFechaInicio" value = "${MapMargenes[element.key][0]}"/>
    	<c:set var = "faseFechaFin" value = "${MapMargenes[element.key][1]}"/>

        <h3>${faseNombre}</h3>
        <h6>
        <c:if test="${faseFechaInicio ne ''}">
        	${faseFechaInicio} / ${faseFechaFin}
		</c:if>
		</h6>
        <a href="#fase${idFase}"  role="button" data-toggle="collapse" class="collapsed">
			<i class="fa fa-plus-circle" aria-hidden="true"></i> Ver datos	
		</a>
		
        <div id= "fase${idFase}" class="collapse" data-fechaInicio = "${faseFechaInicio}" data-fechaFin= "${faseFechaFin}">
        <c:forEach items="${element.value}" var="evento">
        	<h3 style="color:blue">${evento.fechaTexto}</h3>
        	<p><b>${evento.titulo}</b></p>
        	<h6 class="text-primary">${faseNombre} | ${evento.ley}</h6>  
        </c:forEach>
        </div>
        <br>
    </c:forEach>
</c:forEach>
</div>

 


