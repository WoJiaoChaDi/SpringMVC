<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="helloworld">Hello World</a>
	<br>
	<a href="springmvc/testRequestMapping">TestRequestMethod</a>
	<br>
	<a href="springmvc/testMethod">TestMethod</a>
	<br>
	<form action="/springmvc/testMethod" method="post">
		<input type="submit" value="TestMethodPost">
	</form>
	<br>
	<a href="springmvc/testParamsAndHeaders?username=atguigu&age=11">testParamsAndHeaders</a>
	<br>
	<a href="springmvc/testAntPath/ASDSFWEAREWRFEWTDSAGDFGREYTR/abc">testAntPath</a>
	<br>
	<a href="springmvc/testPathVariable/102">testPathVariable</a>

</body>
</html>