package com.tweetapp.service;

import java.util.List;

import com.tweetapp.entity.RegisterEntity;

public interface RegisterService {
	
	public RegisterEntity register(RegisterEntity data);
	
	public List<RegisterEntity> viewAlluser();
	

}
