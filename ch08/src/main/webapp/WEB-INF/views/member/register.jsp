<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Member Register</title>
</head>
<body>
	<h3>Member Register</h3>
	<form action="/ch08/member/register" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp" /></td>
			</tr>
			<tr>
				<td>직급</td>
				<td>
					<select name="pos">
						<option value="사원">사원</option>
						<option value="주임">주임</option>
						<option value="대리">대리</option>
						<option value="팀장">팀장</option>
						<option value="부장">부장</option>
						<option value="사장">사장</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>부서</td>
				<td>
					<select name="dep">
						<option value="101">101</option>
						<option value="102">102</option>
						<option value="103">103</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="등록하기" /></td>
			</tr>
		</table>
	</form>
	
</body>
</html>