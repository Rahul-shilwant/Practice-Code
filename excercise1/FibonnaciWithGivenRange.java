package com.excercise1;

import java.util.Scanner;

public class FibonnaciWithGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int a =0;
		int b=1;
		int c;
		
		for(int i=0;i<=1000;i++) {
			c=a+b;
			if(a<=n) {
			System.out.print(a+" + ");
			a=b;
			b=c;
			}
			
		}


	}

}
