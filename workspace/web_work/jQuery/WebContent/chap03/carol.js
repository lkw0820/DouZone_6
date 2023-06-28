//step1
/*$(function(){
	$('#switcher-large').on('click',function(){
		$('body').addClass('large');
	});
});*/

//step2 : largePrint -> large, narrowcolum->narrow, default-> 처음
//addClass('클래스명') 삭제: removeClass()
//$(function(){
//	$('#switcher-large').on('click',function(){
//		$('body').removeClass('narrow').addClass('large');
//	});
//	$('#switcher-narrow').on('click',function(){
//		$('body').removeClass('large').addClass('narrow');
//	});
//	$('#switcher-default').on('click',function(){
//		//$('body').removeClass();
//		$('body').removeClass('narrow').removeClass('large');
//	});
//	
//});

//step3 : 클릭한 버튼만 seleted 스타일 적용
/*$(function(){
	$('#switcher-large').on('click',function(){
		$('body').removeClass('narrow').addClass('large');
		$('div[class*=selected]').removeClass('selected');
		$(this).addClass('selected');


		
	});
	$('#switcher-narrow').on('click',function(){
		$('body').removeClass('large').addClass('narrow');
		$('div[class*=selected]').removeClass('selected');
		$(this).addClass('selected');

	});
	$('#switcher-default').on('click',function(){
		//$('body').removeClass();
		$('body').removeClass('narrow').removeClass('large');
		$('div[class*=selected]').removeClass('selected');
		$(this).addClass('selected');

	});
	
});*/

//step4 : selected관련 최적화
/*$(function(){
	$('#switcher-large').on('click',function(){
		$('body').removeClass('narrow').addClass('large');
		//$('div[class*=selected]').removeClass('selected');
		//$(this).addClass('selected');
	});
	$('#switcher-narrow').on('click',function(){
		$('body').removeClass('large').addClass('narrow');
		//$('div[class*=selected]').removeClass('selected');
		//$(this).addClass('selected');
	});
	$('#switcher-default').on('click',function(){
		//$('body').removeClass();
		$('body').removeClass('narrow').removeClass('large');
		//$('div[class*=selected]').removeClass('selected');
		//$(this).addClass('selected');
	});
	
	$('#switcher div').on('click',function(){
		$('div[class*=selected]').removeClass('selected');
		$(this).addClass('selected');
	})
	
});*/

//step5: 전체적으로 중복된 코드 최적화
/*$(function(){
	$('#switcher div').on('click',function(){
		$('div[class*=selected]').removeClass('selected');
		$(this).addClass('selected');
		$('body').removeClass();
		if(this.id=='switcher-large'){
			$('body').addClass('large');
		}
		if(this.id=='switcher-narrow'){
			$('body').addClass('narrow');
		}
	});
	$('#switcher-large').on('click',function(){
		$('body').removeClass('narrow').addClass('large');
	});
	$('#switcher-narrow').on('click',function(){
		$('body').removeClass('large').addClass('narrow');
	});
	$('#switcher-default').on('click',function(){
		$('body').removeClass('narrow').removeClass('large');
	});
});*/

//step6:이벤트 통합 함수-> 개별 이벤트 함수 변경
$(function(){
	$('#switcher div').click(function(){
		$('div[class*=selected]').removeClass('selected');
		$(this).addClass('selected');
		$('body').removeClass();
		if(this.id=='switcher-large'){
			$('body').addClass('large');
		}
		if(this.id=='switcher-narrow'){
			$('body').addClass('narrow');
		}
	});
});



















