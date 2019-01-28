<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
#register-container {
  display: grid;
  grid-template-columns: auto auto auto auto;
  grid-gap: 1px;
  background-color: white;
  padding: 50px;
  width: 400px;
  margin: auto;
  
  
   
}
#register-container > div {
  background-color: white;
  border: 1px solid black;
  text-align: center;
  font-size: 15px;
  height: 40px;
  
}
#register-container > div >input{
margin-top: 10px
}
.re1 {
grid-column-start:1; 
grid-column-end:2;
}
.re2 {
grid-column-start:2; 
grid-column-end:5;

}
.re3 {
grid-column-start:1; 
grid-column-end:3;
}
.re4 {
grid-column-start:3; 
grid-column-end:5;
}

</style>

<h1>사원등록</h1>
	
	<form action="employee.do">
			
		
	<div id="register-container">
	<div class="re1">사원번호</div>
	<div class="re2"><input type="text"  name="employeeID" /></div>
	<div class="re1">이름</div>
	<div class="re2"><input type="text"  name="name" /></div>
	<div class="re1">매니저</div>
	<div class="re2"><input type="text" name="manager" /></div>
	<div class="re1">생년월일</div>
	<div class="re2"><input type="text" name="birthDate" /></div>
	<div class="re1">상세</div>
	<div class="re2"><input type="text" name="notes" /> </div>
	<div class="re3"><input type="submit" id = "confirm_btn" value="확인" /></div>
	<div class="re4"><input type="submit" id = "cancel_btn" value="취소" /> </div>	
		
	</div>
	</form>



<script>
$('#confirm_btn').click(function(){
	alert('확인버튼클릭!!');
	});
$('#cancel_btn').click(function(){
	alert('취소버튼클릭!!');
	});	
</script>

	