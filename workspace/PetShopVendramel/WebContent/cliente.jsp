<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="edu.model.cliente.Cliente, java.text.SimpleDateFormat, java.util.LinkedHashSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>PETSHOP VENDRAMEL</title>
<link rel="stylesheet" href="./resources/bootstrap.min.css" />
<script src="./resources/jquery-3.2.1.slim.min.js"></script>
<script src="./resources/popper.min.js"></script>
<script src="./resources/bootstrap.min.js"></script>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: center;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>

	<%
		String msg = (String) session.getAttribute("MESSAGE");
		Cliente clienteAtual = (Cliente) session.getAttribute("CLIENTEATUAL");
		session.setAttribute("CLIENTEATUAL", null);
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if (clienteAtual == null) {
			clienteAtual = new Cliente();
		}
	%>
	<h1>Gestão de clientes</h1>
	<hr />
	<%
		if (msg != null) {
	%>
	<div class="alert alert-success" role="alert">
		<%=msg%>
	</div>
	<%
		session.setAttribute("MESSAGE", null);
		}
	%>
	<hr />
	<div class="container">
		<form action="./ClienteController" method="post">

			<div class="row">
				<div class="col-sm-4">
					<label>Nome</label>
				</div>
				<div class="col-sm-8">
					<input type="text" name="txtNome" />
				</div>
			</div>

			<div class="row">
				<div class="col-sm-4">
					<label>CPF</label>
				</div>
				<div class="col-sm-8">
					<input type="text" name="txtCpf" />
				</div>
			</div>

			<div class="row">
				<div class="col-sm-4">
					<label>Endereço</label>
				</div>
				<div class="col-sm-8">
					<input type="text" name="txtEnd" />
				</div>
			</div>

			<div class="row">
				<div class="col-sm-4">
					<label>Telefone</label>
				</div>
				<div class="col-sm-8">
					<input type="text" name="txtTel" />
				</div>
			</div>

			<div class="row">
				<div class="col-sm-4">
					<label>E-mail</label>
				</div>
				<div class="col-sm-8">
					<input type="email" name="txtEmail" />
				</div>
			</div>

			<div class="row">
				<div class="col-sm-8">
					<button class="btn btn-primary" type="submit" name="cmd"
						value="adicionar">Adicionar</button>
					<button class="btn btn-primary" type="submit" name="cmd"
						value="pesquisar">Pesquisar</button>
					<button class="btn btn-primary" type="submit" name="cmd"
						value="atualizar">Atualizar</button>
						<button class="btn btn-primary" type="submit" name="cmd"
						value="voltar">Voltar</button>
				</div>
			</div>

		</form>
	</div>

	<%
		LinkedHashSet<Cliente> listaCliente = (LinkedHashSet<Cliente>) session.getAttribute("LISTA_CLIENTE");
		session.setAttribute("LISTA_ALUNOS", null);
		if (listaCliente != null && listaCliente.size() > 0) {
	%>
	<h2>Lista dos clientes</h2>
	<table>
		<tr>
			<th>Nome</th>
			<th>CPF</th>
			<th>Endereço</th>
			<th>Telefone</th>
			<th>E-Mail</th>
		</tr>
		<%
			for (Cliente c : listaCliente) {
		%>
		<tr>
			<td><%=c.getNome()%></td>
			<td><%=c.getCpf()%></td>
			<td><%=c.getEndereco()%></td>
			<td><%=c.getTelefone()%></td>
			<td><%=c.getEmail()%></td>
		</tr>
		<%
			}
		%>

	</table>
	<%
		}
	%>

</body>
</html>