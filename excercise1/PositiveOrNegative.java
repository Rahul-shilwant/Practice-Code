package com.excercise1;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		
		if(a<0) {
			System.out.println("Negative Number");
		}else {
			System.out.println("Postive Number");
		}
		
	}

}
