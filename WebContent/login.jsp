<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta charset="utf-8">
<title>login画面</title>
</head>
<body>
<form>
ID:<input type="text" name="" size="40"><br>
PASS:<input type="password" name="" size="40"><br>
</form>
新規ユーザー登録は<a href='<s:url action="UserCreateAction" />'>こちら</a>

</body>
</html>