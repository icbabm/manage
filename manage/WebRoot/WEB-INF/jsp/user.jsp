<table id="user"></table>
<div id="user_bar" style="padding:5px;">
 	<div style="margin-bottom:5px;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="user.add();">添加</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="user.edit();">修改</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="user.remove();">删除</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-save" id="save" onclick="user.save();">保存</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" id="redo" onclick="user.redo();">取消编辑</a>		
	</div>
	<div style="padding:0 0 0 7px;color:#333;">
		查询帐号：<input type="text" class="textbox" name="user" style="width:110px">
		创建时间从：<input type="text" name="date_from" class="easyui-datebox" editable="false" style="width:110px">
		到：<input type="text" name="date_to" class="easyui-datebox" editable="false" style="width:110px">
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="obj.search();">查询</a>
	</div>
</div>
<form id="user_add" style="margin:0;padding:5px 0 0 25px;color:#333;">
	<p>帐号 ： <input type="text" name="uLoginname" class="textbox" style="width:200px;"></p>
	<p>密码 ： <input type="password" name="uPassword" class="textbox" style="width:200px;"></p>
	<p>姓名 ： <input type="text" name="uName" class="textbox" style="width:200px;"></p>
	<p>性别 ：
		 <input type="radio" name="uGender" class="textbox" value="1">男 &nbsp;
		 <input type="radio" name="uGender" class="textbox" value="0">女
	</p>
	<p>电话 ： <input type="text" name="uTel" class="textbox" style="width:200px;"></p>
	<p>QQ&nbsp ： <input type="text" name="uQq" class="textbox" style="width:200px;"></p>
	<p>邮箱 ： <input type="text" name="uEmail" class="textbox" style="width:200px;"></p>
	<p>权限 ： <input id="roles" class="textbox" name="roles" style="width:200px;"></p>
</form>
<script type="text/javascript" >
$(function(){
	$('#user').datagrid({
		url : rootPath + '/user/rowlist',
		fit : true,
		fitColumns : true,
		striped : true,
		rownumbers : true,
		border : false,
		pagination : true,
		pageList : [10, 20, 30, 40, 50],
		toolbar : '#user_bar',
		columns : [[
			{
				field : 'uId',
				title : '',
				width : 100,
				checkbox : true
			},
			{
				field : 'uName',
				title : '姓名',
				width : 300
			},
			{
				field : 'genderView',
				title : '性别',
				width : 300
			},
			{
				field : 'uTel',
				title : '电话',
				width : 300
			},
			{
				field : 'uQq',
				title : 'QQ',
				width : 300
			},
			{
				field : 'uEmail',
				title : '邮箱',
				width : 300
			},
			{
				field : 'uState',
				title : '状态',
				width : 300,
				formatter: function(value,row,index){
					var _result = '';
					switch (row.uState)
					{
					case 1:
						  _result="在岗";
						  break;
					case 2:
						  _result="请假";
						  break;
					case 3:
						  _result="会议";
						  break;
					case 4:
						  _result="其他";
						  break;
					case 0:
						  _result="离职";
						  break;
					 default :
						 _result="";
					        break;
					}
					return _result;
				}
			},
			{
				field : 'createtimeView',
				title : '注册日期',
				width : 300
			}
		]]
	})
	
	$("#user_add").dialog({
		width : 350 ,
		title : '添加',
		buttons : [
			{
				text : '提交',
				iconCls : 'icon-add',
				handler : function(){
					if ($('#user_add').form('validate')) {
						$.ajax({
							url : rootPath +"/user/add",
							type : 'post',
							data : $("#user_add").serialize(),
							beforeSend : function () {
								$.messager.progress({
									text : '正在添加中...',
								});
							},
							success : function (data, response, status) {
								$.messager.progress('close');	
								if (data > 0) {
									$.messager.show({
										title : '提示',
										msg : '添加用户成功',
									});
									console.log('关闭');
									$('#user_add').dialog('close').form('reset');
									$('#user').datagrid('reload');
								} else {
									$.messager.alert('添加失败！', '未知错误导致失败，请重试！', 'warning');
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
					$('#user_add').dialog('close').form('reset');
				}
			}
		]
	})
	
	//分配角色
	$('#roles').combobox({
	    url: rootPath + '/role/list?rState=1',
	    valueField:'rId',
	    textField:'rName',
	    multiple:true,
		panelHeight:'auto'
	});
})

var user = {
		add:function(){
			alert(2);
		}
	}

</script>