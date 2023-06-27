$(function(){
	$('#selected-plays>li').addClass('horizontal');
	
	$('li:not(.horizontal)').addClass('sub-level');
	
	$('a[href$="pdf"]').addClass('pdflink');
	
	$('a[href^="mailto"]').addClass('mailto');
	
	//$('a[href*="henry"]:not(.mailto)').addClass('henrylink');
	$('a[href*="henry"]').not('.mailto').addClass('henrylink');
})