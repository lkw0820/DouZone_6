/**
 * 
 */
let replyService = (function(){
	function create(){console.log('create');}

	function update(){console.log('update');}

	function getList(param,callback){
		let data = '결과값: '+param;
		callback(data);
	}
	
	return {
		create:create,
		update:update,
		getList:getList
	};
})();