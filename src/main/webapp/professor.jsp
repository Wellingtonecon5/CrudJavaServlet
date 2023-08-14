<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Professor</title>
</head>
<body>
	<div>
		<jsp:include page="menu.jsp"/>
	</div>
	<br />
	
	<div align= "center" class="container">
	<p class="title">
		<b>Professor</b>
		</p>
		
	<table>
	   <tr>
			<td colspan= "3">
			  <input class="id_input_data"  type="number" min="0" step="1" id="codigo"
			  name="codigo" placeholder="Codigo">
			</td>
			
			<td>
				<input type="submit" id="botao" name="botão" value="Buscar">
			</td>	
	   </tr>
	   
	   <tr>
	   		<td colspan= "4">
			  <input class="input_data"  type="text"  id="nome"
			  name="nome" placeholder="Nome">
			</td>
	   </tr>
	   
	    <tr>
	   		<td colspan= "4">
			  <input class="input_data"  type="text"  id="titulacao"
			  name="titulacao" placeholder="Titulacao">
			</td>
	   </tr>
	   
	   <tr>
	   
	   <td>
				<input type="submit" id="botao" name="botão" value="Cadastrar">
	   </td>
	   
	    <td>
				<input type="submit" id="botao" name="botão" value="Alterar">
	   </td>	
	   
	    <td>
				<input type="submit" id="botao" name="botão" value="Excluir">
	   </td>
	   
	    <td>
				<input type="submit" id="botao" name="botão" value="Listar">
	   </td>
	   
	   </tr>
	   
	   
	</table>
	</div>
	
	
</body>
</html>