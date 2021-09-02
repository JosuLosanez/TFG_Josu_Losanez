<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
 
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




<h3>PROCEDIMIENTO ELECTORAL</h3>
<div id="sidebar">
	<div class="nav flex-column nav-pills bg-light" >
		<c:set var="ruta" value="${requestScope['javax.servlet.forward.servlet_path']}"/>
		<a class="nav-link ${ruta eq '/procedimiento/convocatoria' ? 'active' : ''}" href="/procedimiento/convocatoria"><c:out value="Convocatoria"/></a>
      	<a class="nav-link ${ruta eq '/procedimiento/juntas' ? 'active' : ''}" href="/procedimiento/juntas"><c:out value="Juntas electorales"/></a>
     	<a class="nav-link ${ruta eq '/procedimiento/candidaturas' ? 'active' : ''}" href="/procedimiento/candidaturas"><c:out value="Candidaturas presentadas"/></a>
	</div>
</div>