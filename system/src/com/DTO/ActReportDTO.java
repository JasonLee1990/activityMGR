package com.DTO;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

public class ActReportDTO {
	private String actRformat;//活动形式
	private String actRmark;//活动备注
	private String actRname;//活动名称
	private Integer actRpoint;//应得分数
	private String actRstatus;//参加情况
	private Date actRtime;//参加时间
	private String actRtype;//活动类型
	private String stuId;//提交者的学号
	public String getActRformat() {
		return actRformat;
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
}
