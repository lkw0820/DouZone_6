$(function(){
	$('div.label').click(function(){
		const pWidth = $('div.speech p').outerWidth();
		const divWidth = $('#switcher').outerWidth();
		
		const num = parseInt(pWidth)-parseInt(divWidth);
		$('#switcher')
			.fadeTo('fast',0.5)
			.animate({marginLeft:num},'slow')
			.fadeTo('fast',1.0)
			.slideUp('slow',function(){
				$(this).css('background','red')
			})
			.slideDown('slow');
	});
});
//2번째 p태그를 화면에서 숨긴다 eq(),hide()
//a태그를 클릭: 다시 보여주기 slideUP+slideDown=slideToggle
//read more => 클릭 => read less
//read less => 클릭 => read more
//text(값):값변경, text():값 추출
$(function(){
	$('.speech p').eq(1).hide();
	$('.more').on('click',function(){
		$('.speech p').eq(1).slideToggle("slow");
		if($('.more').text()=='read more'){
			$('.more').text('read less');
		}else{
			$('.more').text('read more');
		}
	});
	
});

$(function(){
	const $speech = $('div.speech');
	const defaultSize = parseInt($speech.css('fontSize'));//parseInt()자신이 변환할수있는것만 변환해서 리턴함
	console.log(defaultSize);
	$('#switcher button').click(function(){
		let num = parseInt($speech.css('fontSize'));
		
		switch(this.id){
			case 'switcher-large':
				num *=1.2;
				break;
			case 'switcher-small':
				num /=1.2;
				break;
			default:
				num = defaultSize;
				break;
		}
		
		$speech.animate({fontSize:num+'px'},'slow');
	});
})
//





















