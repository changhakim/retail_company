<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../home/top.jsp"/>
		<link rel="stylesheet" href="${css}/category/main.css" />

		
		<div class="camain1">
		<h1>스마트폰</h1><br />
		<a href="#" id="cus_join">회원가입</a><br />
		<a href="#" id="cus_login">로그인</a>
		</div>
		<div class="camain2">
		<h1>데스크탑</h1><br />
		<a href="#" id= "emp_register">사원등록</a><br />
		<a href="#" id= "emp_access">접속승인</a>
		</div>
		<div class="camain3">
		<h1>노트북</h1><br />
		<a href="#" id= "emp_register">사원등록</a><br />
		<a href="#" id= "emp_access">접속승인</a>
		</div>
		
		
		

<jsp:include page="../home/bottom.jsp"/>
<script>
$('#emp_register').click(function(){
	location.assign('employee.do?cmd=move&page=register');
	
});

$('#emp_access').click(function(){
	location.assign('employee.do?cmd=move&page=access');
	
});
</script>