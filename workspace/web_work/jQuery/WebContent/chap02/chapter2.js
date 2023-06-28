$(function(){
	$('#selected-plays>li').addClass('horizontal');
	
	$('li:not(.horizontal)').addClass('sub-level');
	
	$('a[href$="pdf"]').addClass('pdflink');
	
	$('a[href^="mailto"]').addClass('mailto');
	
	//$('a[href*="henry"]:not(.mailto)').addClass('henrylink');
	$('a[href*="henry"]').not('.mailto').addClass('henrylink');
	//$('tr:odd').addClass('alt');//홀수지만 우리눈에는 짝수번째가 바뀜
	//$('tr:nth-child(odd)').addClass('alt');//홀수번째
	$('tr').filter(':odd').addClass('alt');//filter사용 짝수번째
	//not:조건에 맞는 대상을 제거 filter:조건에 맞는 대상 선택
	//$('td:contains(Henry)').addClass('highlight');
	//$('td:contains(Henry)').nextAll().andSelf().addClass('highlight');
	//$('td:contains(Henry)').parent().find('td').addClass('highlight');
	$('td:contains(Henry)').parent().find('td:eq(0)').addClass('highlight').end().find('td:eq(1)').addClass('highlight');
	
	//each(): 해당 요소마다 각각의 작업을 수행
/*	$.each(배열,function(index,item){ 전역함수로서 사용
		배열의 각 요소들의 작업을 수행
	})*/
//	$('선택자').each(function(index,item){
//		각 요소들의 작업을 수행
//	})

})