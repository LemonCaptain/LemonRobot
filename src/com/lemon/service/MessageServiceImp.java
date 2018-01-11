package com.lemon.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lemon.bean.Result;
import com.lemon.dao.ResultDao;


@Service
@Transactional
public class MessageServiceImp implements MessageService{

	@Resource
	private ResultDao resultDao;
	
	public List<Result> findAll() {
		
		return resultDao.findAll();
	}

	public void delete(Long id) {
		resultDao.delete(id);	
	}


	public void save(Result result) {
		resultDao.save(result);
		
	}

	
	public Result getById(Long id) {
	
		return resultDao.getById(id);
	}


	public void update(Result result) {
		resultDao.update(result);
		
	}

}
