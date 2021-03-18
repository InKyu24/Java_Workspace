<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>불멍 - 캠핑 전문 쇼핑몰</title>

  <!-- Bootstrap core CSS -->
   
  <link href="${contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
 a:link { color: rgb(192, 45, 17); text-decoration: none;}
 a:visited { color: rgb(192, 45, 17); text-decoration: none;}
 a:hover { color: rgb(192, 45, 17); text-decoration: underline;}
 a.orderForm {color: rgb(29, 32, 60);}
 a.list-group-item {background-color: rgb(247, 196, 133); border-color: rgb(235,151,97);}
 #category0 {background-color: rgb(227, 116, 76); border-color: rgb(235,151,97);}
 #headerBar, #footerBar {background-color: rgb(15,17,37);}
body { padding-top: 80px; background-color: rgb(247, 239, 216);} #id, #pw {width: 150px;}
button#login {height: 60px;}
button:hover { color: "white"}

</style>
</head>
<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="headerBar">
    <div class="container">
      <a class="navbar-brand" id="logo" href="/main.camp"><img src="resources/img_source/logo.png" width=149 height=51></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="/main.camp">Home<span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#" id="about">About</a>
          </li>
          <li class="nav-item">
          	<a class="nav-link" href="#" id="contact">Contact</a>
          </li>
          <li class="nav-item" id="cartLi">       
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3 my-4">
			<div id="loginDiv" align="center">
	
        	<form id='loginForm' method='post'>        		
        	<table>
         		<tr>		
				<td><input type="text" id="id" class="form-control input-sm" placeholder="아이디 입력" autofocus tabindex="1"> </td>
				<td rowspan="2"><button type="submit" class="btn btn-lg btn-danger" id="login">로그인</button> </td>
				</tr>
				<tr>
				<td><input type="password" id="pw" class="form-control input-sm" placeholder="비밀번호 입력" autofocus tabindex="2"></td>
				
			</table>
			<br>
				<button class="btn btn-light btn-primary btn-sm" onclick="window.open('member/memInsertForm.camp', '_blank', 'toolbar=yes,scrollbars=yes,resizable=yes,top=50,left=500,width=500,height=500');">회원가입</button>
				<button class="btn btn-light btn-primary btn-sm" onclick="window.open('member/memFindForm.camp', '_blank', 'toolbar=yes,scrollbars=yes,resizable=yes,top=50,left=500,width=500,height=750');">ID/PW 찾기</button>	
			</form>
			</div>
			
       	<div id="list" class="my-4">
	        <div class="list-group">
	          <a href="#" class="list-group-item" id="category0"><b>캠핑 용품 <small>(전체보기)</small></b></a>
	          <a href="#" class="list-group-item" id="category1">텐트/타프/쉘터</a>
	          <a href="#" class="list-group-item" id="category2">침구/매트</a>
	          <a href="#" class="list-group-item" id="category3">테이블/체어</a>
	          <a href="#" class="list-group-item" id="category4">취사용품</a>
	          <a href="#" class="list-group-item" id="category5">화로/히터</a>
	          <a href="#" class="list-group-item" id="category6">악세사리</a>
	        </div>
		</div><!-- list -->
	
	</div><!-- /.col-lg-3 -->

      <div class="col-lg-9 mainContent">

        <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner" role="listbox">
            <div class="carousel-item active">
              <img class="d-block img-fluid" src="${contextPath}/resources/img_source/camp_event1.jpg" alt="First slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="${contextPath}/resources/img_source/camp_event2.jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
              <img class="d-block img-fluid" src="${contextPath}/resources/img_source/camp_event3.jpg" alt="Third slide">
            </div>
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>



        <div id="prodDisplay" class="row"> 
          <div class="col-lg-4 col-md-6 mb-4 tent">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/tent1.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title" align="center">
                  <small><a href="#" class="orderForm" name='[와일드랜드] 노르망디 루프탑 텐트'>[와일드랜드]<br>노르망디 루프탑 텐트</a></small>
                </h4>
                <p class="card-text" align="center"><small>펼치면 별장이 되는 루프탑 텐트</small></p><h5>300,000 원</h5>
              </div>
              <div class="card-footer">
                <small class="text-muted">⭐⭐⭐⭐⭐</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4 tent">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/tent2.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title" align="center">
                  <small><a href="#" class="orderForm" name='[듀랑고] R2'>[듀랑고]<br>R2</a></small>
                </h4>
                <p class="card-text" align="center"><small>캔버스 텐트의 대명사</small></p><h5>150,000 원</h5>
              </div>
              <div class="card-footer">
                <small class="text-muted">⭐⭐⭐⭐</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4 cook">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/cook1.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title" align="center">
                  <small><a href="#" class="orderForm" name='[제드코리아] 키친보드&블랙나이프'>[제드코리아]<br>키친보드&블랙나이프</a></small>
                </h4>
                <p class="card-text" align="center"><small>컴팩트한 수납, 위생적인 조리</small></p><h5>40,000 원</h5>
              </div>
              <div class="card-footer">
                <small class="text-muted">⭐⭐</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4 bed">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/bed1.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title" align="center">
                  <small><a href="#" class="orderForm" name='[씨투써미트] 플레임 FM4 여성용 침낭'>[씨투써미트]<br>플레임 FM4 여성용 침낭</a></small>
                </h4>
                <p class="card-text" align="center"><small>유니크한 디자인, 나만의 침낭</small></p><h5>300,000 원</h5>
              </div>
              <div class="card-footer">
                <small class="text-muted">⭐⭐⭐⭐</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4 table">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/table1.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title" align="center">
                  <small><a href="#" class="orderForm" name='[몬테라] 롱 릴레스 워머'>[몬테라]<br>롱 릴렉스 워머</a></small>
                </h4>
                <p class="card-text" align="center"><small>냉기 차단 효과와 탁월한 착좌감</small></p><h5>33,000 원</h5>
              </div>
              <div class="card-footer">
                <small class="text-muted">⭐⭐⭐</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4 heater">
            <div class="card h-100" id='prod6'>
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/heat1.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title" align="center">
                  <small><a href="#" class="orderForm" name='[카즈미] 카민 PTC 히터'>[카즈미]<br>카민 PTC 히터</a></small>
                </h4>
                <p class="card-text" align="center"><small>언제 어디서나 간편하고 따뜻하게!</small></p><h5>50,000 원</h5>
              </div>
              <div class="card-footer">
                <small class="text-muted">⭐⭐⭐</small>
              </div>
            </div>
          </div>

        </div>
        <!-- /.row -->

      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-3" id="footerBar">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; 불멍 2021</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="${contextPath}/resources/vendor/jquery/jquery.min.js"></script>

  <script src="${contextPath}/resources/js/prodForm.js"></script>
  <script src="${contextPath}/resources/js/topBar.js"></script>
  <script src="${contextPath}/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
  <script src="${contextPath}/resources/js/memForm.js"></script>

</body>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
	<script>
	$(function(){
		var login=$.cookie('logined');
		$("#loginDiv").html(login);
		var cart=$.cookie('cart');
		$("#cartLi").html(cart);
		
	});
	</script>
	
</html>