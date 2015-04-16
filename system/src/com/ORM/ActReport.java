package com.ORM;

import java.io.Serializable;
import java.sql.Date;
import org.springframework.stereotype.Repository;
@Repository
public class ActReport implements Serializable {
	private int actRid;//申报记录编号(主键)
	private String stuId;//学号(外键)
	private Integer actRverify;//审核级别
	private String actRformat;//活动形式
	private String actRmark;//备注
	private String actRname;//活动名称
	private Integer actRpoint;//应得分数
	private String actRstatus;//参加情况
	private Date actRtime;//参加时间
	private String actRtype;//活动类型
	private Student student;//多对一映射关联
	public String getActRformat() {
		return actRformat;
	}
	public int getActRid() {
		return actRid;
	}
	public String getActRmark() {
		return actRmark;
	}
	public String getActRname() {
		return actRname;
	}
	public Integer getActRpoint() {
		return actRpoint;
	}
	public String getActRstatus() {
		return actRstatus;
	}
	public Date getActRtime() {
		return actRtime;
	}
	public String getActRtype() {
		return actRtype;
	}
	public String getStuId() {
		return stuId;
	}
	public void setActRformat(String actRformat) {
		this.actRformat = actRformat;
	}
	public void setActRid(int actRid) {
		this.actRid = actRid;
	}
	public void setActRmark(String actRmark) {
		this.actRmark = actRmark;
	}
	public void setActRname(String actRname) {
		this.actRname = actRname;
	}
	public void setActRpoint(Integer actRpoint) {
		this.actRpoint = actRpoint;
	}
	public void setActRstatus(String actRstatus) {
		this.actRstatus = actRstatus;
	}
	public void setActRtime(Date actRtime) {
		this.actRtime = actRtime;
	}
	public void setActRtype(String actRtype) {
		this.actRtype = actRtype;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public void setActRverify(Integer actRverify) {
		this.actRverify = actRverify;
	}
	public Integer getActRverify() {
		return actRverify;
	}
	public ActReport(){
		
	}
	public ActReport(int actRid, String stuId, String classId,String actRformat,String actRmark,
			String actRname, Integer actRpoint,String actRstatus, Date actRtime, String actRtype,Integer actRverify,
			Student student) {
		this.actRid = actRid;
		this.stuId = stuId;
		this.actRformat = actRformat;
		this.actRmark = actRmark;
		this.actRname = actRname;
		this.actRpoint = actRpoint;
		this.actRstatus = actRstatus;
		this.actRtime = actRtime;
		this.actRtype = actRtype;
		this.student = student;
		this.actRverify=actRverify;

	}

}
