package com.tweetapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.entity.ForgotEntity;
import com.tweetapp.repository.ForgotRepository;

@Service
public class ForgotServiceImpl {
	
	@Autowired
	private ForgotRepository forgotRepository;
	
public ForgotEntity forgot(ForgotEntity data) {
		
		String oldPassword=data.getOldPassword();
		String newPassword=data.getNewPassword();
		
		ForgotEntity forgotEntity = new ForgotEntity();
		forgotEntity.setOldPassword(oldPassword);
		forgotEntity.setNewPassword(newPassword);
		
		ForgotEntity save = forgotRepository.save(forgotEntity);
		
		ForgotEntity forgotEntity2 = new ForgotEntity();
		forgotEntity2.setOldPassword(save.getOldPassword());
		forgotEntity2.setNewPassword(save.getNewPassword());
		
		
	  return forgotEntity2;
		
	}
	
	

}
