package com.ORM;

import java.io.Serializable;

import org.springframework.stereotype.Repository;
@Repository
public class Student implements Serializable {
	private String id;//ѧ��(����)
	private String name;//����
	private String sex;//�Ա�
	private String classNo;//���
	private String department;//ϵ��
	private String nation;//����
	private int point;//�����
	private int szdd;//˼�������������������
	private int sjzy;//���ʵ����־Ը�������
	private int kjcx;//�Ƽ�ѧ���봴�´�ҵ����
	private int whsx;//�Ļ����������ķ�չ����
	private int stsh;//���Ż����Ṥ������
	private int jnqt;//������ѵ����������
	private String password;//ѧ������
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
