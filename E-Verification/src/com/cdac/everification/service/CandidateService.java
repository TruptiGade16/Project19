package com.cdac.everification.service;

import java.util.List;

import com.cdac.everification.model.Candidate;

public interface CandidateService {

	public void createUser(Candidate candi);
	/*public void removeUser(String userName);
	public void modifyUser(Candidate candi);
	public List<Candidate> selectAllUsers();*/
	public Candidate checkUser(Candidate candi);
}
