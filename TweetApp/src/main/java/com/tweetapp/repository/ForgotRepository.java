package com.tweetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetapp.entity.ForgotEntity;

public interface ForgotRepository extends JpaRepository<ForgotEntity, String> {

}
