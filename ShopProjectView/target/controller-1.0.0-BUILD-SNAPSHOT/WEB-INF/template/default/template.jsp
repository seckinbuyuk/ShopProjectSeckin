<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
<div id="container" style="width: 1200px;" >
	<div id="top" style="height: 100px">
		<tiles:insertAttribute name="top"/>
	</div>
	<div id="menu">
		<tiles:insertAttribute name="menu"/>
	</div>
	<div id="content" style="float: left; min-height:800px;">
		<div style="float: left;width:400px;">
		<tiles:insertAttribute name="left_content"/>
		</div>
		<div style="float: left;width:700px;">
		<tiles:insertAttribute name="right_content"/>
		</div>
	</div>
	<div id="footer" style="border-top: 1px solid;float: left;width:1000px;">
		<tiles:insertAttribute name="bottom"/>
	</div>
</div>
</body>
</html>