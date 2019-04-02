(function($){
	 $.getRootPath = function(){
		 //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
		 var strFullPath=window.document.location.href;
		 //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
		 var strPath=window.document.location.pathname;
		 var pos=strFullPath.indexOf(strPath);
		 //获取主机地址，如： http://localhost:8083
		 var prePath=strFullPath.substring(0,pos);
		 //获取带"/"的项目名，如：/uimcardprj
		 var postPath=strPath.substring(0,strPath.substr(1).indexOf('/')+1);
		 //var rootpath = prePath+postPath;
		 return (prePath+postPath);		 
	}
	rootPath = $.getRootPath();
})(jQuery) 
