$(function () {
	
	$('#tabs').tabs({
		fit : true,
		border : false,
	});
	$('#tabs').tabs('add',{
		title : '起始页',
		iconCls : 'icon-house',
		href : rootPath+"/view/main"
	});
	
	$('#nav').tree({
		url : rootPath+"/menu/list",
		lines : true,
		onLoadSuccess : function(node,data){
			var _this = this;
			if(data){
				$(data).each(function(index,value){
					if(this.state == 'closed'){
						$(_this).tree('expandAll');
					}
					
				})
			}
		},
		onClick : function(node){
			console.log(node);
			console.log(rootPath+"/view/"+node.url+"?mId="+node.id)
			if(node.url){
				if($('#tabs').tabs('exists',node.text)){
					$('#tabs').tabs('select',node.text);
				}else{
					$('#tabs').tabs('add',{
						title : node.text,
						closable : true,
						iconCls : node.iconCls,
						href : rootPath+"/view/"+node.url+"?mId="+node.id
					});
				}
			}
		}
	})
		
});

