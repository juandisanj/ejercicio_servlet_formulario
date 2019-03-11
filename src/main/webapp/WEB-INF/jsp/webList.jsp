<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp"%>
<jsp:include page="layout/header.jsp">
	<jsp:param value="Webs" name="title" />
	<jsp:param name="page" value="webs" />
</jsp:include>

<h1>Incluir nueva web</h1>

<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>Nombre</th>
			<th>Url</th>
			<th>Descripcion</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${webs}" var="web">
			<tr>
				<td><c:out value="${web.nombre}"/></td>
				<td><c:out value="${web.url}"/></td>
				<td><c:out value="${web.descripcion}" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<jsp:include page="layout/footer.jsp" />