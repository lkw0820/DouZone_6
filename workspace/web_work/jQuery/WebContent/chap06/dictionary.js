//step1
$(function(){
	//load는  html일때
	$('#letter-a a').on('click',function(){
		$('#dictionary').hide().load('a.html',function(){
			$(this).fadeIn();
		});
		
		return false;//기본 이벤트 취소
	})
});

/*//step2
$(function(){
	//getJSON은 json파일
	$('#letter-b a').on('click',function(){
		$.getJSON('b.json',function(data){
			$('#dictionary').empty();
			//결과값 : 배열:[{},{},{}] => HTML로 변환
			$.each(data,function(index,item){
				let html = '<div class="entry">';
				html+= '<h3 class="term">'+item.term +'</h3>';
				html+= '<div class="part">'+item.part +'</div>';
				html+= '<div class="definition">'+item.definition +'</div>';
				html+='</div>';
				
				$('#dictionary').append(html);
			});
		});
		return false;//기본 이벤트 취소
	});
});*/
//step2-1 getJSON->ajax로 변환
$(function(){
	//getJSON은 json파일
	$('#letter-b a').on('click',function(){
		$.ajax({
			url:'b.json',
			type:'get',
			dataType:'json',
			success:function(data){
				$('#dictionary').empty();
				data.sort(function(a,b){
					if(a.term<b.term){
						return 1;
					}else if(a.term>b.term){
						return -1;
					}else{
						return 0;
					}
				})
				$.each(data,function(index,item){
					let html = '<div class="entry">';
					html+= '<h3 class="term">'+item.term +'</h3>';
					html+= '<div class="part">'+item.part +'</div>';
					html+= '<div class="definition">'+item.definition +'</div>';
					html+='</div>';
					
					$('#dictionary').append(html);
				});//each
			}//success				
		});//ajax
		return false;//기본 이벤트 취소
	});
});

//step3
$(function(){
	//getScript는  자바스크립트일때
	$('#letter-c a').on('click',function(){
		$.getScript('c.js');
		
		return false;//기본 이벤트 취소
	})
});

//step4
$(function(){
	//  xml=>HTML변환=> 화면 출력
	$('#letter-d a').on('click',function(){
		$.get('d.xml',function(data){
			$('#dictionary').empty();
			$(data).find('entry').each(function(index){
				$entry= $(this);
				let html = '<div class="entry">';
				html+= '<h3 class="term">'+$entry.attr('term') +'</h3>';
				html+= '<div class="part">'+$entry.attr('part') +'</div>';
				html+= '<div class="definition">'+$entry.find('definition').text() +'</div>';
				html+='</div>';
				
				$('#dictionary').append(html);
			});
		});
		
		return false;//기본 이벤트 취소
	});
});

//step5
$(function(){
	$('#letter-e a').on('click',function(){
		$.get('server3.jsp',{'term':$(this).text()},function(data){
			$('#dictionary').text(data);
		})
		return false;//기본 이벤트 취소
	})
});

//step6
$(function(){
	$('#letter-f form').submit(function(){
		$.ajax({
			url:'server3.jsp',
			type:'post',
			data:$(this).serialize(),
			dataType:'text',
			success:function(data){
				$('#dictionary').text(data);
			}
		});
		
		return false;//기본 이벤트 취소
	})
});






















