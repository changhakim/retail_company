<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../home/top.jsp"/>
		<%-- <link rel="stylesheet" href="${css}/category/main.css" />

		
		<div class="camain1">
		<h1>스마트폰</h1><br />
		<a href="#" id="cus_join">회원가입</a><br />
		<a href="#" id="cus_login">로그인</a>
		</div> --%>
		<div class="grid-item" id="navi_bar">
				
				<div class="new_navi_bar grid-item">
					<div id="li_navi1"><a id="navia" href="home.do">홈으로</a></div>
					<div id="li_navi2"><a id="navia" href="#">카테고리</a></div>
					<div id="li_navi3"><a id="navia" href="#">사원</a></div>
					<div id="li_navi4"><a id="navia" href="#">주문</a></div>
					<div id="li_navi5"><a id="navia" href="#">상품</a></div>
					<div id="li_navi6"><a id="navia" href="#">선박</a></div>
					<div id="li_navi7"><a id="navia" href="#">공급업체</a></div>
					<div id="li_navi8"><a href="${ctx}/customer.do?cmd=cust_retrieve&page=detail&customer_id=${cust.customerID}">마이페이지</a></div>
					<div class="navi_info"><img id="navi_img" src="${img}${image.imgName}.${image.imgExtention}" style="height: 40px; width: 10%; ">환영합니다.${cust.customerID}님</div>
					</div>
					
				
</div>
		<div class="catemain" >
		<div id="catemainin">
		<div id="cate1">
      
        <div class="thumbnail">
          <img data-src="holder.js/100%x200" src="http://d3qpgbf7vej5yf.cloudfront.net/wp-content/uploads/2018/09/apple-iphone-xs-quick-review-10.jpg"  data-holder-rendered="true" style="height: 200px; width: 100%; display: block;">
          <div class="caption">
            <h3 id="thumbnail-label">스마트폰<a class="anchorjs-link" href="#thumbnail-label"><span class="anchorjs-icon"></span></a></h3>
            <h2>Galaxy Note9</h2>
            <p>The new super powerful Note</p>
            <p>Galaxy Note9 Alpine White 출시!</p>
            <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
          </div>
        </div>
      
      </div>
      <div id="cate2">
     
        <div class="thumbnail">
          <img data-src="holder.js/100%x200" src="https://images.samsung.com/is/image/samsung/sec-allinone-dm500a2m-l15-dm500a2m-l15-%ED%94%84%EB%A1%9C%EC%8A%A4%ED%8A%B8-%ED%99%94%EC%9D%B4%ED%8A%B8-%EC%95%9E%EB%A9%B4-%ED%82%A4%EB%B3%B4%EB%93%9C-%EB%A7%88%EC%9A%B0%EC%8A%A4-%EC%95%9E%EB%A9%B4-thumb-105325062?$PF_PRD_PNG$" data-holder-rendered="true" style="height: 200px; width: 200px; display: block;">
          <div class="caption">
            <h3 id="thumbnail-label">데스크탑<a class="anchorjs-link" href="#thumbnail-label"><span class="anchorjs-icon"></span></a></h3>
            <h2>Galaxy Note9</h2>
            <p>The new super powerful Note</p>
            <p>Galaxy Note9 Alpine White 출시!</p>
            <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
          </div>
        </div>
      
      </div>
      <div id="cate3">
      
        <div class="thumbnail">
          <img data-src="holder.js/100%x200"  src="http://www.bloter.net/wp-content/uploads/2017/07/notebook9-pen1-800x409.jpg" data-holder-rendered="true" style="height: 200px; width: 100%; display: block;">
          <div class="caption">
            <h3 id="thumbnail-label">노트북<a class="anchorjs-link" href="#thumbnail-label"><span class="anchorjs-icon"></span></a></h3>
            <h2>Galaxy Note9</h2>
            <p>The new super powerful Note</p>
            <p>Galaxy Note9 Alpine White 출시!</p>
            <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
          </div>
       
      </div>
      </div>
      </div>
    </div>
		
		
		
		
		
		
		
		
		<!-- <div class="camain2">
		<h1>데스크탑</h1><br />
		<a href="#" id= "emp_register">사원등록</a><br />
		<a href="#" id= "emp_access">접속승인</a>
		</div> -->
		<!-- <div class="camain3">
		<h1>노트북</h1><br />
		<a href="#" id= "emp_register">사원등록</a><br />
		<a href="#" id= "emp_access">접속승인</a>
		</div> -->
		
		
		

<jsp:include page="../home/bottom.jsp"/>
<script>


$('#li_navi8').click(function(){
	location.assign('${ctx}/customer.do?cmd=cust_retrieve&page=detail&customer_id=${cust.customerID}');
});
</script>