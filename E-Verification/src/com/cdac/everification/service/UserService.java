package com.cdac.everification.service;

import java.util.List;

import com.cdac.everification.model.Organization;





public interface UserService {	
	public void createUser(Organization org);
	/*public void removeUser(int userId);
	public void modifyUser(User user);
	public List<User> selectAllUsers();*/
	public Organization checkUser(Organization org);

}