package com.tweetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetapp.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, String>{

}
