<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="top.jsp"/>
	

		
		<div class="main1">
		<h1>고객전용</h1><br />
		<a href="#" id="cus_join">회원가입</a><br />
		<a href="#" id="cus_login">로그인</a>
		</div>
		<div class="main2">
		<h1>직원전용</h1><br />
		<a href="#" id= "emp_register">사원등록</a><br />
		<a href="#" id= "emp_access">접속승인</a>
		</div>
		
		
		

<jsp:include page="bottom.jsp"/>
<script>
$('#emp_register').click(function(){
	location.assign('employee.do?cmd=move&page=register');
	
})
</script>