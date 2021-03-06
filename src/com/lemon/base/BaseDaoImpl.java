package com.lemon.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDaoImpl<T> implements BaseDao<T>{

	@Resource
	private SessionFactory sessionFactory;
	private Class<T> clazz=null;   //待解决的问题
	
	public BaseDaoImpl() {
		//使用反射技术得到T的真实类型
		ParameterizedType pt=(ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz=(Class<T>) pt.getActualTypeArguments()[0];
//		System.out.println("clazz--->"+clazz);
	}
	
	
	/**
	 * 获取当前可用session
	 * @return
	 */
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	} 
	
	
	public void save(T entity) {
		getSession().save(entity);
	}

	
	public void delete(Long id) {
		Object obj=getById(id);
		if(obj!=null)
		{
			getSession().delete(obj);
		}
		
	}

	
	public void update(T entity) {
		getSession().update(entity);
		
	}

	
	public T getById(Long id) {
		
		return (T)getSession().get(clazz, id);
	}

	
	@SuppressWarnings("unchecked")
	public List<T> getByIds(Long[] ids) {
		return getSession().createQuery(
				"FROM User WHERE id IN (:ids)")//
				.setParameterList("ids", ids)
				.list();
	}


	@SuppressWarnings("unchecked")
	public List<T> findAll() {

		return getSession().createQuery(//
				"FROM "+clazz.getSimpleName())//
				.list();
	}

}
