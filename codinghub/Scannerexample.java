package com.codinghub;
import java.util.Scanner;

public class Scannerexample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter int value:");
		int a=s.nextInt();
		System.out.println(a);
		System.out.println("enter double value:");
		double b=s.nextDouble();
		System.out.println(b);
		System.out.println("enter string1:");
		String s1=s.next();
		System.out.println(s1);
		s.nextLine();
		System.out.println("enter string2:");
		String s2=s.nextLine();
		System.out.println(s2);
		System.out.println("enter character:");
		char c=s.next().charAt(0);
		System.out.println(c);
		

	}

}
