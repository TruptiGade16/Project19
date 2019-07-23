package com.cdac.everification.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.everification.model.Candidate;
import com.cdac.everification.model.Organization;
import com.cdac.everification.service.CandidateService;

@Controller
public class CandidateController {
	@Autowired
	private CandidateService candidateService;
	
	@RequestMapping(value = "/prep_candilogin_form.htm")
	public String prepLoginForm(ModelMap model) {
		model.put("candi", new Candidate());
		return "Candidate/CandidateLogin";
	}
	
	@RequestMapping(value = "/prep_candiReg_form.htm")
	public String prepRegForm(ModelMap model) {
		model.put("candi", new Candidate());
		return "Candidate/Candidate_Registration";
	}
	
	@RequestMapping(value = "/candiReg.htm")
	public String register(Candidate candi,ModelMap model) {
		candidateService.createUser(candi);
		model.put("candi", new Candidate());
		return "Candidate/CandidateLogin";
		
	}
	
	@RequestMapping(value = "/candiLogin.htm")
	public String login(Candidate candi,ModelMap model,HttpSession session) {
		
		Candidate c = candidateService.checkUser(candi);
		if(c!=null) {
			session.setAttribute("candi", c);
			return "Candidate/CandidateWelcome";
		}
		model.put("user", new Candidate());
		return "Candidate/CandidateLogin";
	}
//	private void initModelList(Model model) {
//        List<String> Genders = new ArrayList<String>();
//        Genders.add("Male");
//        Genders.add("Female");
//        model.addAttribute("Gender", Genders);
//    }
	
}
