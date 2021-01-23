package com.excercise1;

import java.util.Scanner;

public class ArmstrongForThreeNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three digit Number");
		int a = sc.nextInt();
		int temp=a;
		int c=0,rem;
		
		if(a > 333) {
			System.out.println("Number should be 3 digit");
		}else {
			while(a > 0) {
				rem = a%10;
				a = a/10;
				c=c+(rem*rem*rem);
			}
			if(temp == c) {
				System.out.println("Armstrong Number");
			}else {
				System.out.println("Non-Armstrong Number");
			}
		}
	}
}