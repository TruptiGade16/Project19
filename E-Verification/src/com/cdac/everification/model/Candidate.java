package com.cdac.everification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate")
public class Candidate {
		@Column(name = "candi_fname")
		private String candiFname;
		@Column(name = "candi_lname")
		private String candiLname;
		@Column(name = "candi_city")
		private String candiCity;
		@Column(name = "candi_state")
		private String candiState;
		@Column(name = "candi_email")
		private String candiEmail;
		@Column(name = "candi_phone")
		private String candiPhone;
//		@Column(name = "candi_gender")
//		private String candiGender;
		@Id
		@Column(name = "userName")
		private String candiUserName;
		@Column(name="password")
		private String password;
		@Column(name = "candi_docPath")
		private String candiDocPath;
		public Candidate() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Candidate(String candiFname, String candiLname, String candiCity, String candiState, String candiEmail, String candiPhone,
				/*String candiGender,*/ String candiUserName, String password, String candiDocPath) {
			super();
			this.candiFname = candiFname;
			this.candiLname = candiLname;
			this.candiCity = candiCity;
			this.candiState = candiState;
			this.candiEmail = candiEmail;
			this.candiPhone = candiPhone;
			//this.candiGender = candiGender;
			this.candiUserName = candiUserName;
			this.password = password;
			this.candiDocPath = candiDocPath;
		}
		
		public String getCandiFname() {
			return candiFname;
		}
		public void setCandiFname(String candiFname) {
			this.candiFname = candiFname;
		}
		public String getCandiLname() {
			return candiLname;
		}
		public void setCandiLname(String candiLname) {
			this.candiLname = candiLname;
		}
		public String getCandiCity() {
			return candiCity;
		}
		public void setCandiCity(String candiCity) {
			this.candiCity = candiCity;
		}
		public String getCandiState() {
			return candiState;
		}
		public void setCandiState(String candiState) {
			this.candiState = candiState;
		}
		public String getCandiEmail() {
			return candiEmail;
		}
		public void setCandiEmail(String candiEmail) {
			this.candiEmail = candiEmail;
		}
		public String getCandiPhone() {
			return candiPhone;
		}
		public void setCandiPhone(String candiPhone) {
			this.candiPhone = candiPhone;
		}
//		public String getCandiGender() {
//			return candiGender;
//		}
//		public void setCandiGender(String candiGender) {
//			this.candiGender = candiGender;
//		}
	
		public String getCandiUserName() {
			return candiUserName;
		}
		public void setCandiUserName(String candiUserName) {
			this.candiUserName = candiUserName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCandiDocPath() {
			return candiDocPath;
		}
		public void setCandiDocPath(String candiDocPath) {
			this.candiDocPath = candiDocPath;
		}
		@Override
		public String toString() {
			return candiFname + "  " + candiLname + "  " + candiCity + "  "
					+ candiState + "  " + candiEmail + "  " + candiPhone +/* "  " + candiGender +*/
					"  " + candiUserName + "  " + password + "  "
					+ candiDocPath ;
		}
		
	}
