<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/cafe/private/update.jsp</title>
</head>
<body>
<body>
	<script>
       alert("수정 완료 되었습니다.");
       location.href="${pageContext.request.contextPath}/review/detail.do?num=${param.num}";
    </script>
</body>
</html>