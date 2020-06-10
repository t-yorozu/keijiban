<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="bean.Ch" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>投稿フォーム</title>
<style type="text/css">
<!--
-->
</style>
</head>
<body>
<div>
	<form action="/java_kadai/AllCh" method="get">
 		<input type="button" onclick="location.href='./AllCh'"name="key" value="管理画面へ"><br>
 	</form>
 <h2>投稿フォーム</h2>
 	<form action="/java_kadai/InsertCh" method="get">
 		<p>>投稿者</p>
 		<input id="text" type="text" name="textName" value="">
 		<p>>メール</p>
 		<input id="text" type="text" name="textMail" value="">
 		<p>>内容</p>
 		<input id="text" type="text" name="textMain" value=""><br>
 		<input type="hidden" name="id">
 		<input type="submit" value="送信" onclick="location.href='./InsertCh'">
 	</form>
 	<p>------------------------</p>
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
		</tr>
	</table>
	<p><br><br></p>
	<%}%>
</div>
</body>
</html>