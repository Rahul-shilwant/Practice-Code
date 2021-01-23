package com.excercise1;

import java.util.Scanner;

public class VowelAndConsonent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		if(ch == 'a'|| ch == 'A' || ch == 'e'|| ch =='E' || ch =='i'|| ch == 'I' || 
				ch =='O' || ch == 'o'|| ch == 'u' || ch == 'U') {
			System.out.println("Character is Vowel");
		}else {
			System.out.println("Character is Consonent");
		}

	}

}
