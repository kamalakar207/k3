package com.prutech.authentication;

import java.util.Scanner;

/**
 * AuthorizedAccess provides acess basing on authorized key
 * 
 * @author Admin
 *
 */
public class AuthorizedAccess {
	/**
	 * switch case method to provide access to functions
	 * 
	 * @param authorziedId
	 */
	public static void authorizedData(String authorziedId) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the values one after other");
		Double a = scanner.nextDouble();
		Double b = scanner.nextDouble();
		Double outcome = null;
		switch (authorziedId) {
		case "$1":
			outcome = Addition.add(a, b);
			System.out.println("after adding the values::" + outcome);
			break;
		case "$2":
			outcome = Substraction.subtract(a, b);
			System.out.println("after subtracting the values::" + outcome);
			break;

		case "$3":
			outcome = Multiplication.multiply(a, b);
			System.out.println("after multiplying the values::" + outcome);
			break;

		case "$4":
			outcome = Substraction.subtract(a, b);
			System.out.println("after subtracting the values" + outcome);
			break;

		}
	}

}
