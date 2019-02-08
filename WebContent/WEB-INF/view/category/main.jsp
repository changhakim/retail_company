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
		<div class="row">
      <div class="col-sm-6 col-md-4">
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
      <div class="col-sm-6 col-md-4">
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
      <div class="col-sm-6 col-md-4">
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
$('#emp_register').click(function(){
	location.assign('employee.do?cmd=move&page=register');
	
});

$('#emp_access').click(function(){
	location.assign('employee.do?cmd=move&page=access');
	
});
</script>