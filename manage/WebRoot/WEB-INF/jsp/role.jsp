<table id="role"></table>
<div id="role_bar" style="padding:5px;">
 	<div style="margin-bottom:5px;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="obj.add();">添加</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="obj.edit();">修改</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-disable" onclick="obj.remove();">停用</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-save" id="save" onclick="obj.save();">保存</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" id="redo" onclick="obj.redo();">取消编辑</a>		
	</div>
</div>
<form id="role_oper" style="margin:0;padding:5px 0 0 25px;color:#333;">
	<p>角色名称：<input type="text" name="rName" class="textbox" style="width:200px;"></p>
	<p>角色描述：<input type="area" name="rDesc" class="textbox" style="width:200px;"></p>
	<p>菜单分配：<input id="menu" class="textbox" name="menu" style="width:200px;"></p>
</form>
<script type="text/javascript" >
$(function(){
	//角色查询列表
	$('#role').datagrid({
		url : rootPath + '/role/list',
		fit : true,
		fitColumns : true,
		striped : true,
		rownumbers : true,
		border : false,
		toolbar : '#role_bar',
		columns : [[
			{
				field : 'uId',
				title : '',
				width : 100,
				checkbox : true
			},
			{
				field : 'rName',
				title : '名称',
				width : 300
			},
			{
				field : 'rState',
				title : '状态',
				width : 300,
				formatter: function(value,row,index){
					if(row.rState){
						return '启用';
					}else{
						return '停用';
					}
				}
			},
			{
				field : 'rDesc',
				title : '描述',
				width : 300
			}
		]]
	})
	
	//操作列表
	$("#role_oper").dialog({
		width : 350 ,
		title : '添加',
		buttons : [
			{
				text : '提交',
				iconCls : 'icon-add',
				handler : function(){
					if ($('#role_oper').form('validate')) {
						$.ajax({
							url : 'addManager.php',
							type : 'post',
							data : {
								manager : $('input[name="manager"]').val(),
								password : $('input[name="password"]').val(),
								auth : $('#auth').combotree('getText'),
							},
							beforeSend : function () {
								$.messager.progress({
									text : '正在新增中...',
								});
							},
							success : function (data, response, status) {
								$.messager.progress('close');							
								if (data > 0) {
									$.messager.show({
										title : '提示',
										msg : '新增管理成功',
									});
									$('#manager_add').dialog('close').form('reset');
									$('#manager').datagrid('reload');
								} else {
									$.messager.alert('新增失败！', '未知错误导致失败，请重试！', 'warning');
								}
							}
						});
					}
				}
			},
			{
				text : '取消',
				iconCls : 'icon-redo',
				handler : function(){
					$('#role_oper').dialog('close').form('reset');
				}
			}
		]
	});
	
	//分配菜单
	$("#menu").combotree({
		url : rootPath+"/menu/list",
		required : true,
		lines : true,
		multiple : true,
		checkbox : true,
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
		 onCheck:function(node,checked){                 //当点击 checkbox 时触发
			 if(checked == true){
			
				 var  node1=$(this).tree('getParent',node.target);          //得到父节点
				 var _this = this;
				 console.log(node1.target);
				     $(_this).tree('check', node1.target);                                      //选中父节点

				   }
			 }
			
/* 			 --------------------- 
			 作者：atao- 
			 来源：CSDN 
			 原文：https://blog.csdn.net/cn78i/article/details/32339483 
			 版权声明：本文为博主原创文章，转载请附上博文链接！ */
	});
	
	//角色名称 
	$('input[name="rName"]').validatebox({
		required : true,
		validType : 'roleName[2,20]',
		missingMessage : '请输入角色名称'
	});

})


 	//自定义校验
	$.extend($.fn.validatebox.defaults.rules, { 
		　　'roleName': { 			
	　　　　　　validator: function(value,param){
					var _result = false;
		　			if(value.length >= param[0] && param[1] >= value.length) { 
　　　　　　　　　　　　	$.ajax({
　　　　　　　　　　　　		type : 'post',
				      		async : false,
				      		url : rootPath +'/role/validate',
				      		data : {"rName":value}, 
				      		success : function(data){
				      			console.log(data);
				      			_result = data ; 
				      		}})
						return _result; 
　　　　　　　　　　 }else{
				　　　 return false;				 
　　　　　　　　　　 }
	　　　　　　},
	     　	   message: "名称在 2-20 位，且不能重复."　　
　　　　　　}
		});  
</script>