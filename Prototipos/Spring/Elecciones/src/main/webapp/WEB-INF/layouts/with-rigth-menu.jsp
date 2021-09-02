<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<title><tiles:insertAttribute name="title" /></title>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
	
	<link rel="stylesheet" type="text/css" href="/static/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="/static/css/bootstrap.min.css">
	
	<script type="text/javascript" src="/static/js/bootstrap.js"></script>
	<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>
	
	<!-- Font AWESOME  -->
	<link rel="stylesheet" href="/static/css/font-awesome-4.7.0/css/font-awesome.min.css">

    <link rel="shortcut icon" href="#">
</head>
<body>
	<tiles:insertAttribute name="header" />
	
	<div class="flex-shrink-0">
		<div class="container-fluid p-5">
			<div class="row">
				<div class="col-sm-7 col-lg-8">
						<tiles:insertAttribute name="content" />
				</div>
				<div class="col-sm-5 col-lg-4">
					<tiles:insertAttribute name="rigth-menu" />
				</div>
			</div>
		</div>
	</div>
	


	<tiles:insertAttribute name="footer" />
	

</body>
</html>