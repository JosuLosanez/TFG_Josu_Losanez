<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
 
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h3>MANTENIMIENTO</h3>
<div id="sidebar">
	<div class="nav flex-column nav-pills bg-light" >
		<c:set var="ruta" value="${requestScope['javax.servlet.forward.servlet_path']}"/>
		<a class="nav-link ${ruta eq '/calendario/mantenimiento/addFase' ? 'active' : ''}" href="/calendario/mantenimiento/addFase"><c:out value="Añadir fase"/></a>
		<a class="nav-link ${ruta eq '/calendario/mantenimiento/listaFase' ? 'active' : ''}" href="/calendario/mantenimiento/listaFase"><c:out value="Ver fases"/></a>
      	<a class="nav-link ${ruta eq '/calendario/mantenimiento/addEvento'  ? 'active' : ''}" href="/calendario/mantenimiento/addEvento"><c:out value="Añadir evento"/></a>
     	<a class="nav-link ${ruta eq '/calendario/mantenimiento/searchEvento' ? 'active' : ''}" href="/calendario/mantenimiento/searchEvento"><c:out value="Ver eventos"/></a>
	</div>
</div>