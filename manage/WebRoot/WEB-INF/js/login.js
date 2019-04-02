//登录界面
$('#login').dialog({
	title : '综合管理系统登录',
	width : 300,
	height : 180,
	modal : true,
	closable : false, 
	draggable : false,
	iconCls : 'icon-login',
	buttons : '#btn',
});

//管理员帐号
$('#manager').validatebox({
	required : true,
	missingMessage : '请输入管理员帐号',
	invalidMessage : '管理员帐号不得为空',
});

//管理员密码
$('#password').validatebox({
	required : true,
	validType : 'length[6,30]',
	missingMessage : '请输入管理员密码',
	invalidMessage : '管理员密码在 6-30 位',
});

//加载页面时判断
if (!$('#manager').validatebox('isValid')) {
	$('#manager').focus();
	} else if (!$('#password').validatebox('isValid')) {
		$('#password').focus();
}

//单击登录
$('#btn a').click(function () {
	if (!$('#manager').validatebox('isValid')) {
		$('#manager').focus();
	} else if (!$('#password').validatebox('isValid')) {
		$('#password').focus();
	} else {
		$.ajax({
			url : rootPath+"/signin",
			type : 'get',
			data : {
				manager : $('#manager').val(),
				password : $('#password').val(),
			},
			beforeSend : function (jqXHR, settings) {
				//在请求前给修改url（增加一个时间戳参数）
			    settings.url += settings.url.match(/\?/) ? "&" : "?";
			    settings.url += "token=" + new Date().getTime();
				$.messager.progress({
					text : '正在登录中...',
				});
			},
			success : function (data, response, status) {
				$.messager.progress('close');				
				if (data) {
					location.href = rootPath+"/menu";
				} else {
					$.messager.alert('登录失败！', '用户名或密码错误！', 'warning', function () {
						$('#password').select();
					});
				}
			}
		});
	}
});

$(document).ready(function () {

})