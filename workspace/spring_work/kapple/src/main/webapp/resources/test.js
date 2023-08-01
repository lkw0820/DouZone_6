
var Service = (function(){
	function getSupplier(suppl_no,callback,error){
		$.ajax({
			type:"get",
			url:"/modal/"+suppl_no+".json",
			success:function(result,status,xhr){
				if(callback){
					callback(result);
				}
			},
			error:function(xhr,status,e){
				if(error){
					error(e);
				}	
			}
		});
	}//get
	
	function getProposal(param,callback,error){
		let compo_name=param.compo_name;
		let suppl_no=param.suppl_no;
		$.ajax({
			type:"get",
			url:"/proposal/"+compo_name+"/"+suppl_no+".json",
			success:function(result,status,xhr){
				if(callback){
					callback(result);
				}			
			},
			error:function(xhr,status,e){
				if(error){
					error(e);
				}				
			}
		});
	}
	
	
	
	return{
		getSupplier:getSupplier,
		getProposal:getProposal,

	};
	
})();