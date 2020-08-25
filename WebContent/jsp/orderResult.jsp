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
		<div>
			<h1>주 문 서</h1>
		</div>
		<div>
			<table border="1">
				<tr>
					<th size="20">상 품 명</th>
					<td>${product}</td>
				</tr>
				<tr>
					<th size="20">수 량</th>
					<td>${orderNum}</td>
				</tr>
				<tr>
					<th size="20">단 가</th>
					<td>${price}</td>
				</tr>
				<tr>
					<th size="20">부 가 세</th>
					<td>${vat}</td>
				</tr>
				<tr>
					<th size="20">총 금 액</th>
					<td>${sum}</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>