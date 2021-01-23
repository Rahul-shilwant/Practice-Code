package com.excercise1;

import java.util.Scanner;

public class SwapWithoutVar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a after swap "+a);
		
		System.out.println("value of b after swap "+b);

	}

}
