package com.AOP;

import javax.annotation.Resource;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.ORM.ActReport;
import com.ORM.Student;

@Transactional
public class MyInterceptor {
	@Resource
	private SessionFactory sessionFactory;
	@Resource
	private ActReport actReport;
	@Resource
	private Student student;
	@Pointcut("execution (* com.service.impl.ActReportServiceBean.update_*(..))")
	private void anyMethod(){};
	@AfterReturning("anyMethod()")//定义后置通知
	public void doAfterReturning(){
	System.out.println("enter the Interceptor");
	student=	(Student)sessionFactory.getCurrentSession().get(Student.class,actReport.getStuId());
	String k=actReport.getActRtype();
	System.out.println(actReport.getActRverify());
	  if(k.equals("思想政治与道德修养")&&actReport.getActRverify()==3){
		  System.out.println(student.getPoint());
		  System.out.println(student.getName());
		  System.out.println(student.getSzdd());
		student.setSzdd(student.getSzdd()+actReport.getActRpoint());
		student.setPoint(student.getPoint()+actReport.getActRpoint());
		 System.out.println(student.getPoint());
		  System.out.println(student.getName());
		  System.out.println(student.getSzdd());
		sessionFactory.getCurrentSession().merge(student);
		sessionFactory.getCurrentSession().merge(actReport);
	  }
	  if(k.equals("社会实践与志愿服务")&&actReport.getActRverify()==3){
		student.setSjzy(student.getSjzy()+actReport.getActRpoint());
		student.setPoint(student.getPoint()+actReport.getActRpoint());
		sessionFactory.getCurrentSession().merge(student);
		sessionFactory.getCurrentSession().merge(actReport);
	  }
	  if(k.equals("科技学术与创新创业")&&actReport.getActRverify()==3){
		student.setKjcx(student.getKjcx()+actReport.getActRpoint());
		student.setPoint(student.getPoint()+actReport.getActRpoint());
		sessionFactory.getCurrentSession().merge(student);
		sessionFactory.getCurrentSession().merge(actReport);
	  }
	  if(k.equals("文化艺术与身心发展")&&actReport.getActRverify()==3){
		student.setWhsx(student.getWhsx()+actReport.getActRpoint());
		student.setPoint(student.getPoint()+actReport.getActRpoint());
		sessionFactory.getCurrentSession().merge(student);
		sessionFactory.getCurrentSession().merge(actReport);
	  }
	  if(k.equals("社团活动与社会工作")&&actReport.getActRverify()==3){
		student.setStsh(student.getStsh()+actReport.getActRpoint());
		student.setPoint(student.getPoint()+actReport.getActRpoint());
		sessionFactory.getCurrentSession().merge(student);
		sessionFactory.getCurrentSession().merge(actReport);
	  }
	  if(k.equals("技能培训及其它")&&actReport.getActRverify()==3){
		student.setJnqt(student.getJnqt()+actReport.getActRpoint());
		student.setPoint(student.getPoint()+actReport.getActRpoint());
		sessionFactory.getCurrentSession().merge(student);
		sessionFactory.getCurrentSession().merge(actReport);
	  }
	
	}
	
	
}
