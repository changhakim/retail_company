<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/employee/register.css" />
<div class="grid-item" id= "side_bar">
<h1>사원등록</h1>
</div>
	<div class="grid-item" id= "content">
	<form id="register_form" >
	<div id="register-container">
	
	<div class="re1">이름</div>
	<div class="re2"><input type="text" id="name" name="name" /></div>
	<div class="re1">매니저</div>
	<div class="re2"><input type="text" id="manager" name="manager" /></div>
	<div class="re1">생년월일</div>
	<div class="re2"><input type="text" id="birthDate" name="birthDate" /></div>
	<div class="re1">상세</div>
	<div class="re2"><input type="text" id="notes" name="notes" /> </div>
	<div class="re1">사진</div>
	<div class="re2"><input type="text" id="photo" name="photo" /> </div>
	
	<div class="re3"><input type="submit" id = "confirm_btn" value="확인" /></div>
	<div class="re4"><input type="submit" id = "cancel_btn" value="취소" /> </div>	
	
	<input type="hidden" name="cmd" value="register"/>
	<input type="hidden" name="page" value="access"/>
	
		
	</div>
	</form>
	</div>
	


<jsp:include page="../home/bottom.jsp"></jsp:include>
<script>
$('#confirm_btn').click(function(){
	
	var empno = $('#empno').val();
	var name = $('#name').val();
	var manager = $('#manager').val();
	var birthDate = $('#birthDate').val();
	var desc = $('#desc').val();
	$('#register_form')
	.attr('action', '${ctx}/employee.do')
	.submit();
	
	/*if(empno === ''){
		alert('사번은 필수입력값입니다 !!');
	}else if(name === ''){
		alert('이름은 필수입력값입니다 !!');
	}else if(manager === ''){
		alert('매니저는 필수입력값입니다 !!');
	}else if(birthDate === ''){
		
		alert('생년월일은 필수입력값입니다 !!');
	}else{
		//alert('사원 DOM 객체의 타입 속성값:'+$('#empno').attr('type'))
		alert('전송가능');
		// form.action= '/employee.do'; 
		// var form = $('#register_form');
		// form.attr('action', '${ctx}/employee.do');
		// form.submit();
		
	}
	
	*/});
$('#cancel_btn').click(function(){
	alert('취소버튼클릭!!');
	});	
</script>
<!-- var form = $('#register_form')
		form.action ='/';
		form.submit('employee.do') -->
	