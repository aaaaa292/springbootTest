<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>題目測試</title>
<!-- bootstrap 5.1.3 CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!-- Bootstrap v4.6.2 JS -->
<script src="${contextRoot}/js/common/bootstrap.bundle.min.js"></script>
<!-- jQuery -->
<script src="${contextRoot}/js/common/jquery-3.6.0.min.js"></script>
<!-- dataTable CSS -->
<link rel="stylesheet" href="${contextRoot}/css/jquery.dataTables.min.css">

</head>
<body>
<jsp:include page="../jsp/test.jsp" />

	<div>
		<table id="example" class="display">
			<thead>
				<tr>
					<th>idx</th>
					<th>key</th>
					<th>value</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="t1s" items="${table1}">
					<tr>
						<td>${t1s.idx }</td>
						<td>${t1s.c_aes256 }</td>
						<td>${t1s.c_base64 }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<!-- --------------------------- -->
<script src="${contextRoot}/js/common/jquery.dataTables.min.js"></script>
	<script>
		$(document).ready(function() {
			$('#example').DataTable({
				"order" : [ 0, 'asc' ]
			});
		});
	</script>

</body>
</html>