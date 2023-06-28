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
/*$(function(){
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
});*/

//step7
$(function(){
	$('#switcher div').hover(function(){
		$(this).addClass('hover');
	},function(){
		$(this).removeClass('hover');
	})
});

//step8 <h3>스타일변환기</h>를 클릭했을때 버튼 3개가 화면에서 사라지게
/*$(function(){
	$('#switcher h3').click(function(){
		$('#switcher div').toggleClass('hidden');
	})
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
});*/

//step9 이벤트 버블링 방지
/*$(function(){
	$('#switcher').click(function(){
		$('#switcher div').toggleClass('hidden');
	})
	$('#switcher div').click(function(e){
		e.stopPropagation();
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
*/

//step10 on('click)으로 이벤트 발생 -> off('click')으로 이벤트 해제
//large, narrow 버튼을 클릭후 사라지는게 안되게
$(function(){
	$('#switcher').on('click.e1',function(){
		$('#switcher div').toggleClass('hidden');
	});
	$('#switcher').on('click.e2',function(){
		alert('안녕');
	});
	
	$('#switcher div').click(function(e){
		e.stopPropagation();
		$('div[class*=selected]').removeClass('selected');
		$(this).addClass('selected');
		$('body').removeClass();
		if(this.id=='switcher-large'){
			$('body').addClass('large');
			$('#switcher').off('click');
		}
		if(this.id=='switcher-narrow'){
			$('body').addClass('narrow');
			$('#switcher').off('click');
		}
		if(this.id=='switcher-default'){
			$('#switcher').on('click.e1');
		}
	});
/*	$('#switcher-large, #switcher-narrow').click(function(){
		$('#switcher').off('click.e1');
	});*/
	
	//$('#switcher').trigger('click.e1');//이벤트 자동으로 발생
	$('#switcher').click();//이벤트 발생
	
});
































