package com.tweetapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ForgotEntity")
public class ForgotEntity {
	
	@Column(name="oldPassword")
	private String oldPassword;
	
	
	@Column(name="newPassword")
	private String newPassword;


	public String getOldPassword() {
		return oldPassword;
	}


	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}


	public String getNewPassword() {
		return newPassword;
	}


	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	

}
