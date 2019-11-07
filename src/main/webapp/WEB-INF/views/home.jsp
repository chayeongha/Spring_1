<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Home</title>
<c:import url="./layout/bootStrap.jsp"/>
</head>
<body>

	<c:import url="./layout/nav.jsp" />

	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<h1>Test Page</h1>
	<img alt="" src="./resources/images/momo.jpg">
	<a href="./test">test</a>
	<a href="./notice/noticeList">Notice List</a>

	
	
</body>
</html>
