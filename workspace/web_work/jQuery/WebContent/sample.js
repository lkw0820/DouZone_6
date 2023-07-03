$(function(){
	let status=true;//얘가 true일때만 행 삽입 조회
	const overall = document.querySelector('#overall');
	console.log(overall.tBodies[0].rows.length);
	const search=document.querySelector('#search');
	const btnOverall=document.querySelector('#overallSubmit');
	const btnDetail=document.querySelector('#detailSubmit');
	let status2=true;//overall 등록
	var cpno=-1;
	btnOverall.disabled=true;//등록버튼을 처음에 비활성화
	let status3=false;
	
	
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
					//console.log('성공');
				})
			}
		});
/*		console.log(status);
		console.log(table.tBodies[0].rows.length);*/
	});
	$('#overallAdd').on('click',function(){
		if(status==true){
			let html = '<tr><td><input type="date" name="date"></td>';
			html+='<td><input type="text" name="pno"></td>';
			html+='<td><input type="text" name="aCode"></td>';
			html+='<td><input type="text" name="aName"></td>';
			html+='<td><input type="text" name="eName"></td>';
			html+='<td><input type="text" name="status"></td></tr>';
			$('#overall').prepend(html);
			status=false;
			search.disabled=true;
			btnOverall.disabled=false;
		}else{
			alert("등록을 먼저해주세용")
		}
	})
	function insertDetail(pno){
		let html = '<tr><td><input type="text" name="pno" value="'+pno+'"style="display:none;">';
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
	function loadDetail(currentPno){
		$('#detail tbody').empty();
		$.ajax({
			url:'serverDetail.jsp',
			type:'post',
			dataType:'json',
			success:function(data){
				$.each(data,function(index,item){
					console.log(item.pno);
					if(currentPno==item.pno){
						let html = '<tr><td>'+item.productCode+'</td>';
						html+='<td>'+item.productName+'</td>';
						html+='<td>'+item.unit+'</td>';
						html+='<td>'+item.cnt+'</td>';
						html+='<td>'+item.price+'</td>';
						html+='<td>'+item.supplyValue+'</td>';
						html+='<td>'+item.vat+'</td>';
						html+='<td>'+item.totalPrice+'</td>';
						html+='<td>'+item.note+'</td></tr>';
						$('#detail').append(html);
					}
					
				//console.log('성공');
				})
			}
		});

	}
	
	//등록 버튼을 누르면 input이 text로 바뀌고 detail입력창 생성
	$('#1').submit(function(){
		console.log('asdfasdf');
		search.disabled=false;
		status=true;
		btnOverall.disabled=true;
		$.ajax({
			url:'serverP.jsp',
			type:'post',
			data:$(this).serialize(),
			dataType:'json',
			success:function(data){
				console.log('보내기 성공');
				LoadOverall(data[data.length-1]);
				console.log(data[data.length-1].pno);
				loadDetail(data[data.length-1].pno);
				insertDetail(data[data.length-1].pno);
			}
		});
		overall.deleteRow(1);
		//$('#1')[0].reset();
		return false;
	});
	$('#2').submit(function(e){
		e.preventDefault();
		$.ajax({
			url:'serverDetail.jsp',
			type:'post',
			data:$(this).serialize(),
			dataType:'json',
			success:function(data){
				console.log('보내기 성공');
				console.log(data[data.length-1].pno);
				loadDetail(data[data.length-1].pno);
				//insertDetail(data[data.length-1].pno);
			}
		});
	});

	//테이블 클릭해서 해당 주문번호에 해당하는 품목들 가져오기
	$('#overall').on('click','tbody tr',function(){
		console.log('성공');
		let currentPno=$(this).find('td').eq(1).text();//선택된 발주번호
		console.log(currentPno);
		loadDetail(currentPno);
		status3=true;
	});

	//detail추가버튼 해당 테이블을 클릭하였을때 활성화
	$('#detailAdd').on('click',function(){
		if(status3==true){
			let currentPno=$('#detail tobody').find('td').find('input').eq(0).text();
			console.log(currentPno);
			insertDetail(currentPno);
		}
	});
	
	
	
});