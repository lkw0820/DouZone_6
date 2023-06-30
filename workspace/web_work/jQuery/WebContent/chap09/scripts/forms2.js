//$(function(){
//	$('.quantity input').on('change',function(e){
//		e.preventDefault();
//		//total
//		let cnt=parseInt($(this).val());//곱하기는 parseInt 안해도 됨
//		let price=$(this).parent().parent().find('.price').text().split("$");
//		let pri=parseFloat(price[1]);
//		//console.log(cnt);
//		//console.log(pri);
//		
//		//subtot
//		let cost = cnt*pri;
//		let subtot=0;
//		$(this).parent().parent().find('.cost').text('$'+cost);
//		$('tbody .cost').each(function(index,item){
//			subtot+=parseFloat($(item).text().split('$')[1]);
//		})
//		
//		$('.subtotal .cost').text('$'+subtot);
////		//tax
////		let tax = subtot*0.06;
////		$('.tax .cost').text('$'+tax);
////		//shipping
////		let totQuantity=0;
////		let shipping=0;
////		$('.quantity input').each(function(){
////			totQuantity+=parseInt($(this).val());
////		})
////		shipping=totQuantity*2;
////		$('.shipping .quantity').text(totQuantity);
////		$('.shipping .cost').text('$'+shipping);
////		//totalCost
////		let total=subtot+tax+shipping;
////		$('.total .cost').text('$'+total);
//		
//		
//		let a= tax(subtot);
//		//console.log(a);
//		let b= shipping();
//		totalCost(subtot,a,b);
//
//	});
//	function tax(subtot){
//		let tax = subtot*0.06;
//		$('.tax .cost').text('$'+tax);
//		return tax;
//	}
//	function shipping(){
//		let totQuantity=0;
//		let shipping=0;
//		$('.quantity input').each(function(){
//			totQuantity+=parseInt($(this).val());
//		})
//		shipping=totQuantity*2;
//		$('.shipping .quantity').text(totQuantity);
//		$('.shipping .cost').text('$'+shipping);
//		return shipping;
//	}
//	function totalCost(subtot,tax,shipping){
//		let total=subtot+tax+shipping;
//		$('.total .cost').text('$'+total);
//	}
//});

$(function(){
	$('.quantity input').change(function(){
		var totalCost =0;
		var totalQuantity =0;
		$('table tbody tr').each(function(index){
			var price = parseFloat($(this).find('.price').text().replace(/^[^\d]/,''));
			console.log(price);
			price = isNaN(price)?0:price;
			var quantity =parseInt($(this).find('.quantity input').val());
			quantity=isNaN(quantity)?0:quantity;
			var cost =price*quantity;
			$(this).find('.cost').text('$'+cost.toFixed(2));
			
			totalCost +=cost;
			totalQuantity +=quantity;
		});
		$('.subtotal .cost').text('$'+totalCost.toFixed(2));
		$('.shipping .quantity').text(totalQuantity);
	});
});











































