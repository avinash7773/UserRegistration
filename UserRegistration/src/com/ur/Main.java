package com.ur;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Utility nameObj = new Utility();
		
		System.out.println("Enter first name=");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		nameObj.firstnameVerification(firstName);
		
		System.out.println("Enter last name=");
		Scanner sc1 = new Scanner(System.in);
		String lastName = sc1.next();
		nameObj.firstnameVerification(lastName);
		
		System.out.println("Enter email=");
		Scanner sc3 = new Scanner(System.in);
		String email = sc3.next();
		nameObj.emailVerify(email);
		
		System.out.println("Enter mobile number=");
		Scanner sc4 = new Scanner(System.in);
		String mo_number = sc4.next();
		nameObj.mobileFormate(mo_number);
		
		System.out.println("Enter password=");
		Scanner sc5 = new Scanner(System.in);
		String password = sc5.next();
		nameObj.passwordVerify(password);
	}
}
