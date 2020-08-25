<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div><h1>로 그 인</h1></div>
	<div>
		<form id = "frm" name = "frm" action="loginCheck.do" method="post">
			<table align = "center">
				<tr>
					<th size = "20">아 이 디</th>
					<td><input type="text" id = "id" name = "id"></td>
				</tr>
				<tr>
					<th size = "20">비밀번호</th>
					<td><input type="password" id = "pwd" name = "pwd"></td>
				</tr>
			</table>
			
			<br>
			<input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;
			<input type="reset" value="취소">
		</form>
	</div>
</div>
</body>
</html>