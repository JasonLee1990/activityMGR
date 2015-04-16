package com.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Controller;

import com.DTO.LoginDTO;
import com.ORM.ActReport;
import com.ORM.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ActReportService;
import com.service.StudentService;
@Controller
public class StuLoginAction extends ActionSupport implements ServletRequestAware,SessionAware {
	
	 private Map<String, Object> session; 
	 private Student student;
	 @Resource 
	 private StudentService studentServiceBean;
	 @Resource
	 private ActReportService actReportServiceBean;
	 private LoginDTO loginDTO;
	 private List<ActReport> list1; 
	 private List<ActReport> list2;
	 private List<ActReport> list3; 
	 private List<ActReport> list4; 
	 private List<ActReport> list5; 
	 private List<ActReport> list6; 
	 private List<ActReport> falseResults;
	 private List<ActReport> trueResults;
	public void setSession(Map<String, Object> value) {//实现SessionAware中的setSession方法，通过IOC方式注入Session 
		this.session = value; 
		}
	public void setServletRequest(HttpServletRequest request) {
	}

public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}
	public LoginDTO getLoginDTO() {
		return loginDTO;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public List<ActReport> getList1() {
		return list1;
	}
	public void setList1(List<ActReport> list1) {
		this.list1 = list1;
	}
	public List<ActReport> getList2() {
		return list2;
	}
	public void setList2(List<ActReport> list2) {
		this.list2 = list2;
	}
	public List<ActReport> getList3() {
		return list3;
	}
	public void setList3(List<ActReport> list3) {
		this.list3 = list3;
	}
	public List<ActReport> getList4() {
		return list4;
	}
	public void setList4(List<ActReport> list4) {
		this.list4 = list4;
	}
	public List<ActReport> getList5() {
		return list5;
	}
	public void setList5(List<ActReport> list5) {
		this.list5 = list5;
	}
	public List<ActReport> getList6() {
		return list6;
	}
	public void setList6(List<ActReport> list6) {
		this.list6 = list6;
	}
	public List<ActReport> getFalseResults() {
		return falseResults;
	}
	public void setFalseResults(List<ActReport> falseResults) {
		this.falseResults = falseResults;
	}
	public List<ActReport> getTrueResults() {
		return trueResults;
	}
	public void setTrueResults(List<ActReport> trueResults) {
		this.trueResults = trueResults;
	}
	public String stuLogin(){
	    student=studentServiceBean.get(loginDTO.getUserId());
	    if(loginDTO.getPassword().equals(student.getPassword().trim())){
	    	falseResults=actReportServiceBean.getall_studentF(student);
	    	trueResults=actReportServiceBean.getall_studentT(student);
	    	list1=actReportServiceBean.lookup("思想政治与道德修养", student.getId());
	    	list2=actReportServiceBean.lookup("社会实践与志愿服务", student.getId());
	    	list3=actReportServiceBean.lookup("科技学术与创新创业", student.getId());
	    	list4=actReportServiceBean.lookup("文化艺术与身心发展", student.getId());
	    	list5=actReportServiceBean.lookup("社团活动与社会工作", student.getId());
	    	list6=actReportServiceBean.lookup("技能培训及其它", student.getId());
	    	session.put("userId", loginDTO.getUserId());
	    	session.put("userPassword",loginDTO.getPassword());
	    	return  "success";
	    }else 
	    	return  "error";
	    	
	}
}
