package com.tweet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.tweet.dao.GuestUserDao;
import com.tweet.dao.Response;
import com.tweet.entity.ForgotPasswordEntity;
import com.tweet.entity.LoginEntity;
import com.tweet.entity.PostEntity;
import com.tweet.entity.RegisterEntity;
import com.tweet.entity.ResetPasswordEntity;

public class TweetApplicationStart {

	public static void main(String[] args) throws NumberFormatException, IOException {
		String loggedUserEmail = "";
		System.out.println("Welcome Tweet Application");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Welcome Tweet Application");
			System.out.println("=====================================");
			System.out.println("press 1: Introduction menu for guest user");
			System.out.println("press 2: Menu for Login to the user");

			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {

				System.out.println("press 1: Register");
				System.out.println("press 2: Forgot Password");
				System.out.println();

				int choose = Integer.parseInt(br.readLine());

				if (choose == 1) {

					System.out.println("Please register here for Tweet Application.");
					System.out.println("Enter first name");
					String firstname = br.readLine();

					System.out.println("Enter valid email");
					String email = br.readLine();

					System.out.println("Enter password");
					String password = br.readLine();

					RegisterEntity register = new RegisterEntity(firstname, email, password);
					System.out.println(register);

					boolean answer = GuestUserDao.register(register);
					if (answer) {
						System.out.println("user registered sucessfully.");
						System.out.println();

					} else {
						System.out.println("user not register so please contact admin.");
						System.out.println();

					}

				} else if (choose == 2) {

					System.out.println("Enter email");
					String email = br.readLine();

					System.out.println("Enter new password");
					String newPassword = br.readLine();

					System.out.println("Enter confirm password");
					String confirmPassword = br.readLine();

					ForgotPasswordEntity forgot = new ForgotPasswordEntity(email, newPassword, confirmPassword);
					System.out.println(forgot);

					String answer = GuestUserDao.forgotPassword(forgot);

					System.out.println(answer);

				} else {

				}
			} else if (choice == 2) {

				System.out.println("please enter login details:");
				System.out.println("Enter a email:");
				String email = br.readLine();
				loggedUserEmail = email;
				System.out.println("Enter a password:");
				String password = br.readLine();

				LoginEntity login = new LoginEntity(email, password);
				System.out.println(login);

				Response loginuser = GuestUserDao.loginuser(login);

				System.out.println(loginuser.getStatusMsg());
				
				if(true) {
					
				}else {
					
				}

				System.out.println("press 1: Post new tweet.");
				System.out.println("press 2: View my tweets. ");
				System.out.println("press 3: View all tweets");
				System.out.println("press 4: View all users");
				System.out.println("press 5: Reset Password");
				System.out.println("press 6: user logout");
				System.out.println();

				int choose = Integer.parseInt(br.readLine());

				if (choose == 1) {

					System.out.println("Enter your email.");
					String email1 = br.readLine();
					loggedUserEmail = email1;
					System.out.println("Enter your tweet in tweet apllication.");
					String postTweet = br.readLine();

					PostEntity post = new PostEntity(email1, postTweet);
					System.out.println(post);

					boolean answer = GuestUserDao.postTweet(post);
					if (answer) {
						System.out.println("your tweet is updated sucessfully.");
						System.out.println();

					} else {
						System.out.println("your tweet is not updated so please contact admin.");
						System.out.println();

					}

				} else if (choose == 2) {

					List<String> viewMyTweets = GuestUserDao.viewMyTweets(loggedUserEmail);

					for (String string : viewMyTweets) {
						System.out.println("tweet: " + string);
					}

				} else if (choose == 3) {

					List<String> viewAllTwets = GuestUserDao.viewAllTwets();

					for (String string : viewAllTwets) {
						System.out.println("tweet: " + string);
					}

				} else if (choose == 4) {

					List<String> viewAllUser = GuestUserDao.viewAllUser();

					for (String string : viewAllUser) {
						System.out.println("tweet: " + string);
					}

				} else if (choose == 5) {
					System.out.println("please change password");
					System.out.println("Enter email");
					String email1 = br.readLine();

					System.out.println("Enter old password");
					String oldPassword = br.readLine();

					System.out.println("Enter new password");
					String newPassword = br.readLine();

					ResetPasswordEntity reset = new ResetPasswordEntity(email1, oldPassword, newPassword);
					System.out.println(reset);

					String answer = GuestUserDao.resetPassword(reset);

					System.out.println(answer);

				} else if (choose == 6) {
					loggedUserEmail = null;
					System.exit(0);

				}else {
					
				}

			} else {

			}
			System.out.println();
			System.out.println("Thanks for using Tweet appliation.");
			System.out.println();
			System.out.println("=========================================");

		}

	}

}
