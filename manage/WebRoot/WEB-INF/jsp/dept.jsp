<table id="dept"></table>
<div id="dept_bar" style="padding:5px;">
 	<div style="margin-bottom:5px;">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="dept.add();">添加</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="dept.edit();">修改</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-del" onclick="dept.del();">删除</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-save" id="save" onclick="dept.save();">保存</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-redo" id="redo" onclick="dept.redo();">取消编辑</a>		
	</div>
</div>
<script type="text/javascript" >
	 $('#dept').treegrid({
	    url:'${pageContext.request.contextPath }/dept/list',
	    idField: 'deptId',
	    treeField: 'deptCode',
	    parentField : 'deptPid',
	    toolbar : '#dept_bar',
	    fitColumns: true,
	    rownumbers: true,
	    columns : [[
	    	{
		    	title : '部门代码',
		    	field : 'deptCode',
		    	width : 200,
	    	},
	    	{
		    	title : '部门名称',
		    	field : 'deptName',
		    	width : 200,
	    	},
	    	{
		    	title : '部门描述',
		    	field : 'deptDesc',
		    	width : 330,
	    	},
	    	{
		    	title : '部门排序',
		    	field : 'deptSort',
		    	width : 50,
		    },
	    	{
		    	title : '创建时间',
		    	field : 'deptCtimeView',
		    	width : 200,
		    }
	    	]],
	    	onBeforeExpand : function(row) {
	    		if (row) {
					$(this).treegrid('options').url = '${pageContext.request.contextPath }/dept/list?deptId='
							+ row.deptId;
				}			
				return true;
			}
	}); 
	
	var dept = {
		add:function(){
			alert(1);
		}
	}
</script>