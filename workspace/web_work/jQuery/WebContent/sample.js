$(function(){
	let status=true;//얘가 true일때만 행 삽입
	const table = document.querySelector('#overall');
	console.log(table.tBodies[0].rows.length);
	const btn=document.querySelector('#search');
	var cpno=-1;
	
	
	function LoadOverall(item){
		let html = '<tr><td>'+item.date+'</td>';
		html+='<td>'+item.pno+'</td>';
		html+='<td>'+item.aCode+'</td>';
		html+='<td>'+item.aName+'</td>';
		html+='<td>'+item.eName+'</td>';
		html+='<td>'+item.status+'</td></tr>';
		$('#overall').append(html);
	}
	
	

	//조회버튼을 누르면 목록들이 나오고 입력할 수 이쓴ㄴ row 생성
	$('#search').on('click',function(e){
		e.preventDefault();
		$.ajax({
			url:'serverP.jsp',
			type:'post',
			dataType:'json',
			success:function(data){
				$.each(data,function(index,item){
					LoadOverall(item);
					console.log('성공');
				})
			}
		});
		if(status==true){
			let html = '<tr><td><input type="date" name="date"></td>';
			html+='<td><input type="text" name="pno"></td>';
			html+='<td><input type="text" name="aCode"></td>';
			html+='<td><input type="text" name="aName"></td>';
			html+='<td><input type="text" name="eName"></td>';
			html+='<td><input type="text" name="status"></td></tr>';
			$('#overall').prepend(html);
			status=false;
			btn.disabled=true;
		}
/*		console.log(status);
		console.log(table.tBodies[0].rows.length);*/
	});
	//등록 버튼을 누르면 input이 text로 바뀌고 detail입력창 생성
	$('#1').submit(function(){
		console.log('asdfasdf');
		btn.disabled=false;
		status=true;
		$.ajax({
			url:'serverP.jsp',
			type:'post',
			data:$(this).serialize(),
			dataType:'json',
			success:function(data){
				console.log(data[0]);
				console.log($(data));
				console.log('보내기 성공');
				table.deleteRow(-1);
				LoadOverall(data[data.length-1]);
				console.log(data[data.length-1].pno);
				let html = '<tr><td><input type="text" name="pno" value="'+data[data.length-1].pno+'"style="display:none;">';
				html+='<input type="text" name="productCode"></td>';
				html+='<td><input type="text" name="productName"></td>';
				html+='<td><input type="text" name="unit"></td>';
				html+='<td><input type="text" name="cnt"></td>';
				html+='<td><input type="text" name="price"></td>';
				html+='<td><input type="text" name="supplyValue"></td>';
				html+='<td><input type="text" name="vat"></td>';
				html+='<td><input type="text" name="totalPrice"></td>';
				html+='<td><input type="text" name="note"></td></tr>';
				$('#detail').append(html);
				
			}
		});
		
		
		
		return false;
	})
})