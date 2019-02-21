<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	

	<jsp:include page="../home/top.jsp"/>
	
	
	<div class ="grid-item"id="catecontent">
	
	<h1 id="title">회원 전용 시스템</h1>
	
	<div id="register-container">
	<form id="access_form" >
	<div class="input-group input-group-lg">
	  <span class="input-group-addon" id="sizing-addon3">아이디</span>
	  <input type="text" class="form-control" placeholder="아이디를 입력하세요" aria-describedby="sizing-addon3" id="cusID" name="cusID" value="hoho">
      </div>


	  <div class="input-group input-group-lg">
      <span class="input-group-addon" id="sizing-addon3">비밀번호</span>
      <input type="text" class="form-control" placeholder="비밀번호를 입력하세요" aria-describedby="sizing-addon3" id="password" name="password" value="1234">
      </div>
	  <button type="button" class="btn  btn-warning btn-large" id = "confirm_btn" >
	  <span class="glyphicon glyphicon-tint" aria-hidden="true"></span> SIGNIN
	  </button> 
	

	
	<input type="hidden" name="cmd" value="cusaccess" />	
	<input type="hidden" name="dir" value="category" />
	<input type="hidden" name="page" value="main" />
	
	</form>
	</div>
	
	</div>
	
	<jsp:include page="../home/bottom.jsp"/>			
	<script>
	$('#confirm_btn').click(function(){
		var empno = $('#empno').val();
		var name = $('#name').val();
		$('#access_form').attr('action','${ctx}/employee.do').submit();
		
	})
	</script>
