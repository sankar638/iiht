package com.tweet.entity;

public class ForgotPasswordEntity {

	private String email;
	private String confirmPassword;
	private String newPassword;

	public ForgotPasswordEntity(String email, String confirmPassword, String newPassword) {
		super();
		this.email = email;
		this.confirmPassword = confirmPassword;
		this.newPassword = newPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@Override
	public String toString() {
		return "ForgotPasswordEntity [email=" + email + ", confirmPassword=" + confirmPassword + ", newPassword="
				+ newPassword + "]";
	}

}
