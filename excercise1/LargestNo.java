package com.excercise1;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		System.out.println("Enter value of c");
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("largest num is " + a);
		}
		else if(b > c && b > a) {
			System.out.println("largest num is" + b);
		}
		else {
			System.out.println("largest num is" + c);
		}
	}

}
