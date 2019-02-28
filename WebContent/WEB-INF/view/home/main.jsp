<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="top.jsp"/>
	

		
		<div class="main1 grid-item" >
		<h1>고객전용</h1><br />
		<a href="#" id="cus_join">회원가입</a><br />
		<a href="#" id="cus_login">로그인</a>
		</div>
		<div class="main2 grid-item">
		<h1>직원전용</h1><br />
		<a href="#" id= "emp_register">사원등록</a><br />
		<a href="#" id= "emp_access">접속승인</a>
		</div>
		
		<div class="main1 grid-item" >
		<h1>객체지향</h1><br />
		<a href="#" id="oop_access">접속하기</a>
		</div>
		<div class="main2 grid-item">
		<h1>알고리즘</h1><br />
		<a href="#" id= "algo_access">접속하기</a>
		</div>
		
		
		

<jsp:include page="bottom.jsp"/>
<script src="${js}/oop.js"></script>
<script>
$('#emp_register').click(function(){
	location.assign('employee.do?cmd=move&page=register');
	
});

$('#emp_access').click(function(){
	location.assign('employee.do?cmd=move&page=access');
	
})

$('#cus_join').click(function(){
	location.assign('customer.do?cmd=move&page=signup');
});
$('#cus_login').click(function(){
	location.assign('customer.do?cmd=move&page=signin');
});
$('#oop_access').click(function(){
	/* app.main(); */
	test2.main();
});
$('#algo_access').click(function(){
	/* app.main(); */
	inherit.customer();
});
</script>