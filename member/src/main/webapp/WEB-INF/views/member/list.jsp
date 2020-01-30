<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>list</title>
</head>
<body>
	<h1>목록</h1>
	
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
		<!-- MemberController에서 Model객체에 저장되었던 members를 ${members}로 받음. -->
		<c:forEach var="member" items="${members}">
		
			<tr>
				<td>${member.uid}</td>
				<td>${member.name}</td>
				<td>${member.hp}</td>
				<td>${member.pos}</td>
				<td>${member.dep}</td>
				<td>${member.rdate.substring(0,10)}</td>
				<td>
					<a href="/member/member/modify?uid=${member.uid}">수정</a>
					<a href="/member/member/delete?uid=${member.uid}">삭제</a>
				</td>
			</tr>
		
		</c:forEach>
	</table>
		
	<a href="/member/member/register">등록하기</a>
			
</body>
</html>