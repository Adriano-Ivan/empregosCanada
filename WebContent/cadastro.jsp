<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
	form {
	display:flex;
	flex-direction: column;
	margin: 50px auto;
	width: 50vw;
	}
	label {
	display:flex;
	flex-direction:column;
	margin-bottom:10px;
	}
</style>
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/cadastrar" method="POST">
	<h1>INFORME OS DADOS:</h1>
		<label>
		Nome:
		<input type="text" name="nome">
		</label>
		<label>
		Data de nascimento:
		<input type="date" name="dataNascimento">
		</label>
		<label>
		Idioma nativo:
		<select name="idiomaNativo">
			<option value="Inglês">INGLÊS</option>
			<option value="Português">Português</option>
			<option value="Espanhol">Espanhol</option>
		</select>
		</label>
		<label>
		Habilidades técnicas:
		<div><input type="checkbox" name="habilidadesEmLinguagens" value="Java">Java</div>
		<div><input type="checkbox" name="habilidadesEmLinguagens" value="JavaScript">JavaScript</div>
		<div><input type="checkbox" name="habilidadesEmLinguagens" value="HTML">HTML</div>
		<div><input type="checkbox" name="habilidadesEmLinguagens" value="CSS">CSS</div>
		</label>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>