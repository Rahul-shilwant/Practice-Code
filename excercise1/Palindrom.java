package com.excercise1;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int rev = 0;
		int rem;
		while(a != 0) {
			rem = a %10;
			rev = (rev * 10) + rem;
			a = a/10;
		}
		System.out.println(rev);
	}

	}

