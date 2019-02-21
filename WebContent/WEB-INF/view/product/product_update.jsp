<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/customer/mypage.css" />
<div class="grid-item" id="navi_bar">
				<ul class="ul_navi_bar">
					<li ><a href="home.do">홈으로</a></li>
					<li ><a href="#">카테고리</a></li>
					<li ><a href="#">사원</a></li>
					<li ><a href="#">주문</a></li>
					<li ><a href="#">상품</a></li>
					<li ><a href="#">선박</a></li>
					<li ><a href="#">공급업체</a></li>
					
				</ul>
</div>
<div class="grid-item" id= "side_bar">

	<div class= "myphoto">
	<div class= "myphotoin"><img src="${img}/default_image.jpg"  style="height: 200px; width: 100%; "></div>
	</div>
</div>

	<div class="grid-item" id= "content">

		<%-- <div class ="mypage">
		<div class ="mypage1">
		아이디:<br />
		이름: <br />
		전화번호:<br />
		주소:<br />
		상세주소:<br />
		우편번호:<br />
		임시비밀번호:<br />
		</div>
		
		<div class ="mypage2">
		
		${cust.customerID} <br />
		${cust.customerName} <br />
		
		<input type="text" id="phone" name="phone" placeholder="${cust.phone}" /> <br />
		<input type="text" id="city" name="city" placeholder="${cust.city}" /> <br />
		<input type="text" id="address" name="address" placeholder="${cust.address}" /> <br />
		<input type="text" id="postal_code" name="postal_code" placeholder="${cust.postalCode}" /><br />
		<input type="text" id="password" name="password" placeholder="임시비밀번호" /><br />
		<input type="hidden" name="cmd"  value="detail_update"/><br />
		<input type="hidden" name="page" value="detail"/>
		<input type="hidden" name="customer_id" value="${cust.customerID}" />
		
		</div>
		</div> --%>
	<form id="update_form">
	<div class="mypage">
	<div class="mypage1">제품번호</div>
	<div class="mypage2">${pro.productID}</div>
	<div class="mypage1">상품이름</div>
	<div class="mypage2"><input type="text" id="product_name" name="product_name" placeholder="${pro.productName}"/></div>
	<div class="mypage1">담당자아이디</div>
	<div class="mypage2">${pro.supplierID}</div>
	<div class="mypage1">카테고리아이디</div>
	<div class="mypage2">${pro.categoryID}</div>
	<div class="mypage1">재고</div>
	<div class="mypage2"><input type="text" id="unit" name="unit" placeholder="${pro.unit}" /></div>
	<div class="mypage1">가격</div>
	<div class="mypage2"><input type="text" id="price" name="price" placeholder="${pro.price}" /></div>
	
	
	<input type="hidden" name="cmd"  value="product_update"/><br />
	<input type="hidden" name="page" value="product_detail"/>
	<input type="hidden" name="product_id" value="${pro.productID}" />
	
</div>
</form>


</div>
<div class="grid-item update">
<div class= "update_btn1">
<span id="confirm_btn" class="label label-success" >확인</span>
</div >
<div class= "update_btn2">
<span id="cancel_btn" class="label label-danger" >취소</span>
</div>
</div>




		   
<jsp:include page="../home/bottom.jsp"/>



<script>
$('#confirm_btn').attr('style','cursor:pointer').click(function(){
	
	$('#update_form').attr('action','${ctx}/product.do').attr('method','post').submit();
});
$('#cancel_btn').click(function(){
	
	alert('취소버튼클릭');
});
</script>				   
				   
				   
    