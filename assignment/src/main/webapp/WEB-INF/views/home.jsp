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
	
	<h3>Session 정보</h3>
	<ul>
		<li>authUser : ${authUser }</li>
		<li><a href="<c:url value="/users/logout" />">로그아웃</a></li>
	</ul>
	
	<h3>GET 요청 파라미터 처리</h3>
	<ul>
		<li><a href="<c:url value="/getreq?name=홍길동&age=28&location=한양" />">name=홍길동, age=28, location=한양</a></li>
		<li><a href="<c:url value="/getreq?name=장길산&age=35" />">name=장길산, age=35</a></li>
		<li><a href="<c:url value="/getreq?name=임꺽정&location=양주" />">name=임꺽정, location=양주</a>
	</ul>
	
	<h3>POST FORM 요청 처리</h3>
	<form method="POST" action="<c:url value="/users/login" />">
		<label>
			아이디 <input type="text" name="userId" placeholder="사용자 아이디를 입력하세요" />
		</label><br>
		<label>
			비밀번호 <input type="password" name="userPassword" placeholder="사용자 비밀번호를 입력하세요" />
		</label><br>
		<input type="submit" value="로그인" />
	</form>
</body>
</html>