<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="WEB-INF/jsp/layout/taglib.jsp" %>
<jsp:include page="WEB-INF/jsp/layout/header.jsp">
	<jsp:param name="title" value="Favoritos" />
	<jsp:param name="page" value="webForm" />
</jsp:include>

<h1>Almacenar páginas web</h1>

<form action="save-web.html" class="form-signin" method="post">
	<div class="alert alert-info">Aplicación en modo prueba</div>
	<div class="errorMessage alert alert-danger" style="display: none"></div>
	<c:if test="${param.save eq true}">
		<div class="alert alert-success">Url almacenada</div>
	</c:if>
	<c:if test="${param.error == true}">
		<div class="alert alert-danger">¡Error! No se ha guardado la url</div>
	</c:if>
	<input type="text" name="name" class="form-control" placeholder="Nombre"><br/>
	<input type="text" name="url" class="form-control" placeholder="Url"><br/>
	<textarea rows="5" name="description" class="form-control" placeholder="Descripción"></textarea><br/>
	<input type="submit" value="Enviar" class="btn btn-lg btn-primary">
</form>

<script type="text/javascript">
	function isValidUrl(url){
		var pattern = new RegExp(/^(http:\/\/www\.|https:\/\/www\.|http:\/\/|https:\/\/)?[a-z0-9]+([\-\.]{1}[a-z0-9]+)*\.[a-z]{2,5}(:[0-9]{1,5})?(\/.*)?$/);
		return pattern.test(url);
	}
	
	$(document).ready(function(){
		$(".form-signin").submit(function(){
			var url = $(".name").val();
			var err = $(".errorMessage");
			if(!isValidUrl(url)){
				err.show();
				err.text("Url incorrecta");
				$(".url").focus();
				return false;
			}
			return true;
		});
	});
</script>

<jsp:include page="WEB-INF/jsp/layout/footer.jsp" />