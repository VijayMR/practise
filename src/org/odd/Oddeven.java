package org.odd;

import java.util.Scanner;

public class Oddeven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("please enter the value");
		int a = s.nextInt();
		
		if(a%2 == 0) {
			System.out.println("This is even number");
		}
		else {
			System.out.println("This is odd number");
		}
		System.out.println("success1");
		System.out.println("success2");
	}

}
