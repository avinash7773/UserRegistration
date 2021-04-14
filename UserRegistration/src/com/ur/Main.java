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
		
	}
}
