package com.cdac.everification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.everification.dao.UserDao;
import com.cdac.everification.model.Organization;





@Service
public class UserServiceImple implements UserService {
	@Autowired
	private UserDao userDao;
	
	
	public void createUser(Organization org) {
		userDao.save(org);
	}
	
	/*public void removeUser(int userId) {
		userDao.deleteById(userId);
	}
	
	public void modifyUser(User user) {
		userDao.update(user);
	}
	
	public List<User> selectAllUsers() {
		return userDao.getAll();
	}*/
	
	@Override
	public Organization checkUser(Organization org) {
		return userDao.validateUser(org);
	}
}