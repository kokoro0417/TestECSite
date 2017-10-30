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

	<script src="./bxslider/jquery.bxslider.min.js"></script>
	<link href="./bxslider/jquery.bxslider.css" rel="stylesheet">
</head>
<body class="HomeBody">
<script type="text/javascript" src="js/MainHomeJScript.js"></script>
<input type="hidden" value="none">

<div class="HomeMenu">
	<div class="CascadeMenuBox">
		<div class="AccordionMenu">
			<div class="AM_topMenu">カテゴリを選択</div>
			<ul class="CategoryMenu">
				<li><a href="<s:url action='SearchAction'><s:param name='CategoryType' value='0'/></s:url>">すべてのカード</a></li>
				<li><a href="<s:url action='SearchAction'><s:param name='CategoryType' value='1'/></s:url>">マジック：オリジン</a></li>
				<li><a href="<s:url action='SearchAction'><s:param name='CategoryType' value='2'/></s:url>">戦乱のゼンディカー</a></li>
				<li><a href="<s:url action='SearchAction'><s:param name='CategoryType' value='3'/></s:url>">ゲートウォッチの誓い</a></li>
				<li><a href="<s:url action='SearchAction'><s:param name='CategoryType' value='4'/></s:url>">イニストラードを覆う影</a></li>
				<li><a href="<s:url action='SearchAction'><s:param name='CategoryType' value='5'/></s:url>">異界月</a></li>
			</ul>
		</div>
	</div>
	<div class="CascadeMenuBox">
		<div class="AccordionMenu">
			<div class="AM_topMenu">アカウントサービス</div>
			<ul class="CategoryMenu">
				<s:if test="#session.NowLoginFlag">
					<li><a href="<s:url action='SearchAction'><s:param name='CategoryType' value='0'/></s:url>">アカウントサービス一覧</a></li>
					<li><a href="<s:url action='SearchAction'><s:param name='CategoryType' value='1'/></s:url>">購入履歴</a></li>
					<li><a href="<s:url action='SearchAction'><s:param name='CategoryType' value='2'/></s:url>">ユーザー情報変更</a></li>
					<li><a href="<s:url action='SearchAction'><s:param name='CategoryType' value='3'/></s:url>">おすすめ商品</a></li>
				</s:if>
				<s:else>
					<li><a href="<s:url action='LoginAction'><s:param name='CategoryType' value='0'/></s:url>">ログイン</a></li>
				</s:else>
			</ul>
		</div>
	</div>
	<div class="CascadeMenuBox">
		<div>ユーザー登録</div>
	</div>
	<div class="CascadeMenuBox">
		<div>カート</div>
	</div>
</div>

<div class="flame">
	<ul class="slider">
		<li><img src="./img/kindle.jpg"></li>
		<li><img src="./img/primemusic.jpg"></li>
		<li><img src="./img/primevideo.jpg"></li>
	</ul>
</div>

<div class="NoLoginMenu">
	<div class="NLMenuBox"></div>




</div>

<form action="TestAction">
<input type="submit" value="test">
</form>
<form action="LogoutAction">
<input type="submit" value="ログアウト">
</form>
</body>
</html>