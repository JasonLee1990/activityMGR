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
import com.ORM.Admin;
import com.ORM.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ActReportService;
import com.service.AdminService;
import com.service.StudentService;
@Controller
public class AdminLoginAction extends ActionSupport implements ServletRequestAware,SessionAware {
	
	 private HttpServletRequest request;
	 private Map<String, Object> session; 
	 @Resource
	 private Admin admin;
	 @Resource
	 private ActReport actReport;
	 @Resource 
	 private AdminService adminServiceBean;
	 @Resource
	 private ActReportService actReportServiceBean;
	 private LoginDTO loginDTO;
	 private List<ActReport> falseResults;
	 private List<ActReport> trueResults;
	public void setSession(Map<String, Object> value) {//实现SessionAware中的setSession方法，通过IOC方式注入Session 
		this.session = value; 
		}
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}

public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}
	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Admin getAdmin() {
		return admin;
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
	public String adminLogin(){
	    admin=adminServiceBean.getAdmin(loginDTO.getUserId());
	    System.out.print(admin.getId());
	    if(admin.getPassword().trim().equals(loginDTO.getPassword())){
	    	session.put("userId", loginDTO.getUserId());
	    	session.put("userPassword",loginDTO.getPassword());
	    	if(admin.getLevel()==1){
	    		falseResults=actReportServiceBean.getall_adminFlow(actReport, admin);
	    		trueResults=actReportServiceBean.getall_adminTlow(actReport, admin);
	    		return "success";
	    	}else if(admin.getLevel()==2){
	    		falseResults=actReportServiceBean.getall_adminFmiddle(actReport, admin);
	    		trueResults=actReportServiceBean.getall_adminTmiddle(actReport, admin);
	    		return "success";
	    	   }else if(admin.getLevel()==3){
	    		   falseResults=actReportServiceBean.getall_adminFhigh(actReport, admin);
	    		   trueResults=actReportServiceBean.getall_adminThigh(actReport, admin);
	    		   return "success";
	    	   }else 
	    		   return "error";
	    }else 
	    	return  "error";
	}
}
