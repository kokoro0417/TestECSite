<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>amazonnu</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="./css/MainStyle.css" />
</head>
<body>
<script type="text/javascript" src="./js/IndexJScript.js"></script>
<div class="MainHedder">
	<a class="TopLink" href='<s:url action="HomeBackAction" />' target="_top"><img class="TopLinkImg" src="./img/amazonnu.png"></a>
	<div class="SearchBox">
		<form action="SearchAction" target="frame2">
			<select name="CategoryType" class="CategorySelect">
				<option value=0 label="すべて" selected>
				<option value=1 label="マジック：オリジン">
				<option value=2 label="戦乱のゼンディカー">
				<option value=3 label="ゲートウォッチの誓い">
				<option value=4 label="イニストラードを覆う影">
				<option value=5 label="異界月">
				<option value=6 label="カラデシュ">
				<option value=7 label="霊気紛争">
				<option value=8 label="アモンケット">
				<option value=9 label="破滅の刻">
				<option value=10 label="イクサラン">
			</select>
			<input type="text" name="SearchText" class="SearchText">
			<input type="submit" value="検索" class="SearchSubmit">
		</form>
	</div>
</div>
</body>
</html>