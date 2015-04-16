package com.action;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Controller;

import com.DTO.ActReportDTO;
import com.DTO.PasswordDTO;
import com.DTO.UpdateARDTO;
import com.ORM.ActReport;
import com.ORM.Student;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ActReportService;
import com.service.StudentService;
@Controller
public class StuOpreationAction extends ActionSupport implements SessionAware {
	 private Map<String, Object> session; 
	 @Resource
	 private ActReportService actReportServiceBean;
	 @Resource
	 private StudentService studentServiceBean;
	 @Resource
	 private Student student;
	 @Resource
	 private ActReport actReport;
	 private ActReportDTO actReportDTO;
	 private PasswordDTO passwordDTO;
	 private UpdateARDTO updateARDTO;
	 private String actRid;
	 private String jsonResult;
	public void setSession(Map<String, Object> value) {
		this.session = value; 
	}
	public ActReportDTO getActReportDTO() {
		return actReportDTO;
	}
	public void setActReportDTO(ActReportDTO actReportDTO) {
		this.actReportDTO = actReportDTO;
	}
	public void setPasswordDTO(PasswordDTO passwordDTO) {
		this.passwordDTO = passwordDTO;
	}
	public PasswordDTO getPasswordDTO() {
		return passwordDTO;
	}
	public void setActRid(String actRid) {
		this.actRid = actRid;
	}
	public String getActRid() {
		return actRid;
	}
	public String getJsonResult() {
		return jsonResult;
	}
	public void setJsonResult(String jsonResult) {
		this.jsonResult = jsonResult;
	}
	public void setUpdateARDTO(UpdateARDTO updateARDTO) {
		this.updateARDTO = updateARDTO;
	}
	public UpdateARDTO getUpdateARDTO() {
		return updateARDTO;
	}
	//学生角色提交申报
	public String actReport(){
		if(session.get("userId")!=null){
		actReportDTO.setStuId((String) session.get("userId"));
		actReportServiceBean.update(actReport, actReportDTO);
		return "success";
		}else 
			return "error";
	}
	//学生角色修改密码
	public String changePW(){
		if(session.get("userId")!=null){
		student=studentServiceBean.get((String)session.get("userId"));
		   if(passwordDTO.getPastPassword().equals(student.getPassword())){
			student.setPassword(passwordDTO.getNewPassword());
			studentServiceBean.update(student);
			jsonResult="您的密码更新成功";
			  return SUCCESS;
		       }else {
		    	   jsonResult="旧密码不匹配";
			   return SUCCESS;
		       }
		}else{
			jsonResult="修改失败，请检查登录状态";
			return SUCCESS;
		}
	}
	//学生角色注销
	public String logout(){
		session.clear();
		return "logout";
	}
	//学生角色删除申报
	public String delete(){
		boolean k=actReportServiceBean.delete(Integer.parseInt(actRid));
		System.out.println("hgaga");
		if(k==true){
			System.out.println("hgaga");
			jsonResult="删除申报成功";
			return SUCCESS;
		}else {
			System.out.println("hasdas");
			jsonResult="删除申报失败";
			return SUCCESS;
		}
	}
	public String update(){
		actReport=actReportServiceBean.getwithID(updateARDTO.getActRId());
		actReport.setActRmark(updateARDTO.getActRmark());
		actReport.setActRname(updateARDTO.getActRname());
		actReport.setActRpoint(updateARDTO.getActRpoint());
		actReport.setActRtype(updateARDTO.getActRtype());
		boolean result=actReportServiceBean.merge(actReport);
		if(result==true){
			System.out.println("hgaga");
			jsonResult="修改申报成功";
			return SUCCESS;
		}else {
			System.out.println("hasdas");
			jsonResult="修改申报失败";
			return SUCCESS;
		}
	}

}
