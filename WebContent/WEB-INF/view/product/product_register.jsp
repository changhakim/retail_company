<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="../home/top.jsp"/>

<div class="grid-item" id= "side_bar">
<h1>상품등록</h1>
</div>
	<div class="grid-item" id= "content">
	<form id="register_form" >
	<div id="register-container">
	
	
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">제품번호</span>
				    <input type="text" class="form-control" placeholder="숫자" aria-describedby="sizing-addon3" id="product_id" name="product_id">
				    </div>
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">상품이름</span>
				  	<input type="text" class="form-control" placeholder="" aria-describedby="sizing-addon3" id="product_name" name="product_name">
					</div>
					<div class="input-group input-group-lg">
				 	<span class="input-group-addon" id="sizing-addon3">담당자아이디</span>
				  	<input type="text" class="form-control" placeholder="숫자" aria-describedby="sizing-addon3" id="supplier_id" name="supplier_id">
					</div>
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">카테고리아이디</span>
				  	<input type="text" class="form-control" placeholder="숫자" aria-describedby="sizing-addon3" id="category_id" name="category_id">
					</div>
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">재고</span>
				  	<input type="text" class="form-control" placeholder="숫자" aria-describedby="sizing-addon3" id="unit" name="unit">
					</div>
					<div class="input-group input-group-lg">
				  	<span class="input-group-addon" id="sizing-addon3">가격</span>
				  	<input type="text" class="form-control" placeholder="숫자" aria-describedby="sizing-addon3" id="price" name="price">
					</div>
					
					
				<button type="button" class="btn btn-default btn-lg" id = "confirm_btn" >
				<span class="glyphicon glyphicon-tint" aria-hidden="true"></span> JOIN
				</button>
				<button type="button" class="btn btn-default btn-lg" id = "cancel_btn" >
				<span class="glyphicon glyphicon-tint" aria-hidden="true"></span> CANCEL
				</button>
	
				<input type="hidden" name="cmd" value="product_register"/>
				<input type="hidden" name="page" value="product_list"/>
	
		
	</div>
	</form>
	</div>
	


<jsp:include page="../home/bottom.jsp"></jsp:include>
<script>
$('#confirm_btn').click(function(){
	

	$('#register_form')
	.attr('action', '${ctx}/product.do')
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
	