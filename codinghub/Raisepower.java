package com.codinghub;

import java.util.Scanner;

public class Raisepower {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter n1:");
		int n1=a.nextInt();
		System.out.println("enter n2:");
		int n2=a.nextInt();
		int i,j,res=1,res1=1;
		for(i=1;i<=n2;i++)
		{
			res=n1*res;//3//9//27//81;
		}
		System.out.println("n1^n2: "+res);
		for(j=1;j<=n1;j++)
		{
			res1=n2*res;
		}
		System.out.println("n2^n1: "+res1);
		
	}

}
