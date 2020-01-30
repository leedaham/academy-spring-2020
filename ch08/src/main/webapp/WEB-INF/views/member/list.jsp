<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Member List</title>
</head>
<body>
	<h3>Member List</h3>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>휴대폰</th>
			<th>직급</th>
			<th>부서</th>		
			<th>입사일</th>		
			<th>설정</th>		
		</tr>
		
		<c:forEach var="member" items="${members}">
		
			<tr>
				<td>${member.uid}</td>
				<td>${member.name}</td>
				<td>${member.hp}</td>
				<td>${member.pos}</td>
				<td>${member.dep}</td>
				<td>${member.rdate.substring(0,10)}</td>
				<td>
					<a href="/ch08/member/modify?uid=${member.uid}">수정</a>
					<a href="/ch08/member/delete?uid=${member.uid}">삭제</a>
				</td>
			</tr>
		
		</c:forEach>
	</table>
		
	<a href="/ch08/member/register">등록하기</a>		
</body>
</html>