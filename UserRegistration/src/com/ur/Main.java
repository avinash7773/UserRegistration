package com.ur;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Utility nameObj = new Utility();
		
		System.out.println("Enter first name=");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		nameObj.firstnameVerification(firstName);
		
	}
}
