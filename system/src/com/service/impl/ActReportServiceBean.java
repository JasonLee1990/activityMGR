package com.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.DTO.ActReportDTO;
import com.ORM.ActReport;
import com.ORM.Admin;
import com.ORM.Student;
import com.service.ActReportService;
import com.service.StudentService;
@Service
@Transactional
public class ActReportServiceBean implements ActReportService{
	@Resource private SessionFactory sessionFactory;
//学生申报方法
	public boolean update(ActReport actReport,ActReportDTO actReportDTO){
		actReport.setActRformat(actReportDTO.getActRformat());
		actReport.setActRname(actReportDTO.getActRname());
		actReport.setActRtype(actReportDTO.getActRtype());
		actReport.setActRtime(actReportDTO.getActRtime());
		actReport.setActRstatus(actReportDTO.getActRstatus());
		actReport.setActRpoint(actReportDTO.getActRpoint());
		actReport.setStuId(actReportDTO.getStuId());
		actReport.setActRverify(0);
		sessionFactory.getCurrentSession().merge(actReport);
		return true;
	}
	public boolean merge(ActReport actReport){
		sessionFactory.getCurrentSession().merge(actReport);
		return true;
	}
	//学生按活动类型查看自己已审核通过的活动
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")
	public List<ActReport> lookup(String actRtype,String stuId){
		Criteria cr =sessionFactory.getCurrentSession().createCriteria(ActReport.class);
		cr.add(Restrictions.and(Restrictions.eq("stuId", stuId),Restrictions.and(Restrictions.eq("actRtype", actRtype),(Restrictions.eq("actRverify", new Integer(3))))));
		return cr.list();
	}
//三级审核见如下三个方法
	
	public boolean update_low(ActReport actReport,Integer actRId,Admin admin){//一级审核方法
		actReport=getwithID(actRId);
		System.out.println("改前"+getwithID(actRId).getActRverify());
		actReport.setActRverify(1);
		sessionFactory.getCurrentSession().merge(actReport);
	System.out.println("改后"+getwithID(actRId).getActRverify());
	return true;
	}

	public boolean update_middle(ActReport actReport,Integer actRId,Admin admin){//二级审核方法
			actReport=getwithID(actRId);
			System.out.println("改前"+getwithID(actRId).getActRverify());
			actReport.setActRverify(2);
			sessionFactory.getCurrentSession().merge(actReport);
		System.out.println("改后"+getwithID(actRId).getActRverify());
		return true;
	}


	public boolean update_high(ActReport actReport,Integer actRId,Admin admin,StudentService studentServiceBean){//三级审核方法
		actReport=getwithID(actRId);
		System.out.println("改前"+getwithID(actRId).getActRverify());
		actReport.setActRverify(3);
		Student student=studentServiceBean.get(actReport.getStuId());
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
		sessionFactory.getCurrentSession().merge(actReport);
	System.out.println("改后"+getwithID(actRId).getActRverify());
	return true;
	}
	//学生对申报的删除操作
	public boolean delete(Integer id){
		if(id!=0&&id!=null){
			sessionFactory.getCurrentSession().delete(getwithID(id));
		return true;
		}else{
			return false;
		}
	}
	//根据记录号获取actReport对象
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true,isolation=Isolation.REPEATABLE_READ)
	@SuppressWarnings("unchecked")//终止警告
	public ActReport getwithID(int id){
		return (ActReport)sessionFactory.getCurrentSession().get(ActReport.class, id);
	}
