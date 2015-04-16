package com.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.DTO.ActReportDTO;
import com.ORM.ActReport;
import com.ORM.Admin;
import com.ORM.Student;

public interface ActReportService {

	//学生申报方法
	public boolean update(ActReport actReport, ActReportDTO actReportDTO);
	//学生按活动类型查看自己已审核通过的活动
	public List<ActReport> lookup(String actRtype,String stuId);
	//通过ID获取活动记录对象
	public ActReport getwithID(int id);
	public boolean delete(Integer id);
	public boolean update_low(ActReport actReport, Integer actRId, Admin admin);
	public boolean update_middle(ActReport actReport, Integer actRId, Admin admin);
	public boolean update_high(ActReport actReport,Integer actRId, Admin admin,StudentService studentServiceBean);

	public boolean up_mark(ActReport actReport, String mark);
	public boolean merge(ActReport actReport);
	//学生个人查询自己未被全部审核通过的申报记录
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	@SuppressWarnings("unchecked")
	//终止警告
	public List<ActReport> getall_studentF(Student student);

	//学生个人查询自己已全部审核通过的申报记录
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	@SuppressWarnings("unchecked")
	//终止警告
	public List<ActReport> getall_studentT(Student student);

	//学生个人查询自己全部申报记录
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	@SuppressWarnings("unchecked")
	//终止警告
	public List<ActReport> getall_studentPAST(Student student);

	//一级管理员查询本班待审核申报
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	@SuppressWarnings("unchecked")
	//终止警告
	public List<ActReport> getall_adminFlow(ActReport actReport, Admin admin);

	//一级管理员查询本班已审核申报
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	@SuppressWarnings("unchecked")
	//终止警告
	public List<ActReport> getall_adminTlow(ActReport actReport, Admin admin);

	//二级管理员查询本系待审核申报
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	@SuppressWarnings("unchecked")
	//终止警告
	public List<ActReport> getall_adminFmiddle(ActReport actReport, Admin admin);

	//二级管理员查询本系已审核申报
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	@SuppressWarnings("unchecked")
	//终止警告
	public List<ActReport> getall_adminTmiddle(ActReport actReport, Admin admin);

	//三级管理员查询所有待审核申报
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	@SuppressWarnings("unchecked")
	//终止警告
	public List<ActReport> getall_adminFhigh(ActReport actReport, Admin admin);

	//三级管理员查询所有待审核申报
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	@SuppressWarnings("unchecked")
	//终止警告
	public List<ActReport> getall_adminThigh(ActReport actReport, Admin admin);

}