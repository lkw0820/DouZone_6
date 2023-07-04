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
	var pNames=[];
	var prices=[];
	//var selectedPno;
	var currentPno;
	
	
	function LoadOverall(item){	
		let html = '<tr><td>'+item.date+'</td>';
		html+='<td>'+item.pno+'</td>';
		html+='<td><input type="checkbox" class="form-check-input"></td>';
		html+='<td>'+item.aCode+'</td>';
		html+='<td>'+item.aName+'</td>';
		html+='<td>'+item.eName+'</td>';
		html+='<td>'+item.status+'</td></tr>';
		$('#overall').append(html);
	}
	
	

	//조회버튼을 누르면 목록들이 나오고 입력할 수 이쓴ㄴ row 생성
	$('#search').on('click',function(e){
		e.preventDefault();
		$('#overall tbody').empty();
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
	});
	//위에거 추가
	$('#overallAdd').on('click',function(){
		if(status==true){
			let html = '<tr><td><input type="date" name="date"></td>';
			html+='<td><input type="text" name="pno"></td>';
			html+='<td><input type="checkbox" class="form-check-input"></td>';
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
	});
	$('#searchDate').change(function(){
		let selectedDate=this.value;
		$('#overall tbody').empty();
		$.ajax({
			url:'serverP.jsp',
			type:'post',
			dataType:'json',
			success:function(data){
				$.each(data,function(index,item){
					if(selectedDate==item.date)
					LoadOverall(item);
				})
			}
		});
		
	});
	function insertDetail(pno){
		let html = '<tr><td><input type="text" name="pno" value="'+pno+'"style="display:none;">';
		html+='<input type="text" name="productCode"></td>';
		html+='<td><input type="checkbox" class="form-check-input"></td>';
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
		pNames.lenght=0;//차트를 위한 배열 초기화
		prices.lenght=0;
		$.ajax({
			url:'serverDetail.jsp',
			type:'post',
			dataType:'json',
			success:function(data){
				$.each(data,function(index,item){
					//console.log(item.pno);
					if(currentPno==item.pno){
						let html = '<tr><td>'+item.productCode+'</td>';
						html+='<td><input type="checkbox" class="form-check-input"></td>';
						html+='<td>'+item.productName+'</td>';
						html+='<td>'+item.unit+'</td>';
						html+='<td>'+item.cnt+'</td>';
						html+='<td>'+item.price+'</td>';
						html+='<td>'+item.supplyValue+'</td>';
						html+='<td>'+item.vat+'</td>';
						html+='<td>'+item.totalPrice+'</td>';
						html+='<td>'+item.note+'</td></tr>';
						$('#detail').append(html);
						pNames.push(item.productName);
						prices.push(item.price);
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
				currentPno=data[data.length-1].pno;
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
				console.log(this);
				loadDetail(currentPno);
				//insertDetail(data[data.length-1].pno);
			}
		});
	});

	//테이블 클릭해서 해당 주문번호에 해당하는 품목들 가져오기
	$('#overall').on('click','tbody tr',function(){
		console.log('성공');
		currentPno=$(this).find('td').eq(1).text();//선택된 발주번호
		console.log(currentPno);
		loadDetail(currentPno);
		status3=true;
		
		//차트 관련
		console.log(pNames);
		console.log(prices);
		var context = document
	    .getElementById('myChart')
	    .getContext('2d');
		var myChart = new Chart(context, {
	    type: 'bar', // 차트의 형태
	    data: { // 차트에 들어갈 데이터
	        labels: [
	            //x 축
	            '1','2','3','4','5','6','7'
	        ],
	        datasets: [
	            { //데이터
	                label: 'test1', //차트 제목
	                fill: false, // line 형태일 때, 선 안쪽을 채우는지 안채우는지
	                data: [
	                    21,19,25,20,23,26,25 //x축 label에 대응되는 데이터 값
	                ],
	                backgroundColor: [
	                    //색상
	                    'rgba(255, 99, 132, 0.2)',
	                    'rgba(54, 162, 235, 0.2)',
	                    'rgba(255, 206, 86, 0.2)',
	                    'rgba(75, 192, 192, 0.2)',
	                    'rgba(153, 102, 255, 0.2)',
	                    'rgba(255, 159, 64, 0.2)'
	                ],
	                borderColor: [
	                    //경계선 색상
	                    'rgba(255, 99, 132, 1)',
	                    'rgba(54, 162, 235, 1)',
	                    'rgba(255, 206, 86, 1)',
	                    'rgba(75, 192, 192, 1)',
	                    'rgba(153, 102, 255, 1)',
	                    'rgba(255, 159, 64, 1)'
	                ],
	                borderWidth: 1 //경계선 굵기
	            }/* ,
	            {
	                label: 'test2',
	                fill: false,
	                data: [
	                    8, 34, 12, 24
	                ],
	                backgroundColor: 'rgb(157, 109, 12)',
	                borderColor: 'rgb(157, 109, 12)'
	            } */
	        ]
	    },
	    options: {
	        scales: {
	            yAxes: [
	                {
	                    ticks: {
	                        beginAtZero: true
	                    }
	                }
	            ]
	        }
	    }
	});
	});

	//detail추가버튼 해당 테이블을 클릭하였을때 활성화
	$('#detailAdd').on('click',function(){
		if(status3==true){
			//let currentPno=$('#detail tobody').find('td').find('input').eq(0).text();
			console.log(currentPno);
			insertDetail(currentPno);
		}
	});
	
	
//	$('#delete').on('click',function(){
//		console.log($('#overall tbody').find('tr'))
//		$.each($('#overall tbody').find('tr'),function(){
//			let td=$(this).find('td');
//			//console.log(td.eq(2).find('input'));
//			//console.log(td.eq(1).text());
//			if(td.eq(2).find('input').is(':checked')==true){
//				let dPno=td.eq(1).text();
//				console.log(dPno);
//				$.ajax({
//					url:'serverP.jsp',
//					method:'DELETE',
//					data:{"aCode":"1","aName":"","date":"","eName":"","pno":dPno,"status":""},
//					dataType:'json',
//					success:function(data){
//						console.log('삭제');
//
//					}
//				});
//			}
//		});
//	});
	
});
