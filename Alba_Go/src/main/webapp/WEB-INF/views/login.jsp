<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>회원가입</title>
        <!-- Bootstrap -->
        <link href="../plugin/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- font awesome -->
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <!-- Custom style -->
        <link rel="stylesheet" href="../plugin/bootstrap/css/style.css" media="screen" title="no title" charset="utf-8">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="../plugin/bootstrap/js/bootstrap.min.js"></script>
        <script src="../config/js/join.js"></script>
   
</head>
<body>
           <div class="container">
			<div class="row">
				<div class="col">
					<div class="btn-group btn-group-toggle" data-toggle="buttons">
						<label class="btn btn-danger">
							<input type="radio" name="jb-radio" id="jb-radio-1"> 개인회원
                        </label>
						<label class="btn btn-danger">
							<input type="radio" name="jb-radio" id="jb-radio-2"> 기업회원
						</label>


                <form role="form">
                    <div class="form-group">
                   <label for="inputName">아이디</label>
                        <input type="text" class="form-control" id="inputName" placeholder="아이디를 입력">
                    </div>
                    <div class="form-group">
                        <label for="InputEmail">비밀번호</label>
                        <input type="password" class="form-control" id="InputEmail" placeholder="비밀번호 입력">
                    </div>


                    <div class="form-group text-center">
                        <button type="submit" id="join-submit" class="btn btn-primary">
                            로그인<i class="fa fa-check spaceLeft"></i>
                        </button>

                    </div>
                </form>
            </div>
            </div>
            </div>
            </div>



</body>
</html>