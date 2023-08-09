
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
	function getRetailer(retail_no,callback,error){
		$.ajax({
			type:"get",
			url:"/rmodal/"+retail_no+".json",
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
	function getPredict(param,callback,error){
		let prod_name=param.prod_name;
		let retail_no=param.retail_no;
		$.ajax({
			type:"get",
			url:"/predict/"+prod_name+"/"+retail_no+".json",
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
	function supplierDTO(suppl_name,callback,error){
		$.ajax({
			type:"get",
			url:"/comparsionSupplier/"+suppl_name+".json",
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
	function retailerDTO(retail_name,callback,error){
	$.ajax({
			type:"get",
			url:"/comparsionRetailer/"+retail_name+".json",
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

	function checkPw(param,callback,error){
		let id=param.id;
		let checkPw=param.checkPw;
		$.ajax({
				type:"post",
				url:"/checkPw/"+id+"/"+checkPw,
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
		getRetailer:getRetailer,
		getPredict:getPredict,
		supplierDTO:supplierDTO,
		retailerDTO:retailerDTO,
		checkPw:checkPw

	};
	
})();