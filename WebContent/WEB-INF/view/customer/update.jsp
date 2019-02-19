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
	<div class="mypage1">아이디</div>
	<div class="mypage2">${cust.customerID}</div>
	<div class="mypage1">이름</div>
	<div class="mypage2">${cust.customerName}</div>
	<div class="mypage1">생년월일</div>
	<div class="mypage2">${cust.ssn}</div>
	<div class="mypage1">성별</div>
	<div class="mypage2">${cust.gender}</div>
	<div class="mypage1">전화번호</div>
	<div class="mypage2"><input type="text" id="phone" name="phone" placeholder="${cust.phone}" /></div>
	<div class="mypage1">주소</div>
	<div class="mypage2"><input type="text" id="city" name="city" placeholder="${cust.city}" /></div>
	<div class="mypage1">상세주소</div>
	<div class="mypage2"><input type="text" id="address" name="address" placeholder="${cust.address}"/></div>
	<div class="mypage1">우편번호</div>
	<div class="mypage2"><input type="text" id="postal_code" name="postal_code" placeholder="${cust.postalCode}"/></div>
	<div class="mypage1">임시비밀번호</div>
	<div class="mypage2"><input type="text" id="password" name="password" placeholder="임시비밀번호" /></div>
	<input type="hidden" name="cmd"  value="detail_update"/><br />
	<input type="hidden" name="page" value="detail"/>
	<input type="hidden" name="customer_id" value="${cust.customerID}" />
	
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
	
	$('#update_form').attr('action','${ctx}/customer.do').attr('method','post').submit();
});
$('#cancel_btn').click(function(){
	
	alert('취소버튼클릭');
});
</script>				   
				   
				   
