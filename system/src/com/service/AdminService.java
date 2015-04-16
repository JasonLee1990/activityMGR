package com.service;

import com.ORM.Admin;

public interface AdminService {
	
	/*public List<Admin> getall();*/

	public void save(Admin admin);
	public Admin getAdmin(String id);
	public void update_password(Admin admin,String password);

}