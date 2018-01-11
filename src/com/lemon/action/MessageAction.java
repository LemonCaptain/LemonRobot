package com.lemon.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lemon.bean.Result;
import com.lemon.service.MessageService;
import com.lemon.service.MessageServiceImp;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;




@Controller
@Scope("prototype")
public class MessageAction extends ActionSupport implements ModelDriven<Result>{
	@Resource
	private MessageService messageService;
	private Result model=new Result();

	public Result getModel() {
		return model;
	}
	
	public String list()throws Exception{
		return "list";
	}
	
	
	/**添加*/
	public String add() throws Exception{
//		//封装到对象中
//		Role role=new Role();
//		role.setName(model.getName());
//		role.setDescription(model.getDescription());
//		//保存到数据库中
//		roleService.save(role);
		messageService.save(model);
		return "toRobot";
	}
}
