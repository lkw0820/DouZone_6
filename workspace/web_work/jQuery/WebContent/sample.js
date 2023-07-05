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
	var counts=[];
	var currentPno;
	var currentDate;
	
	
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
			html+='<td><input type="text" name="aCode" id="Code"></td>';
			html+='<td><select id="selectA">';
			html+='<option selected disabled hidden>선택하세요</option>';
			html+='<option value="D1901">금빛계란농장</option>';
			html+='<option value="F2801">한빛프레시원</option>';
			html+='<option value="M1034">매일유업</option>';
			html+='</select></td>';
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
	
	$('tbody').on('change','#selectA',function(e){
		e.stopPropagation();
		console.log($(this).val());
		console.log($(this).find('option:selected').text());
		console.log($(this).parent().parent().find('td').eq(3).find('input').attr('value',$(this).val()));

	})
	
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
		pNames=[];//차트를 위한 배열 초기화
		counts=[];
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
						counts.push(item.cnt);
					}
					
				
				})
				console.log(pNames);
				var context = document
			    .getElementById('myChart')
			    .getContext('2d');
				var myChart = new Chart(context, {
			    type: 'bar', // 차트의 형태
			    data: { // 차트에 들어갈 데이터
			        labels: pNames,
			        datasets: [
			            { //데이터
			                label: currentDate, //차트 제목
			                fill: false, // line 형태일 때, 선 안쪽을 채우는지 안채우는지
			                data: counts,
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
			            } ,
			            {
			                label: '적정재고량',
			                fill: false,
			                type:'line',
			                data: [
			                    8, 34, 12, 24
			                ],
			                backgroundColor: 'rgb(157, 109, 12)',
			                borderColor: 'rgb(157, 109, 12)'
			            } 
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
			}
		});

	}
	
	//등록 버튼을 누르면 input이 text로 바뀌고 detail입력창 생성
	$('#1').submit(function(e){
		e.preventDefault();
		console.log('asdfasdf');
		search.disabled=false;
		status=true;
		btnOverall.disabled=true;
		
		console.log($('#Code').val());
		$("#Code").parent().next().empty();
		switch($('#Code').val()){
		
			case "D1901":
				html ='<td><input type="text" name="aName" value="Golden Egg Farm"></td>';
				console.log(html);
				$("#Code").parent().next().append(html);
				break;
			case "F2801":
				html ='<td><input type="text" name="aName" value="Hanbi Fresh One"></td>';
				console.log(html);
				$("#Code").parent().next().append(html);
				break;
			case "M1034":
				html ='<td><input type="text" name="aName" value="maeil"></td>';
				console.log(html);
				$("#Code").parent().next().append(html);
				break;
		}
		//console.log(html);
		$.ajax({
			url:'serverP.jsp',
			type:'post',
			data:$(this).serialize(),
			dataType:'json',
			success:function(data){
				LoadOverall(data[data.length-1]);
				loadDetail(data[data.length-1].pno);
				insertDetail(data[data.length-1].pno);
				currentPno=data[data.length-1].pno;
			}
		});
		overall.deleteRow(1);
		return false;
	});
	$('#2').submit(function(e){
		e.preventDefault();
		status3=true;
		$.ajax({
			url:'serverDetail.jsp',
			type:'post',
			data:$(this).serialize(),
			dataType:'json',
			success:function(data){
				console.log(this);
				loadDetail(currentPno);
			}
		});
	});

	//테이블 클릭해서 해당 주문번호에 해당하는 품목들 가져오기
	$('#overall').on('click','tbody tr',function(){
		currentPno=$(this).find('td').eq(1).text();//선택된 발주번호
		currentDate=$(this).find('td').eq(0).text();//선택된 날짜
		loadDetail(currentPno);
		status3=true;
		
		//차트 관련

	});

	//detail추가버튼 해당 테이블을 클릭하였을때 활성화
	$('#detailAdd').on('click',function(){
		if(status3==true){
			console.log(currentPno);
			insertDetail(currentPno);
			status==false;
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
