$(function(){
	//1.<ol id='note'></ol> 생성해서 id=footer앞에 생성
	$('<ol id="note"></ol>').insertBefore($('#footer'));
	//2.<span class="footnote"> 앞에 <a id="">[1]</a> 
/*	const arr=[1,2,3];
	$.each(arr,function(index,item){
		let idx=index+1;
		$('<a id="">['+idx+']</a>').insertBefore($('.footnote').eq(index));
	})*/
	$('span.footnote').each(function(index){
		$(this).before($('<a id="">['+(index+1)+']</a>'))
	})
	
});