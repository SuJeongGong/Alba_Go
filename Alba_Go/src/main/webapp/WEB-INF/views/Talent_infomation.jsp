<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>이력서 작성</title>
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
			<div class="d-sm-flex align-items-center justify-content-between mb-4">
            	<h1 class="h3 mb-0 text-gray-800">이력서 작성</h1>
       	   	</div>
			<div class="row"><!--  실제 내용 삽입 -->
				<div class="container ">
            <div class="row">
              <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="card card-stats">
                  <div class="card-header card-header-warning card-header-icon" style="cursor:pointer;"
                    onclick="location.href='www.naver.com';">
                    <div class="card-icon">
                      <i class="material-icons">전체 인재</i>
                    </div>
                    <h3 class="card-title">280,012<small>명</small>
                    </h3>
                  </div>

                </div>
              </div>
              <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="card card-stats">
                  <div class="card-header card-header-warning card-header-icon" style="cursor:pointer;"
                    onclick="location.href='www.naver.com';">
                    <div class="card-icon">
                      <i class="material-icons">오늘의 인재</i>
                    </div>
                    <h3 class="card-title">896<small>명</small></h3>
                  </div>

                </div>
              </div>
              <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="card card-stats">
                  <div class="card-header card-header-warning card-header-icon" style="cursor:pointer;"
                    onclick="location.href='www.naver.com';">
                    <div class="card-icon">
                      <i class="material-icons">베테랑 인재</i>
                    </div>
                    <h3 class="card-title">896<small>명</small></h3>
                  </div>

                </div>
              </div>
              <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="card card-stats">
                  <div class="card-header card-header-icon" style="cursor:pointer;"
                    onclick="location.href='www.naver.com';">
                    <div class="card-icon">
                      <i class="material-icons">대학생 인재</i>
                    </div>
                    <h3 class="card-title">896<small>명</small></h3>
                  </div>

                </div>
              </div>
            </div>
          </div>
              
              

              <hr />
            </div>

            <div class="container">
              <div class="row">

                <div class="col-md-12">
                  <div style="float:left;">
                    <p>◆ 전체 인재<br /></p>
                  </div>
                  <div style="float: right;">
                    <button>더보기</button>
                  </div>
                  <div class="table-responsive">

                    <table id="mytable" class="table table-bordred table-striped">

                      <thead>
                        <th></th>
                        <th>이름</th>
                        <th>이력서 제목</th>
                        <th>경력,자격증</th>
                        <th>희망지역</th>
                        <th>등록일</th>
                      </thead>
                      <tbody>

                        <tr>
                          <td></td>
                          <td>임OO</td>
                          <td>CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan</td>
                          <td>Irshad</td>
                          <td>isometric.mohsin@gmail.com</td>
                          <td>+923335586757</td>
                        </tr>

                        <tr>
                          <td></td>
                          <td>임OO</td>
                          <td>CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan</td>
                          <td>Irshad</td>
                          <td>isometric.mohsin@gmail.com</td>
                          <td>+923335586757</td>
                        </tr>

                        <tr>
                          <td></td>
                          <td>임OO</td>
                          <td>CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan</td>
                          <td>Irshad</td>
                          <td>isometric.mohsin@gmail.com</td>
                          <td>+923335586757</td>
                        </tr>

                        <tr>
                          <td></td>
                          <td>임OO</td>
                          <td>CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan</td>
                          <td>Irshad</td>
                          <td>isometric.mohsin@gmail.com</td>
                          <td>+923335586757</td>
                        </tr>

                        <tr>
                          <td></td>
                          <td>임OO</td>
                          <td>CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan</td>
                          <td>Irshad</td>
                          <td>isometric.mohsin@gmail.com</td>
                          <td>+923335586757</td>
                        </tr>

                      </tbody>

                    </table>

                  </div>

                </div>
              </div>
            </div>
              
          
				
				
				
			</div><!-- 끝 실제 내용 삽입 -->
			</div><!-- 끝 main 본문  -->
   		</div><!-- 끝 main -->
   		<!-- footer -->
		<%@ include file="./Footer.jsp" %>
   </div><!-- 끝 content wrapper -->
</div><!-- 끝  wrapper -->
</body>
</html>