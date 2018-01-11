package com.lemon.service;

import java.util.List;

import com.lemon.bean.Result;



public interface MessageService {

	//查询所有
	List<Result> findAll();

	void delete(Long id);

	void save(Result result);

	Result getById(Long id);

	void update(Result result);

}
