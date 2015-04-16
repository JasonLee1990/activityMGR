package com.ORM;

import java.io.Serializable;

import org.springframework.stereotype.Repository;
@Repository
public class Student implements Serializable {
	private String id;//学号(主键)
	private String name;//姓名
	private String sex;//性别
	private String classNo;//班号
	private String department;//系部
	private String nation;//民族
	private int point;//活动积分
	private int szdd;//思想政治与道德修养积分
	private int sjzy;//社会实践与志愿服务积分
	private int kjcx;//科技学术与创新创业积分
	private int whsx;//文化艺术与身心发展积分
	private int stsh;//社团活动与社会工作积分
	private int jnqt;//技能培训及其它积分
	private String password;//学生密码
	public Student(){
	}
	public Student(String id, String name, String sex, String classNo,
			String department, String nation, int point, int szdd, int sjzy,
			int kjcx, int whsx, int stsh, int jnqt, String password) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.classNo = classNo;
		this.department = department;
		this.nation = nation;
		this.point = point;
		this.szdd = szdd;
		this.sjzy = sjzy;
		this.kjcx = kjcx;
		this.whsx = whsx;
		this.stsh = stsh;
		this.jnqt = jnqt;
		this.password = password;
	}
	public Student(String id) {
		 this.id=id;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getSzdd() {
		return szdd;
	}
	public void setSzdd(int szdd) {
		this.szdd = szdd;
	}
	public int getSjzy() {
		return sjzy;
	}
	public void setSjzy(int sjzy) {
		this.sjzy = sjzy;
	}
	public int getKjcx() {
		return kjcx;
	}
	public void setKjcx(int kjcx) {
		this.kjcx = kjcx;
	}
	public int getWhsx() {
		return whsx;
	}
	public void setWhsx(int whsx) {
		this.whsx = whsx;
	}
	public int getStsh() {
		return stsh;
	}
	public void setStsh(int stsh) {
		this.stsh = stsh;
	}
	public int getJnqt() {
		return jnqt;
	}
	public void setJnqt(int jnqt) {
		this.jnqt = jnqt;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
