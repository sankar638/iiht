package com.tweetapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ForgotEntity")
public class PostEntity {
	
	@Column(name="postname")
	private String postname;
	
	
	@Column(name="desc")
	private String desc;


	public String getPostname() {
		return postname;
	}


	public void setPostname(String postname) {
		this.postname = postname;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	

}
