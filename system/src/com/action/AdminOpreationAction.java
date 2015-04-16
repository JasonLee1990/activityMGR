package com.action;

import java.util.Map;

import javax.annotation.Resource;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.DTO.PasswordDTO;
import com.DTO.ReasonDTO;
import com.ORM.ActReport;
import com.ORM.Admin;
import com.ORM.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ActReportService;
import com.service.AdminService;
import com.service.StudentService;
@Component
public class AdminOpreationAction extends ActionSupport implements SessionAware {
	
	 private Map<String, Object> session; 
	 @Resource
	 private Admin admin;
	 private String adminID;
	 @Resource
	 private AdminService adminServiceBean;
	 @Resource
	 private ActReportService actReportServiceBean;
	 private ReasonDTO reasonDTO;
	 @Resource
	 private ActReport actReport;
	 @Resource
	 private StudentService studentServiceBean;
	 private String actRId;
	 private String jsonResult;
	 private PasswordDTO passwordDTO;
	public void setSession(Map<String, Object> value) {//实现SessionAware中的setSession方法，通过IOC方式注入Session 
		this.session = value; 
		}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Admin getAdmin() {
		return admin;
	}
	public PasswordDTO getPasswordDTO() {
		return passwordDTO;
	}
	public void setPasswordDTO(PasswordDTO passwordDTO) {
		this.passwordDTO = passwordDTO;
	}
	public ReasonDTO getReasonDTO() {
		return reasonDTO;
	}
	public void setReasonDTO(ReasonDTO reasonDTO) {
		this.reasonDTO = reasonDTO;
	}

	public String getActRId() {
		return actRId;
	}
	public void setActRId(String actRId) {
		this.actRId = actRId;
	}
	public String getJsonResult() {
		return jsonResult;
	}
	public void setJsonResult(String jsonResult) {
		this.jsonResult = jsonResult;
	}
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	//对管理员审核的方法
	public String adminVerify(){	
	String	ID=(String)session.get("userId");
	
	admin=adminServiceBean.getAdmin(ID);

	if(admin.getLevel()==1){
		boolean result=actReportServiceBean.update_low(actReport,Integer.parseInt(actRId), admin);
		if(result==true){
			jsonResult="一级审核成功";
			return SUCCESS;
		}else{
			jsonResult="审核失败，请检查权限";
			return ERROR;}
	}else if(admin.getLevel()==2){
		boolean result=actReportServiceBean.update_middle(actReport,Integer.parseInt(actRId), admin);
		System.out.println(result);
		if(result==true){
			System.out.println("scas");
			jsonResult="二级审核成功";
			return SUCCESS;
		}else{
			System.out.println("ss");
			jsonResult="二级审核失败，请检查权限";
			return SUCCESS;}
	 }else if(admin.getLevel()==3){
		 boolean result=actReportServiceBean.update_high(actReport,Integer.parseInt(actRId), admin,studentServiceBean);
		 if(result==true){
			 jsonResult="三级审核成功";
				return SUCCESS;
			}else{
				jsonResult="三级审核失败，请检查权限";
				return SUCCESS;}
	 }else
	    {
		 jsonResult="未知的权限定义，请检查您的权限";
		 return SUCCESS; }
	}
	//驳回方法
	public String fire(){
		if(reasonDTO!=null){
		actReport=actReportServiceBean.getwithID(reasonDTO.getActRid());
		actReportServiceBean.up_mark(actReport, reasonDTO.getReason());
		return "backstage";
		}else {
			return "up";
		}
	}
	//修改管理员密码
	public String updatePW(){
		if(session.get("userId")!=null){
			admin=adminServiceBean.getAdmin((String)session.get("userId"));
			   if(passwordDTO.getPastPassword().equals(admin.getPassword())){
				adminServiceBean.update_password(admin, passwordDTO.getNewPassword());
				jsonResult="管理员密码更新成功";
				  return SUCCESS;
			       }else 
			    	   jsonResult="旧密码不匹配";
				   return SUCCESS;
			}else{
				jsonResult="修改失败，请检查登录状态";
				return SUCCESS;
			}
	}
	//管理员的注销操作！！
	public String logout(){
		session.clear();
		return SUCCESS;
	}
}
