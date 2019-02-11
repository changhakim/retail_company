<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../home/top.jsp"/>

<div class="grid-item" id= "side_bar">
<h1>회원등록</h1>
</div>
	<div class="grid-item" id= "content">
	<form id="register_form" >
	<div id="register-container">
	
	
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">아이디</span>
				    <input type="text" class="form-control" placeholder="4자리이상 알파벳 숫자" aria-describedby="sizing-addon3" id="cusID" name="cusID">
				    </div>
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">비밀번호</span>
				  	<input type="text" class="form-control" placeholder="4자리이상" aria-describedby="sizing-addon3" id="password" name="password">
					</div>
					<div class="input-group input-group-lg">
				 	<span class="input-group-addon" id="sizing-addon3">이름</span>
				  	<input type="text" class="form-control" placeholder="한글" aria-describedby="sizing-addon3" id="cusname" name="cusname">
					</div>
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">PHONE</span>
				  	<input type="text" class="form-control" placeholder="010-XXXX-XXXX" aria-describedby="sizing-addon3" id="phone" name="phone">
					</div>
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">주소</span>
				  	<input type="text" class="form-control" placeholder="예.서울특별시 종로구 xxxx" aria-describedby="sizing-addon3" id="city" name="city">
					</div>
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">상세주소</span>
				  	<input type="text" class="form-control" placeholder="예 xx아파트xx동xx호" aria-describedby="sizing-addon3" id="address" name="address">
					</div>
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">postalcode</span>
				  	<input type="text" class="form-control" placeholder="예.158-15" aria-describedby="sizing-addon3" id="postalcode" name="postalcode">
					</div>
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">주민등록번호</span>
				  	<input type="text" class="form-control" placeholder="예.901215-" aria-describedby="sizing-addon3" id="ssn" name="ssn" >
					</div>
					
				<button type="button" class="btn btn-default btn-lg" id = "confirm_btn" >
				<span class="glyphicon glyphicon-tint" aria-hidden="true"></span> JOIN
				</button>
				<button type="button" class="btn btn-default btn-lg" id = "cancel_btn" >
				<span class="glyphicon glyphicon-tint" aria-hidden="true"></span> CANCEL
				</button>
	
	<input type="hidden" name="cmd" value="cusregister"/>
	<input type="hidden" name="page" value="signin"/>
	
		
	</div>
	</form>
	</div>
	


<jsp:include page="../home/bottom.jsp"></jsp:include>
<script>
$('#confirm_btn').click(function(){
	

	$('#register_form')
	.attr('action', '${ctx}/customer.do')
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
	