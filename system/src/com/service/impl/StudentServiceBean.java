package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ORM.Student;
import com.service.StudentService;
@Service
@Transactional
public class StudentServiceBean implements StudentService {
	@Resource
	private SessionFactory sessionFactory;
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Student get(String id){//获取数据库student对象
		return (Student)sessionFactory.getCurrentSession().get(Student.class,id);
	}
	
	public void update(Student student){//更新数据库student对象
		sessionFactory.getCurrentSession().merge(student);
	}
	public void save(Student student){//保存student对象
		sessionFactory.getCurrentSession().persist(student);
	}
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")
	public List<Student> getall() {//获取数据库中所有student对象
		return	sessionFactory.getCurrentSession().createQuery("from Student").list();
		
	}
}
