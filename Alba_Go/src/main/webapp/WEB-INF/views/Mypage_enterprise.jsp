<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>my page</title>
</head>
<body>
<div id="wrapper">
	<!-- 사이드 바 -->
	<%@ include file="./Sidebar.jsp" %>
	
	<!-- content wrapper -->
	<div id="content-wrapper" class="d-flex flex-column">
		<!-- main -->
   		<div id ="content">
   			<!-- Topbar -->
			<%@ include file="./Topbar.jsp" %>
			
			<!-- main 본문  -->
			<div class="container-fluid">
			<!-- main 본문을 한 줄로 묶기 -->
			<div class="row">
				
			
			</div><!-- 끝 main 본문을 한 줄로 묶기 -->	
			</div><!-- 끝 main 본문  -->
   		</div><!-- 끝 main -->
   		<!-- footer -->
		<%@ include file="./footer.jsp" %>
   </div><!-- 끝 content wrapper -->
</div><!-- 끝  wrapper -->
</body>
</html>