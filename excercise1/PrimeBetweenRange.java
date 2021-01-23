package com.excercise1;

import java.util.Scanner;

public class PrimeBetweenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the low range :");
		int low = sc.nextInt();
		System.out.println("Enter the high range :");
		int high = sc.nextInt();

		        while (low < high) {
		            boolean flag = false;

		            for(int i = 2; i <= low/2; ++i) {
		                // condition for nonprime number
		                if(low % i == 0) {
		                    flag = true;
		                    break;
		                }
		            }

		            if (!flag && low != 0 && low != 1)
		                System.out.print(low + " ");

		            ++low;
		        }
		    }
}

