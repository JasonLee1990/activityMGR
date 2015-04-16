package com.ORM;

import java.io.Serializable;

import org.springframework.stereotype.Repository;
@Repository
public class Admin implements Serializable {
	private String id;//管理员ID(主键)
	private String name;//姓名
	private Integer level;//权限级别
	private String password;//管理员密码
	private String classId;//管理员班号
	private String department;//管理员系部
	public Admin(){
	}
	public Admin(String id, String name, Integer level, String password) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassId() {
		return classId;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
	
}
