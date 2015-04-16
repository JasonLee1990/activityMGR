package com.service.impl;
import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ORM.Admin;
import com.ORM.Student;
import com.service.AdminService;
@Service
@Transactional
public class AdminServiceBean implements AdminService {
	@Resource
	private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public Admin getAdmin(String id){
		return (Admin)sessionFactory.getCurrentSession().get(Admin.class,id);//根据ID获取Admin对象
	}
	//管理员重置学生用户密码
	public void reset_password(Student student){
		student.setPassword("123456");
		sessionFactory.getCurrentSession().merge(student);
	}
	
	public void update_password(Admin admin,String password){
		admin.setPassword(password);
		sessionFactory.getCurrentSession().merge(admin);//对管理员密码的修改
	}
	public void save(Admin admin){//保存Admin对象
		sessionFactory.getCurrentSession().persist(admin);
	}
}
