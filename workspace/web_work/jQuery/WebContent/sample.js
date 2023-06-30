$(function(){
	$('.search').on('click',function(e){
		e.preventDefault();
		let html = '<tr><td><input type="date" name="date"></td>';
		html+='<td>발주번호</td>';
		html+='<td>거래처코드</td>';
		html+='<td>거래처이름</td>';
		html+='<td><input type="text" name="eName"></td>';
		html+='<td></td></tr>';
		$('#overall').append(html);
	});
	$('form').submit(function(){
		$.ajax({
			url:'serverP.jsp',
			type:'post',
			data:$(this).serialize(),
			dataType:'json',
			success:function(){
				$()
			}
		});
		return false;
	})
})