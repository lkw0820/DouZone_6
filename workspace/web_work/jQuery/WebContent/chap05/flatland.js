$(function(){
	//1.<ol id='note'></ol> 생성해서 id=footer앞에 생성
	$('<ol id="note"></ol>').insertBefore($('#footer'));
	
	//2.<span class="footnote"> 앞에 <a id="">[1]</a> 
	//3.<ol>태그 자식으로 <span>태그를 이동
/*	const arr=[1,2,3];
	$.each(arr,function(index,item){
		let idx=index+1;
		$('<a id="">['+idx+']</a>').insertBefore($('.footnote').eq(index));
	})*/
	$('span.footnote').each(function(index){
		$(this).before($('<a id="context-'+(index+1)+'">['+(index+1)+']</a>'))
			.appendTo('#note')
			.append('&nbsp;<a href="#context-'+(index+1)+'">context-'+(index+1)+'</a>')
			.wrap('<li></li>');
		//wrap():랩을 싸는 것이라고 생각
		//$('#note').append($(this));
	})
	
	
});