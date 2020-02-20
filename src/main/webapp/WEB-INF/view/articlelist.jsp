<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link href="/resource/css/index_like.css" rel="stylesheet">  
 <link href="/resource/css/index_work.css" rel="stylesheet">  
 <link href="/resource/css/jsq.css" rel="stylesheet">  
 <link href="/resource/css/style.css" rel="stylesheet">  
  <script type="text/javascript" src="/resource/js/jquery-3.2.1/jquery.min.js"></script>
  <script type="text/javascript" src="/resource/My97DatePicker/WdatePicker.js"></script>
 
<title>Insert title here</title>
</head>
<body>
<form action="articlelist" method="post">
	时间:<input type="text" name="created1" value="${created1}" onclick="WdatePicker()">---
	<input type="text" name="created2" value="${created2}" onclick="WdatePicker()"><br>
	<select name="orderValue">
		<option value="0">请选择排序方式</option>
		<option value="1">根据时间排序</option>
		<option value="2">根据评论数排序</option>
		<option value="3">根据用户名排序</option>
	</select>
	<input type="submit" value="查询">
</form>

<table>
	<tr>
		<td>请选择</td>
		<td>编号</td>
		<td>文章名称</td>
		<td>文章内容</td>
		<td>创建时间</td>
		<td>评论数</td>
		<td>发布者</td>
	</tr>
	<c:forEach items="${info.list}" var="a">
		<tr>
			<td><input type="checkbox" value="${a.id}" name="ck"></td>
			<td>${a.id }</td>
			<td>${a.title }</td>
			<td>${a.content }</td>
			<td>${a.created }</td>
			<td>${a.commentCnt }</td>
			<td>${a.username }</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="100">
			<a href="articlelist?pageNum=1">首页</a>
			<a href="articlelist?pageNum=${info.prePage}">上一页</a>
			<a href="articlelist?pageNum=${info.nextPage}">下一页</a>
			<a href="articlelist?pageNum=${info.pages}">尾页</a>
			当前是${info.pageNum}页 /${info.pages}页  共${info.total }条数据
		</td>
		
	</tr>
</table>
</body>
<script type="text/javascript">
	
	/* $("#ps").click(function(){
		var sum="";
		$(":checkbox:checked").each(function(){
			var every=$(this).val();
			sum=sum+","+every;
		})
		var ids=sum.substring(1);
		if(ids==""){
			alert("请选择数据")
		}else{
			
			if(confirm("是否删除")){
				$.post("del",{
					sid:ids
				},function(back){
					if(back!=0){
						alert("批删成功");
						location.href="elist";
					}else{
						alert("批删失败");
					}
				},"text")
			}
		}
	}) */

	
</script>
</html>