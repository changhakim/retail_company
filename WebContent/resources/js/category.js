var context ="${ctx}";
$('#category').attr('style','cursor:pointer')
.click(function(){
	location.assign(
			ctx+'/category.do?cmd=category_list&page=list');
});

$('#cate_register').click(()=>{
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_register').attr('style','background-color: #d9edf7');
	
	$('#content').html(
				'<form id="form">'
			+'    <div class="form-group">'
			+'      <label for="text">카테고리이름</label>'
			+'      <input type="text" class="form-control" id="cate_name" placeholder="Enter email" name="cate_name">'
			+'    </div>'
			+'    <div class="form-group">'
			+'      <label for="text">상세설명</label>'
			+'      <textarea rows="4" clos="50" class="form-control" id="description" placeholder="Enter password" name="description"></textarea>'
			+'    </div>'
			+'    <button type="submit" class="btn btn-primary">Submit</button>'
			+'  </form>'
			+'</div>');
});
$('#search').click(()=>{
	
	
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#search').attr('style','background-color: #d9edf7');
	$('#content').html(
				'<form id="form">'
			+'    <div class="form-group">'
			+'      <label for="text">카테고리 검색:</label>'
			+'      <input type="text" class="form-control" id="cate_name" placeholder="Enter email" name="cate_name">'
			+'    </div>'
			+'<select>'
			+' <option name="cate_id" value="1000">스마트폰</option>'
			+' <option name="cate_id" value="1001">데스크탑</option>'
			+' <option name="cate_id" value="1002">노트북</option>'
			+' </select>'
			+'    <button type="submit" class="btn btn-primary">Search</button>'
			+'  </form>'
			+'</div>');
});

$('#cate_update').click(()=>{
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_update').attr('style','background-color: #d9edf7');
	$('#content').html(
			 
			 		'<form action="/action_page.php">'
			  +			 '<h1>수정할카테고리</h1>'
			  +			'<input type="radio" name="gender" value="male"> 스마트폰<br>'
			  +			'<input type="radio" name="gender" value="female">데스크탑<br>'
			  +			'<input type="radio" name="gender" value="other"> 노트북<br>'
			  +			'</form>'	
			  +'<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">'
			  +'  수정하기'
			  +'</button>'
			
			  
			  +'<div class="modal" id="myModal">'
			  +'<div class="modal-dialog">'
			  +		'<div class="modal-content">'
			 
			  +'    <div class="modal-header">'
			  +'        <h4 class="modal-title">카테고리수정</h4>'
			  +'        <button type="button" class="close" data-dismiss="modal">&times;</button>'
			  +'      </div>'
			        
			  
			  +'       <div class="modal-body">'
			  +'       카테고리이름'
			  +'  	  <input type="text" class="form-control" id="cate_name" placeholder="Enter email" name="cate_name"> '  
			  +'       카테고리설명'
			  +'   <textarea rows="4" clos="50" class="form-control" id="description" placeholder="Enter password" name="description"></textarea>'   
			  +'</div>'
			        
			  
			  +'      <div class="modal-footer">'
			  +'        <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>'
			  +'      </div>'
			        
			  +'    </div>'
			  +'  </div>'
			  +' </div>'
			  
			 
			 );
});
	






$('#cate_delete').click(()=>{
	$('#cate_side_menu > li').attr('style','background-color: white');
	$('#cate_delete').attr('style','background-color: #d9edf7');
	$('#content').html(
			'<form action="/action_page.php">'
			+'<h1>삭제할카테고리</h1>'
			+'<input type="checkbox" name="vehicle1" value="Bike"> 스마트폰<br>'
			+'<input type="checkbox" name="vehicle2" value="Car"> 데스크탑<br>'
			+'<input type="checkbox" name="vehicle3" value="Boat" checked> 노트북<br><br>'
			+'<input type="submit" value="Submit">'
			+'</form>'		
	
	);
});