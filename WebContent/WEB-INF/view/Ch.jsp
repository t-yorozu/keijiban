<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="bean.Ch" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理画面</title>
<style type="text/css">
<!--
-->
</style>

</head>

<body>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<div>
	<form action="/java_kadai/StartCh" method="get">
 		<input type="submit" value="投稿フォームへ"><br>
 	</form>
<h2>管理データ</h2>
<table>

	<%
	ArrayList<Ch> list = (ArrayList<Ch>)request.getAttribute("list");
	for(int i = 0 ; i < list.size() ; i++){
		Ch ch = list.get(i);
	%>

		<tr>
			<td><%=ch.getId() %></td>
			<td><%=ch.getName() %></td>
			<td><%=ch.getMail() %></td>
			<td><%=ch.getTime() %></td>
		</tr>
</table>
<table>
				<tr>
					<td>>>><%=ch.getMain() %></td>
					<td><form action="/java_kadai/DeleteCh" method="get">
						<input type="hidden" name="id" value="<%=ch.getId() %>">
						<input type="submit" name="button" value="削除"></form></td>
				</tr>
</table>
	<p><br><br></p>
	<%}%>
</div>
<script>
function a() {
	alert("削除しました。");
}
</script>
</body>
<footer>
</footer>
</html>