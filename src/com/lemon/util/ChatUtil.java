package com.lemon.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Date;

import org.apache.catalina.util.CharsetMapper;

import com.google.gson.Gson;
import com.lemon.bean.ChatMessage;
import com.lemon.bean.ChatMessage.Type;
import com.lemon.bean.Result;

/**
 * 人工智能客服系统工具类
 * @author lemon
 * @version v1.0
 */

public class ChatUtil {
	
	/**
	 * 对话智能系统获取答案
	 * @author lemon
	 * @param message 用户输入的问题信息
	 * @return String 客服回复的信息
	 * @throws IOException 
	 */
	public static String getResult(String message){
		 
		StringBuffer buffer=new StringBuffer();
		
		try {
			//设置请求的编码集 utf-8
			String quesetion=URLEncoder.encode(message,"utf-8");
			//请求URL获取Api的值
			String requestUrl="http://www.tuling123.com/openapi/api?"+"key=b8b5df77f2c64986905fb70526958455&info="+quesetion;
			//建立网络连接
			URL urlObj=new URL(requestUrl);
			//获取连接对象
			URLConnection uc =urlObj.openConnection();
			//查看连接
			uc.connect();
			
			//获取请求的结果
			InputStreamReader reader=new InputStreamReader(uc.getInputStream(),"utf-8");
			//建立缓冲流
			BufferedReader br=new BufferedReader(reader);
			
			String temp=null;
			while((temp=br.readLine())!=null)
			{
				buffer.append(temp);
			}
			
			
			//关闭流
			reader.close();
			br.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return buffer.toString();
	}
	
	public static ChatMessage sendMessage(String msg) {
			
		ChatMessage chatMessage=new ChatMessage();
		
		String jsonRes= getResult(msg);
		Gson gson=new Gson();
		Result result=null;
		try {
			result=gson.fromJson(jsonRes,Result.class);
			chatMessage.setMsg(result.getText());
		} catch (Exception e) {
			chatMessage.setMsg("服务器繁忙，请稍后再试！");
		}
		
		chatMessage.setDate(new Date());
		chatMessage.setType(Type.INCOMING);
		
		return chatMessage;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("love lemon!");
		
		String message="给我讲个笑话吧";
		// 1.调用大数据智能客服系统类库
		String result=getResult(message);
		
		System.out.println(result);
		
		// 2.建立文件流读取值
		
		
		// 3.返回页面进行展示
		
	}
}