//管理员对备注的批复
	public boolean up_mark(ActReport actReport,String mark){//备注的批复
		actReport.setActRmark(mark);
		sessionFactory.getCurrentSession().merge(actReport);
		return true;
	}
	//学生个人查询自己未被全部审核通过的申报记录
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")//终止警告
	public List<ActReport> getall_studentF(Student student){
		String id=student.getId();
		Criteria cr =sessionFactory.getCurrentSession().createCriteria(ActReport.class); //生成一个Criteria对象
		cr.add(Restrictions.and(Restrictions.lt("actRverify",new Integer(3)), Restrictions.eq("stuId", id)));
		return cr.list();
	}
	//学生个人查询自己已全部审核通过的申报记录
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")//终止警告
	public List<ActReport> getall_studentT(Student student){
		String id=student.getId();
		Criteria cr =sessionFactory.getCurrentSession().createCriteria(ActReport.class); //生成一个Criteria对象
		cr.add(Restrictions.and(Restrictions.eq("stuId", id),Restrictions.eq("actRverify",new Integer(3))));
		return cr.list();
	}
	//学生个人查询自己全部申报记录
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")//终止警告
	public List<ActReport> getall_studentPAST(Student student){
		String id=student.getId();
		Criteria cr =sessionFactory.getCurrentSession().createCriteria(ActReport.class); //生成一个Criteria对象
		cr.add(Restrictions.eq("stuId", id));
		return cr.list();
	}	
	//一级管理员查询本班待审核申报
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")//终止警告
	public List<ActReport> getall_adminFlow(ActReport actReport,Admin admin){
		String id=admin.getClassId();
		String hql1 = "select student.id from Student student where student.classNo='"+id+"'";  
        String hql2 = " from ActReport actReport where actReport.stuId in (:studentResult) and actReport.actRverify=0";   
            Query q1 = sessionFactory.getCurrentSession().createQuery(hql1);   
            Query q2 = sessionFactory.getCurrentSession().createQuery(hql2);  
            q2.setParameterList("studentResult", q1.list());
            return q2.list();
	}
	//一级管理员查询本班已审核申报
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")//终止警告
	public List<ActReport> getall_adminTlow(ActReport actReport,Admin admin){
		String id=admin.getClassId();
		String hql1 = "select student.id from Student student where student.classNo='"+id+"'";  
        String hql2 = " from ActReport actReport where actReport.stuId in (:studentResult) and actReport.actRverify=1"; 
             
            Query q1 = sessionFactory.getCurrentSession().createQuery(hql1);  
            
            Query q2 = sessionFactory.getCurrentSession().createQuery(hql2);  
            q2.setParameterList("studentResult", q1.list());
            
            return q2.list();
	}
	//二级管理员查询本系待审核申报
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")//终止警告
	public List<ActReport> getall_adminFmiddle(ActReport actReport,Admin admin){
		String id=admin.getDepartment();
		String hql1 = "select student.id from Student student where student.department='"+id+"'";  
        String hql2 = " from ActReport actReport where actReport.stuId in (:studentResult) and actReport.actRverify=1";
            Query q1 = sessionFactory.getCurrentSession().createQuery(hql1);   
            Query q2 = sessionFactory.getCurrentSession().createQuery(hql2);
            q2.setParameterList("studentResult", q1.list());
            return q2.list();  
	}
	//二级管理员查询本系已审核申报
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")//终止警告
	public List<ActReport> getall_adminTmiddle(ActReport actReport,Admin admin){
		String id=admin.getDepartment();
		String hql1 = "select student.id from Student student where student.department='"+id+"'";  
        String hql2 = " from ActReport actReport where actReport.stuId in (:studentResult) and actReport.actRverify=2";
            Query q1 = sessionFactory.getCurrentSession().createQuery(hql1);   
            Query q2 = sessionFactory.getCurrentSession().createQuery(hql2);
            q2.setParameterList("studentResult", q1.list());
            return q2.list();  
	}
	//三级管理员查询所有待审核申报
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")//终止警告
	public List<ActReport> getall_adminFhigh(ActReport actReport,Admin admin){
		Criteria cr =sessionFactory.getCurrentSession().createCriteria(ActReport.class);
		cr.add(Restrictions.eq("actRverify", new Integer(2)));
            return cr.list();  
	}
	//三级管理员查询所有待审核申报
	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	@SuppressWarnings("unchecked")//终止警告
	public List<ActReport> getall_adminThigh(ActReport actReport,Admin admin){
		Criteria cr =sessionFactory.getCurrentSession().createCriteria(ActReport.class);
		cr.add(Restrictions.eq("actRverify", new Integer(3)));
            return cr.list();  
	}
	
	
}
