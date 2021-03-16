<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>캠핑용품 쇼핑몰</title>

  <!-- Bootstrap core CSS -->
  
  <link href="${contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css"> body { padding-top: 56px; } #id, #pw {width: 150px;} #memLogin {vertical-align:center}</style>
</head>
<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="/main.camp">Camping Shop</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="/main.camp">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#" id="about">About</a>
          </li>
          <li class="nav-item">
          	<a class="nav-link" href="#" id="contact">Contact</a>
          </li>
          <li class="nav-item" id="memProfile">
            
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3 my-4">
		
		<div class="memForm" id="memInfo">
        	<form id='loginForm' method='post'>
        		<table>
         	<tr>		
				<td><input type="text" id="id" class="form-control input-sm" placeholder="아이디 입력"> </td>
				<td rowspan="2" align="center"><button type="submit" class="btn btn-lg btn-dark" id="memLogin">로그인</button> </td>
			</tr>
			<tr>
				<td><input type="password" id="pw" class="form-control input-sm" placeholder="비밀번호 입력"></td>
				
				</table>
			</form>
			<button class="btn btn-light btn-primary btn-sm" onclick="window.open('member/memFindForm.camp', '_blank', 'toolbar=yes,scrollbars=yes,resizable=yes,top=50,left=500,width=500,height=750');">ID/PW 찾기</button>
			<button class="btn btn-light btn-primary btn-sm" onclick="window.open('member/memInsertForm.camp', '_blank', 'toolbar=yes,scrollbars=yes,resizable=yes,top=50,left=500,width=500,height=500');">회원가입</button>
        </div>
        	<div id="msgDiv"></div>
       	<div id="list" class="my-4">
        <div class="list-group">
          <a href="#" class="list-group-item active" id="category0">캠핑 용품 <small>(전체보기)</small></a>
          <a href="#" class="list-group-item" id="category1">텐트/타프/쉘터</a>
          <a href="#" class="list-group-item" id="category2">침구/매트</a>
          <a href="#" class="list-group-item" id="category3">테이블/체어</a>
          <a href="#" class="list-group-item" id="category4">취사용품</a>
          <a href="#" class="list-group-item" id="category5">화로/히터</a>
          <a href="#" class="list-group-item" id="category6">악세사리</a>
        </div>
		</div>
      </div>
      <!-- /.col-lg-3 -->

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
                <h4 class="card-title">
                  <a href="#">[와일드랜드]노르망디 오토 루프탑 텐트</a>
                </h4>
                <h5>5,000,000 원</h5>
                <p class="card-text">다른 곳에서 사면 훨씬 저렴하게 구매 가능해요!</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4 tent">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/tent2.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">[듀랑고]R2</a>
                </h4>
                <h5>4,500 원</h5>
                <p class="card-text">담배 한 갑이면 텐트를 살 수 있어요.</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4 cook">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/cook1.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">[제드코리아]키친보드&블랙나이프(도마)</a>
                </h4>
                <h5>500,000,000 원</h5>
                <p class="card-text">전설의 도마</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4 bed">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/bed1.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">[씨투써미트]플레임 FM4 LN 다크 그레이 여성용 침낭</a>
                </h4>
                <h5>999,999 원</h5>
                <p class="card-text">당연하게도 침낭은 무거울수록 따뜻하지만 힘이 든다!</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4 table">
            <div class="card h-100">
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/table1.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">[몬테라]롱 릴렉스 워머</a>
                </h4>
                <h5>777,777 원</h5>
                <p class="card-text">뚱뚱하면 캠핑 의자를 매번 망가뜨린다.</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-6 mb-4 heater">
            <div class="card h-100" id='prod6'>
              <a href="#"><img class="card-img-top" src="/resources/img_source/prod_img/heat1.jpg" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                  <a href="#">[카즈미]카민 PTC 히터</a>
                </h4>
                <h5>55,555 원</h5>
                <p class="card-text">Winter is coming!</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
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
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Camping shop 2021</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="${contextPath}/resources/vendor/jquery/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/memLogin.js"></script>
  <script src="${contextPath}/resources/js/prodDisplay.js"></script>
  <script src="${contextPath}/resources/js/topBar.js"></script>
  <script src="${contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>