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
	<div><h1>주 문 서</h1></div>
	<div>
		<form id="frm" name="frm" action="orderResult.do" method="post">
			<table border="1">
				<tr>
					<th size = "20">상 품 명</th>
					<td><input type="text" id="product" name="product"></td>
				</tr>
				<tr>
					<th size = "20">수 량</th>
					<td><input type="text" id="orderNum" name="orderNum"></td>
				</tr>
				<tr>
					<th size = "20">단 가</th>
					<td><input type="text" id="price" name="price"></td>
				</tr>
			</table>
			<br>
			<input type="submit" value="저장">&nbsp;&nbsp;&nbsp;
			<input type="reset" value="취소">&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="location.href='home.do'"> 홈으로</button>
		</form>
	</div>
</div>
</body>
</html>