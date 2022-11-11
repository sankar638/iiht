package com.tweet.entity;

public class PostEntity {

	private String email;
	private String postTweet;

	public PostEntity(String email, String postTweet) {
		super();
		this.email = email;
		this.postTweet = postTweet;
	}

	public PostEntity(String postTweet) {
		super();
		this.postTweet = postTweet;
	}

	public PostEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPostTweet() {
		return postTweet;
	}

	public void setPostTweet(String postTweet) {
		this.postTweet = postTweet;
	}

	@Override
	public String toString() {
		return "PostEntity [email=" + email + ", postTweet=" + postTweet + "]";
	}

}
