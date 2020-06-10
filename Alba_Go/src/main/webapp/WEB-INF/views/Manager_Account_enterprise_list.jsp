<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
<title>my page</title>
<!-- Custom fonts for this template -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/sb-admin-2.min.css" rel="stylesheet">

  <!-- Custom styles for this page -->
  <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
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
                  


 <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800">공고글 관리</h1>
          
          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <div class="row">
                <div class="card col-xl-6 shadow mb-6">
                  <div class="card-header py-3">
                    <h5 class="m-0 font-weight-bold text-primary">지역</h5>
                  </div>
                  <div class="card-body">
                    <table>
                      <select name="">
                        <option value="0">전국</option>
                        <option value="1">서울</option>
                        <option value="2">경기</option>
                        <option value="3">인천</option>
                        <option value="4">부산</option>
                        <option value="5">대구</option>
                        <option value="6">대전</option>
                        <option value="7">경남</option>
                        <option value="8">전남</option>
                        <option value="9">충남</option>
                        <option value="10">광주</option>
                        <option value="11">울산</option>
                        <option value="12">경북</option>
                        <option value="13">전북</option>
                        <option value="13">충북</option>
                        <option value="13">강원</option>
                        <option value="13">제주</option>
                      </select>
                      &emsp;
                      <input type="text" name="time">
                     
                    </div>
                    
                    </table>
                  </div>
                </div>
                <div class="card col-xl-6 shadow mb-6">
                  <div class="card-header py-3">
                    <h5 class="m-0 font-weight-bold text-primary">업직종</h5>
                  </div>
                  <div class="card-body">
                    <table>
                      <select name="">
                        <option value="1">외식/음료</option>
                        <option value="2">유통/판매</option>
                        <option value="3">문화/여가/생활</option>
                        <option value="4">서비스</option>
                        <option value="5">사무직</option>
                        <option value="6">고객상담/리서치</option>
                        <option value="7">생산/건설/노무</option>
                        <option value="8">교육/강사</option>
                        <option value="9">디자인</option>
                        <option value="10">미디어</option>
                        <option value="11">운전/배달</option>
                        <option value="12">병원/간호/연구</option>
                        <option value="13">IT/컴퓨터</option>
                      </select>
                      &emsp;
                      <input type="text" name="time">
                     
                    </div>
                    
                    </table>
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="card col-xl-6 shadow mb-6">
                  <div class="card-header py-3">
                    <h5 class="m-0 font-weight-bold text-primary">기간</h5>
                  </div>
                  <div class="card-body">
                    <table>

                      <input type="text" name="time">&nbsp;&nbsp; ~ &nbsp;&nbsp;<input type="text" name="time">
                      &emsp;
                      <input type="submit" value="오늘" class="btn py-1 px-1 btn-primary">&nbsp;
                      <input type="submit" value="1주일" class="btn py-1 px-1 btn-primary">&nbsp;
                      <input type="submit" value="1개월" class="btn py-1 px-1 btn-primary">
                  

                    </table>
                  </div>
                </div>
                <div class="card col-xl-6 shadow mb-6">
                  <div class="card-header py-3">
                    <h5 class="m-0 font-weight-bold text-primary">검색</h5>
                  </div>
                  <div class="card-body">
                    <table>
                      <select name="">
                        <option value="1">제목</option>
                        <option value="2">작성자</option>
                      </select>
                      &emsp;
                      <input type="text" name="time">
                      &emsp;
                      <input type="submit" value="검색" class="btn py-1 px-1 btn-primary">
                    </div>
                    
                    </table>
                  </div>
                </div>
              </div>
            </div>
        
            <div class="card-body">
               
               <br/>
               <br/>
               <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>작성일</th>
                      <th>제목</th>
                      <th>작성자</th>
                      <th>관리</th>
                    </tr>
                  </thead>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>
                    <tr>
                      <td>2020-06-09</td>
                      <td>후기이</td>
                      <td>송원준</td>
                      <td><input type="submit" value="삭제" class="btn py-1 px-1 btn-danger"></td>
                    </tr>  
                </table>
               </div>
               <br/>
               <hr>
               

               <div class="text-center" style="float: left;">
                <ul class="pagination">
                  <li class="page-item disabled">
                    <a class="page-link" href="#" tabindex="-1" aria-disabled="true">Previous</a>
                  </li>
                  <li class="page-item"><a class="page-link" href="#">1</a></li>
                  <li class="page-item active" aria-current="page">
                    <a class="page-link" href="##">2 <span class="sr-only">(current)</span></a>
                  </li>
                  <li class="page-item"><a class="page-link" href="###">3</a></li>
                  <li class="page-item"><a class="page-link" href="####">4</a></li>
                  <li class="page-item"><a class="page-link" href="#####">5</a></li>
                  <li class="page-item">
                    <a class="page-link" href="#">Next</a>
                  </li>
                </ul>
              </div>


              </div>
            </div>
          </div>

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

     

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

 

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="js/demo/datatables-demo.js"></script>



</div><!-- 끝 main 본문  -->
         </div><!-- 끝 main -->
         <!-- footer -->
      <%@ include file="./footer.jsp" %>
   </div><!-- 끝 content wrapper -->
</div><!-- 끝  wrapper -->
</body>
</html>