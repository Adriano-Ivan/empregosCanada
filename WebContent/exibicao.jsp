<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ page import="app.entities.Candidato" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<a href="cadastro.jsp">VOLTAR AO CADASTRO</a>
	<%Candidato c = (Candidato) request.getAttribute("candidatoAttr");%>
	<h1>DADOS:</h1>
	<p><strong>Nome: </strong><%=c.getNome() %></p>
	<p><strong>Data de nascimento: </strong><%=c.getDataNascimento().getDayOfMonth() %>/<%=c.getDataNascimento().getMonth() %>/<%=c.getDataNascimento().getYear() %></p>
	<p><strong>Idioma nativo: </strong><%=c.getIdiomaNativo() %></p>
	<p><strong>Habilidades técnicas: </strong>
		<%for(String hab:c.getHabilidadesTecnicas()) { %>
			<span style="padding:5px; background-color:'red'"><%if(hab != null){out.print(hab);} %></span>
		<% } %>
	</p>
</body>
</html>