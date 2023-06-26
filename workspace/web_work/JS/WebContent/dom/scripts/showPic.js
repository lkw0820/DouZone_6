window.onload = function(){
	const imgs = document.getElementsByTagName("a");
	for(img of imgs){
		console.log(img);
	}
	for(let i=0;i<imgs.length;i++){
		imgs[i].addEventListener('click',showPic,false);
	}

}
function showPic(e){
	e.preventDefault();
	console.log(e);
	console.log(this);
	console.log(e.target);//img
	console.log(e.currentTarget);//a
	//const href = e.getAttribute('href');
	//console.log(href);
	const img = document.getElementById("placeholder");
	img.setAttribute('src',this.getAttribute('href'));
	const title = this.getAttribute('title');
	const description = document.getElementById('description');
	
	//description.innerText=title;
	if(description.firstChild.nodeType==3){
		description.firstChild.nodeValue=title;
	}
}
//교수님
//window.onload = prepareGallery;
//function prepareGallery(){
//	const imagegallery = document.getElementById('imagegallery');
//	const links = imagegallery.getElementsByTagName('a');
//	
//	for(let i=0;i<links.length;i++){
//		links[i].addEventListener('click',function(e){
//			e.preventDefault();
//			showPic(this);
//		},false);
//	}
//}