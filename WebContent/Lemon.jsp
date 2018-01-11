<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Java开发人工智能IM</title>
	<meta name="keywords" content="关键词，关键词">
	<meta name="description" content="">

	<style type="text/css">
		*{margin: 0;padding: 0}

		body{background: #ababab;font-size: 12px;font-family: "微软雅黑";color: #666;}



		/* chat start*/
		.chat{width: 900px;height: 530px;background: #ffcc00;margin: 100px auto;}
		.chat .c_title{height: 68px;background: #66ccff;line-height: 68px;font-size: 20px;padding-left: 20px;color: #ffffff;font-weight:300;}
		.chat .c_con{height: 380px;background: #EFF0F2;}
		.chat .c_message{height: 82px;background: #dddfe3;}
		.chat .c_con .c_left img{vertical-align: middle;padding:10px 0 0 10px;}
		.chat .c_con .c_right{text-align: right;line-height: 50px;padding-right: 10px;}
		.chat .c_con .c_right .c_name{width: 50px;height: 50px;display: block;background: #FF6600;float: right;line-height: 50px;text-align: center;text-decoration: none;font-size: 14px;color: #ffffff;border-radius: 25px;}
		.chat .c_message .c_box{width: 780px;height: 62px;padding: 10px;outline-style: none;float: left;}
		.chat .c_message .c_btn{float: right;width: 100px;}
		.chat .c_message .c_btn input{width: 100px;height: 82px;border: none;background: #cfcfcf;cursor:pointer; outline: none;}
		/* chat end */


	</style>


</head>
<body>

	<!-- 以class=“自定义名称”称之为样式
		1.见名知意
		2.不能以数字开头
		3.使用‘-’，‘_’命名
	-->
	
	<!-- chat start-->
	<div class="chat">
		<div class="c_title">智能客服系统-V1.0</div>
		<div class="c_con">
			<div class="c_left">
				<img src="images/robot.jpg" alt="Lemon智能客服" width="50" height="50" />
				&nbsp&nbsp&nbsp欢迎您的到来！
			</div>
			<div class="c_right">
				想听歌!!!<a href="" class="c_name">Lemon</a>
			</div>
			<div class="c_left">
				<img src="images/robot.jpg" alt="Lemon智能客服" width="50" height="50" />
				&nbsp&nbsp&nbsp欢迎您的到来！
			</div>
			<div class="c_right">
				想听歌!!!<a href="" class="c_name">Lemon</a>
			</div>
			<div class="c_left">
				<img src="images/robot.jpg" alt="Lemon智能客服" width="50" height="50" />
				&nbsp&nbsp&nbsp欢迎您的到来！
			</div>
			<div class="c_right">
				想听歌!!!<a href="" class="c_name">Lemon</a>
			</div>
		</div>
		<div class="c_message">
			<div class="c_box" contenteditable="true"></div>
			<div class="c_btn">
				<input type="button" value="发  送" />
			</div>
		</div>
	</div>
	<!--chat end-->
</body>
</html>