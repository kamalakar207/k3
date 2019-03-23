package com.prutech.authentication;

import java.util.Scanner;

/**
 * Verifies user credentials and proivides authorized access
 * 
 * @author Admin
 *
 */
public class Verification {
	static String[] loginCredentials = { "harish,kk,$1", "Username2,Password2,$2", "Username3,Password3,$3" };
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			System.out.println("enter username");
			String userName = scanner.next();
			System.out.println("enter password");
			String password = scanner.next();
			checkAuthentication(userName, password);
		}
	}

	/**
	 * checkAuthentication checks authentication of user
	 * 
	 * @param userName
	 * @param password
	 */

	public static void checkAuthentication(String userName, String password) {
		for (String string : loginCredentials) {
			String[] userDetails = string.split(",");
			if (userName.equals(userDetails[0]) && password.equals(userDetails[1])) {
				System.out.println("valid login");
				checkAuthorizationId(userDetails[2]);
				break;
			}
		}
	}

	/**
	 * checkAuthorizationId checks authorization
	 * 
	 * @param authorizationId
	 * @param userDetails
	 */
	public static void checkAuthorizationId(String userDetails) {
		System.out.println("enter authorization id");
		String authorizationId = scanner.next();
		if (authorizationId.equals(userDetails)) {
			AuthorizedAccess.authorizedData(authorizationId);
		} else {
			System.out.println("unauthorized key");
		}
	}

}