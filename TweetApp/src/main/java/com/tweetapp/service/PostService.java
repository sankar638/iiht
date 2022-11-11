package com.tweetapp.service;

import com.tweetapp.entity.PostEntity;

import java.util.List;;

public interface PostService {
	
	public PostEntity createPost(PostEntity data);
	
	public List<PostEntity> viewTweetByuser();
	
	public List<PostEntity> viewAllTweet();
	
	

}
