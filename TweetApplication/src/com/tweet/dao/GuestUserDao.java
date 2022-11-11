package com.tweet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tweet.connection.ConnectionProvider;
import com.tweet.entity.ForgotPasswordEntity;
import com.tweet.entity.LoginEntity;
import com.tweet.entity.PostEntity;
import com.tweet.entity.RegisterEntity;
import com.tweet.entity.ResetPasswordEntity;

public class GuestUserDao {

	public static boolean register(RegisterEntity register) {

		boolean status = false;
		try {

			Connection con = ConnectionProvider.create();
			String query1 = "insert into user(firstname,email,password)" + " values(?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(query1);
			pstmt.setString(1, register.getFirstName());
			pstmt.setString(2, register.getEmail());
			pstmt.setString(3, register.getPassword());

			pstmt.executeUpdate();
			status = true;

		} catch (Exception e) {
			e.printStackTrace();

		}

		return status;
	}

	public static String forgotPassword(ForgotPasswordEntity forgot) {

		String status = null;
		try {

			Connection con = ConnectionProvider.create();

			if (forgot.getConfirmPassword().equals(forgot.getNewPassword())) {
				String query1 = "update user SET password=? where email=?";

				PreparedStatement pstmt = con.prepareStatement(query1);
				pstmt.setString(1, forgot.getNewPassword());
				pstmt.setString(2, forgot.getEmail());

				pstmt.executeUpdate();
				System.out.println();
				status = "password set succussfully";
			} else {
				System.out.println();
				status = "confirmpassword and newpassword not matched";
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return status;

	}

	public static Response loginuser(LoginEntity login) {
		Response res = new Response();
		try {

			Connection con = ConnectionProvider.create();

			String query1 = "select email, password from user where email=?";
			PreparedStatement pstmt = con.prepareStatement(query1);
			pstmt.setString(1, login.getEmail());
			ResultSet re = pstmt.executeQuery();
			if (re.next()) {
				String email = re.getString("email");
				String password = re.getString("password");
				if (login.getEmail() != null && login.getPassword() != null && login.getEmail().equals(email)
						&& login.getPassword().equals(password)) {
					res.setStatus(true);
					System.out.println();
					res.setStatusMsg("user successfully logged in");

				} else {
					res.setStatus(false);
					res.setStatusMsg("email / password are invalied");
				}
			} else {
				res.setStatus(false);
				res.setStatusMsg("user not found with email");
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

		return res;
	}

	public static boolean postTweet(PostEntity post) {

		boolean status = false;
		try {

			Connection con = ConnectionProvider.create();
			String query1 = "insert into post(email,posttweet)" + " values(?,?)";

			PreparedStatement pstmt = con.prepareStatement(query1);
			pstmt.setString(1, post.getEmail());
			pstmt.setString(2, post.getPostTweet());
			pstmt.executeUpdate();
			status = true;

		} catch (Exception e) {
			e.printStackTrace();

		}

		return status;
	}

	public static List<String> viewMyTweets(String email) {
		List<String> list = new ArrayList<String>();
		// boolean status=false;
		try {

			Connection con = ConnectionProvider.create();
			String query1 = "select posttweet from post where email=?";
			PreparedStatement pstmt = con.prepareStatement(query1);
			pstmt.setString(1, email);
			ResultSet set = pstmt.executeQuery();

			while (set.next()) {
				String post = set.getString(1);
				list.add(post);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public static List<String> viewAllTwets() {

		List<String> list = new ArrayList<String>();
		try {

			Connection con = ConnectionProvider.create();
			String query1 = "select posttweet from post";
			PreparedStatement pstmt = con.prepareStatement(query1);
			ResultSet set = pstmt.executeQuery();

			while (set.next()) {
				String post = set.getString(1);
				list.add(post);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	public static List<String> viewAllUser() {

		List<String> list = new ArrayList<String>();
		try {
			Connection con = ConnectionProvider.create();
			String query1 = "select firstname from user";
			PreparedStatement pstmt = con.prepareStatement(query1);
			ResultSet set = pstmt.executeQuery();

			while (set.next()) {
				String post = set.getString(1);
				list.add(post);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	public static String resetPassword(ResetPasswordEntity reset) {

		String status = null;
		try {

			Connection con = ConnectionProvider.create();

			if (reset.getOldPassword() != reset.getNewPassword()) {
				String query1 = "update user SET password=? where email=?";

				PreparedStatement pstmt = con.prepareStatement(query1);
				pstmt.setString(1, reset.getNewPassword());
				pstmt.setString(2, reset.getEmail());
				pstmt.executeUpdate();
				status = "password changed succussfully";
			} else {
				status = "old password does not matched";
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return status;

	}

}
