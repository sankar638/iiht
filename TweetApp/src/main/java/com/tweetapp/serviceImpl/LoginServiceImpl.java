package com.tweetapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.entity.LoginEntity;
import com.tweetapp.repository.LoginRepository;

@Service
public class LoginServiceImpl {
	
	@Autowired
	private LoginRepository loginRepository;
	
public LoginEntity login(LoginEntity data) {
		
		String email=data.getEmail();
		String password=data.getPassword();
		
		LoginEntity loginEntity = new LoginEntity();
		loginEntity.setEmail(email);
		loginEntity.setPassword(password);
		
		LoginEntity save = loginRepository.save(loginEntity);
		
		LoginEntity loginEntity2 = new LoginEntity();
		loginEntity2.setEmail(save.getEmail());
		loginEntity2.setPassword(save.getPassword());
		
		
	  return loginEntity2;
		
	}

}
