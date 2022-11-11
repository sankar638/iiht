package com.tweetapp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.entity.RegisterEntity;
import com.tweetapp.repository.RegisterRepository;

@Service
public class RegisterServiceImpl {
	
	@Autowired
	private RegisterRepository registerRepository;
	
	public RegisterEntity register(RegisterEntity data) {
		
		String firstName=data.getFirstName();
		String email=data.getEmail();
		String password=data.getPassword();
		
		RegisterEntity registerEntity = new RegisterEntity();
		registerEntity.setFirstName(firstName);
		registerEntity.setEmail(email);
		registerEntity.setPassword(password);
		
		RegisterEntity save = registerRepository.save(registerEntity);
		
		RegisterEntity registerEntity2 = new RegisterEntity();
		registerEntity2.setFirstName(save.getFirstName());
		registerEntity2.setEmail(save.getEmail());
		registerEntity2.setPassword(save.getPassword());
		
		
	  return registerEntity2;
		
	}
	
	public List<RegisterEntity> viewAlluser(){
		
		List<RegisterEntity> findAll = registerRepository.findAll();
		
		return findAll;
		
	}

}
