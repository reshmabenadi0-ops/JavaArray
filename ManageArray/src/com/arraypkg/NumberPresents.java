package com.arraypkg;

import java.util.Scanner;

public class NumberPresents {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the array :");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be checked");
		int n=sc.nextInt();
		int flag=0;
		for (int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
				System.out.println(a[i]);
			}
		}
		if(flag==1)
		{
			System.out.println("Number found");
		}
		else
		{
			System.out.println("Number not found");
		}

	}

}
