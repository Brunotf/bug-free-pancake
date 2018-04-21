<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="edu.model.cliente.Cliente, java.util.LinkedHashSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>PETSHOP VENDRAMEL</title>
<link rel="stylesheet" href="./resources/bootstrap.min.css" />
<script src="./resources/jquery-3.2.1.slim.min.js"></script>
<script src="./resources/popper.min.js"></script>
<script src="./resources/bootstrap.min.js"></script>
</head>
<body>
	<h1>Página inicial</h1>

	<div class="container">
		<form action="./IndexController" method="post">

			<div class="row">
				<div class="col-sm-9">
					<button class="btn btn-primary" id="btnCliente" type="submit"
						name="cmd" value="gestaoCliente">Gestão de clientes</button>
				</div>
			</div>
			
		</form>
	</div>
</body>
</html>