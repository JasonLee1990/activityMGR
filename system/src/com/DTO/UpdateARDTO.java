package com.DTO;

public class UpdateARDTO {
	private int actRId;//被修改记录的编号
	private String actRmark;//活动备注
	private String actRname;//活动名称
	private String actRtype;//活动类型
	private Integer actRpoint;//应得分数
	public int getActRId() {
		return actRId;
	}
	public String getActRmark() {
		return actRmark;
	}
	public String getActRname() {
		return actRname;
	}
	public String getActRtype() {
		return actRtype;
	}
	public void setActRId(int actRId) {
		this.actRId = actRId;
	}
	public void setActRmark(String actRmark) {
		this.actRmark = actRmark;
	}
	public void setActRname(String actRname) {
		this.actRname = actRname;
	}
	public void setActRtype(String actRtype) {
		this.actRtype = actRtype;
	}
	public void setActRpoint(Integer actRpoint) {
		this.actRpoint = actRpoint;
	}
	public Integer getActRpoint() {
		return actRpoint;
	}
}
