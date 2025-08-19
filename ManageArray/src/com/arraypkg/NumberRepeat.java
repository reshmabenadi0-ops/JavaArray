package com.arraypkg;

import java.util.Scanner;

public class NumberRepeat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[10];
		System.out.println("Enter the array numbers");
		
		for (int i=0;i<10;i++)
		{
			marks[i]=sc.nextInt();
		}
		System.out.println("Enter the number to check");
		int n=sc.nextInt();
		int count=0;
		for(int j=0;j<marks.length;j++)
		{
			if(n==marks[j])
			{
				count=count+1;
			}
			
		}
		System.out.println("count="+count);
		
	}

}
