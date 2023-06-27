	window.onload = function() {
		document.getElementById("ball1").focus();
		
		var btnHtml = "";
		
		for (var i = 1; i < 10; i++) {
			btnHtml += ('<button value="'+i+'" class="btn'+i+'" id="btn'+i+'" > '
					+ i + '</button>');
		}
		document.getElementById("btnarea").innerHTML = btnHtml;
		let btns = document.querySelectorAll('#btnarea');
		for(btn of btns){
			btn.addEventListener('click',inputNum,false);
		}
		let answer=[];
		//정답 만들기
		function makeAnswer(){
			answer.push(Math.floor(Math.random()*(9-1)+1));
			do{
				answer.push(Math.floor(Math.random()*(9-1)+1));
			}while(answer[0]==answer[1]);
			do{
				answer.push(Math.floor(Math.random()*(9-1)+1));
			}while(answer[0]==answer[2]||answer[1]==answer[2]);
		}
		
		//console.log(Math.floor(Math.random()*(9-1)+1));
//		answer.push(Math.floor(Math.random()*(9-1)+1));
//		do{
//			answer.push(Math.floor(Math.random()*(9-1)+1));
//		}while(answer[0]==answer[1]);
//		do{
//			answer.push(Math.floor(Math.random()*(9-1)+1));
//		}while(answer[0]==answer[2]||answer[1]==answer[2]);
		makeAnswer();
		console.log(answer);
		const b1= document.querySelector('#ball1');
		const b2= document.querySelector('#ball2');
		const b3= document.querySelector('#ball3');
		const result = document.querySelector('#result');
		let input=[];
		let cnt=0;
		const clear = document.querySelector('#clear');
		const reset = document.querySelector('#reset');
		const count = document.querySelector('#count');
		clear.addEventListener('click',clearValue,false);
		reset.addEventListener('click',resetValue,false);
		function resetValue(){
			result.value='';
		}
		let mod=10;
		function clearValue(){
			input=[];
			b1.value='';
			b2.value='';
			b3.value='';
			
		}
		function inputNum(e){
			
//			console.log("asd");
//			console.log(this);
//			console.log(e);
//			console.log(e.target);
			let num = e.target.value;
			input.push(num);
			console.log(num);
			if(b1.value==''){
				b1.value=num;
			}else if(b2.value==''){
				b2.value=num;
			}else if(b3.value==''){
				b3.value=num;
			}
			if(b3.value!=''){
				cnt++;
				console.log(input);
				let s=checkS();
				let b=checkB();
				if(s==3){
					str='정답입니다.'+cnt+'번째로 맞췄습니다.\n';
					cnt=0;
					mod=10;
					answer=[];
					makeAnswer();
					console.log(answer);
				}else{
					str = input[0]+' '+ input[1]+' '+input[2]+' -> '+s+'S '+b+'B\n';
					mod--;
				}
				//console.log(count.value);
				result.value+=str;
				
				
				if(mod==0){
					result.value+='실패\n';
					//result.value='';
					cnt=0;
					mod=10;
					answer=[];
					makeAnswer();
					console.log(answer);
				}
				count.innerHTML='도전 / '+mod+'회';
				//초기화
				input=[];
				b1.value='';
				b2.value='';
				b3.value='';
				
			}
		}
		function checkS(){
			let strike=0;
			for(let i=0;i<3;i++){
				if(answer[i]==input[i]){
					strike++;
				}
			}
			return strike;
		}
		
		function checkB(){
			let ball=0;
			for(let i=0;i<3;i++) {
				if(answer[i]==input[(i+1)%3]) {
					ball++;
				}
				if(answer[i]==input[(i+2)%3]) {
					ball++;
				}
			}
			return ball;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	