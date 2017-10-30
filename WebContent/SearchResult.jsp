<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/MainStyle.css" />
<link rel="stylesheet" type="text/css" href="./css/Search.css" />
</head>
<body>

<s:iterator value="SearchDataList">
	<div class="SearchBox">
		<img class="SearchImg" src='<s:property value="imgurl"/>'>
		<div class="SearchResult">
			<table  border="1">
				<tr><td>
					<s:property value="card_name"/>
				</td></tr>
			</table>
			<table  border="1">
				<tr><td>
					<s:property value="expansion"/>
					</td><td>
					<s:property value="card_type"/>
					</td><td>
					<s:property value="rarity"/>
				</td></tr>
			</table>
			<table  border="1">
				<tr><td>
					<s:property value="color"/>
					</td><td>
					<s:property value="mana"/>
				</td></tr>
			</table>
			<table  border="1">
				<tr><td>
					<s:property value="stock"/>
					</td><td>
					<s:property value="price"/>
				</td></tr>
			</table>
		</div>

	</div>
	<br>

</s:iterator>

</body>
</html>