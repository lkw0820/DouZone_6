$(function(){
	$(window).on('load', function(){
		$.ajax({
			url:'server.jsp',
			type:'post',
			dataType:'json',
			success:function(data){
				$.each(data,function(index,item){
					let html = '<div class="title">'+item.title+'</div>';
					html+='<div class="writer">'+item.writer+'</div>';
					html+='<div class="content">'+item.content+'</div>';
					$('#list').append(html);
				})
				
			}
		});
	});
		
});


$(function(){
		$('form').submit(function(e){
			e.preventDefault();
			$.ajax({
				url:'server.jsp',
				type:'post',
				data:$(this).serialize(),
				dataType:'json',
				success:function(data){
					let a = document.querySelectorAll('form input');
					let html = '<div class="title">'+a[0].value+'</div>';
					html+='<div class="writer">'+a[1].value+'</div>';
					html+='<div class="content">'+a[2].value+'</div>';
					$('#list').append(html);
				}
			});
			return false;
		});			
});