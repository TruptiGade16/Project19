package com.cdac.everification.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cdac.everification.model.Organization;
import com.cdac.everification.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/prep_login_form.htm")
	public String prepLoginForm(ModelMap model) {
		model.put("org", new Organization());
		return "Organization/OrgLogin";
	}
	
	@RequestMapping(value = "/prep_OrgReg_form.htm")
	public String prepRegForm(ModelMap model) {
		model.put("org", new Organization());
		return "Organization/Org_Registration";
	}
	
	@RequestMapping(value = "/orgReg.htm")
	public String register(Organization org,ModelMap model) {
		userService.createUser(org);
		model.put("org", new Organization());
		return "Organization/OrgLogin";
	}
	
	@RequestMapping(value = "/login.htm")
	public String login(Organization org,ModelMap model,HttpSession session) {
		
		Organization b = userService.checkUser(org);
		if(b!=null) {
			session.setAttribute("org", b);
			return "Organization/welcomeOrg";
		}
		model.put("user", new Organization());
		return "Organization/OrgLogin";
	}
	
	/*@RequestMapping(value = "/user_list.htm")
	public String userList(ModelMap model) {
		List<User> ulist = userService.selectAllUsers();
		model.put("ul", ulist);
		return "user_list";
	}
	
	@RequestMapping(value = "/delete_user.htm")
	public String deleteUser(@RequestParam int userId,ModelMap model) {
		userService.removeUser(userId);
		List<User> ulist = userService.selectAllUsers();
		model.put("ul", ulist);
		return "user_list";
	}
	*/
}