<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<jsp:include page="../home/top.jsp"/>
<link rel="stylesheet" href="${css}/customer/mypage.css" />
<div class="grid-item" id="navi_bar">
				
				<div class="new_navi_bar grid-item">
					<div id="li_navi1"><a href="home.do">홈으로</a></div>
					<div id="li_navi2"><a href="#">카테고리</a></div>
					<div id="li_navi3"><a href="#">사원</a></div>
					<div id="li_navi4"><a href="#">주문</a></div>
					<div id="li_navi5"><a href="#">상품</a></div>
					<div id="li_navi6"><a href="#">선박</a></div>
					<div id="li_navi7"><a href="#">공급업체</a></div>
					
					</div>
					
				
</div>
<div class="grid-item" id= "side_bar">

	
	
	
	<form id="file_form">
		<img id="dimg"  style="height: 200px; width: 50%; ">
		<input type="file" name="file_upload" />
		<input type="submit" id="file_upload_btn" />
		<input type="hidden" name="cmd" value="cust_file_upload" />
		<input type="hidden" name="page" value="detail" />
	</form>
	
	
	</div>

	<div class="grid-item" id= "content">


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
	<div class="mypage2">${cust.phone}</div>
	<div class="mypage1">주소</div>
	<div class="mypage2">${cust.city}</div>
	<div class="mypage1">상세주소</div>
	<div class="mypage2">${cust.address}</div>
	<div class="mypage1">우편번호</div>
	<div class="mypage2">${cust.postalCode}</div>
</div>


</div>
<div class="grid-item update">
<div id= "update_btn1">
<span id="photo_btn" class="label label-danger" >사진수정</span>
</div>
<div id= "update_btn2">
<span id="update_btn" class="label label-warning" >정보수정</span>
</div>
<div id= "delete_btn">
<span id="fire_btn" class="label label-warning" >회원탈퇴</span>
</div>


</div>



		   
<jsp:include page="../home/bottom.jsp"/>



<script>
$(function(){
	$('#dimg')
	.attr('src','${img}${image.imgName}.${image.imgExtention}');
});
$('#update_btn').click(function(){
	
	alert('버튼클릭');
	location.assign('${ctx}/customer.do?cmd=cust_retrieve&page=update&customer_id=${cust.customerID}');
});
$('#delete_btn').click(function(){
	
	alert('버튼클릭');
	location.assign('${ctx}/customer.do?dir=home&cmd=cust_delete&page=main&customer_id=${cust.customerID}');
});


$('#file_upload_btn').attr('style','cursor:pointer').click(function(){
	$('#file_form')
	.attr('method','post')
	.attr('action','${ctx}/customer.do?cmd=cust_file_upload&page=detail&customer_id=${cust.customerID}')
	.attr('enctype','multipart/form-data')
	.submit();
});


</script>				   
				   
				   
