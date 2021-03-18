<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link href="${contextpath}/resources/css/memForm.css" rel="stylesheet" id="bootstrap-css">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="${contextPath}/resources/js/memForm.js"></script>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<div class="container">
        <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
        	<div class="panel panel-default">
        		<div class="panel-heading">
			    		<h3 class="panel-title">캠핑을 좋아한다면 바로 불멍에 가입 하세요! <small>그리고 지갑을 여세요!</small></h3>
			 			</div>
			 			<div class="panel-body">
			    		<form method="post">
			    		<div class="row">
		    				<div class="col-md-6">
			    					<div class="form-group">
			                <input type="text" name="userID" id="id" class="form-control input-sm" placeholder="아이디 입력">
			    					</div>
			    				</div>
			    			</div>		
			    			
			    			<div class="row">
			    				<div class="col-md-6">
			    					<div class="form-group">
			                <input type="text" name="userName" id="name" class="form-control input-sm" placeholder="이름 입력">
			    					</div>
			    				</div>
			    			</div>
			    				    	
		    				<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password" name="userPW" id="pw" class="form-control input-sm" placeholder="비밀번호 입력">
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<input type="password" name="userPW2" id="pw2" class="form-control input-sm" placeholder="비밀번호 확인">
			    					</div>
			    				</div>
			    			</div>	    	
			    					
    						<div class="row">
			    				<div class="col-md-6">
			    					<div class="form-group">
			                <input type="number" name="userPhone" id="phone" class="form-control input-sm" placeholder="전화번호 입력 (하이픈- 사용없이)" pattern="[0-9]{11}"/>
			    					</div>
			    				</div>
			    			</div>	
			    			
		    				<div class="row">
			    				<div class="col-md-6">
			    					<div class="form-group">
			                <input type="date" name="userBirth" id="birth" class="form-control input-sm" value="1991-01-01">
			    					</div>
			    				</div>
			    			</div>
			    		
			    			<input type="submit" id="memInsert" value="가입하기" class="btn btn-info btn-block">
			    		
			    		</form>
			    	</div>
	    		</div>
    		</div>
    	</div>
    </div>
</body>
</html>