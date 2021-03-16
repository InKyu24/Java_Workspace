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
<title>아이디 비밀번호 찾기</title>
</head>
<body>
 	<div class="container">
        <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
        	<div class="panel panel-default">
        		<div class="panel-heading">
			    		<h3 class="panel-title">아이디를 잃어버리셨나요?! <small>참 속상하네요</small></h3>
			 			</div>
			 			<div class="panel-body">
			    		<form method="post">
			    		<div class="row">
		    				<div class="row">
			    				<div class="col-md-6">
			    					<div class="form-group">
			                <input type="text" name="userName" id="nameForId" class="form-control input-sm" placeholder="이름 입력">
			    					</div>
			    				</div>
			    			</div>
							
							<div class="row">
			    				<div class="col-md-6">
			    					<div class="form-group">
			                <input type="number" name="userPhone" id="phoneForId" class="form-control input-sm" placeholder="전화번호 입력 (하이픈- 사용없이)" pattern="[0-9]{11}"/>
			    					</div>
			    				</div>
			    			</div>	
			    			
		    				<div class="row">
			    				<div class="col-md-6">
			    					<div class="form-group">
			                <input type="date" name="userBirth" id="birthForId" class="form-control input-sm" value="1991-01-01">
			    					</div>
			    				</div>
			    			</div>
			    			
			    			<input type="submit" id="memFindId" value="아이디 찾기" class="btn btn-info btn-block">
			    		
			    		</form>
			    	</div>
    			</div>
    		
        		<div class="panel panel-default">
			    	<div class="panel-heading">
			    		<h3 class="panel-title">비밀번호를 잃어버리셨나요?! <small>더욱 더 속상하네요</small></h3>
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
			    		
			    			<input type="submit" id="memFindPw" value="비밀번호 찾기" class="btn btn-info btn-block">
			    		
			    		</form>
			    	</div>
			    	
	    		</div>
    		</div>
    	</div>
    </div>
</body>
</html>