<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>himedia BackEnd Assignment</title>
</head>
<body>
	<h1>하이미디어 백엔드 평가</h1>

	<h3>GET 요청 파라미터 처리</h3>
	<!-- TODO : 
		- 아래 li 노드에 서블릿으로부터 전달받은 파라미터를 각각 출력합니다.
		- null은 출력하지 말아 주십시오.
	-->
	<ul>
		<li>name : ${name }</li>
		<c:if test="${not empty age}">
			<li>age : ${age }</li>
		</c:if>
		<c:if test="${not empty location}">
			<li>location : ${location }</li>
		</c:if>
	</ul>
</body>
</html>