package com.cdac.everification.dao;

import com.cdac.everification.model.Organization;



public interface UserDao {	
	public void save(Organization org);	
	/*public void deleteById(int userId);	
	public void update(User user) ;
	public List<User> getAll() ;*/
	public Organization validateUser(Organization org);
}
