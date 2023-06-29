$(function(){
	$('.quantity input').on('change',function(e){
		e.preventDefault();
		let cnt=parseInt($(this).val());
		let price=$(this).parent().parent().find('.price').text().split("$");
		let pri=parseFloat(price[1]);
		//console.log(cnt);
		//console.log(pri);
		let cost = cnt*pri;
		let subtot=0;
		$(this).parent().parent().find('.cost').text('$'+cost);
		$('tbody .cost').each(function(index,item){
			subtot+=parseFloat($(item).text().split('$')[1]);
		})
		
		$('.subtotal .cost').text('$'+subtot);
	});
});