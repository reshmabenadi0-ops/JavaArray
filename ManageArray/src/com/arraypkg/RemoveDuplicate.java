package com.arraypkg;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the array");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[i++])
			{
				a[i]=a[i++];
			}
			System.out.println(a[i]);
		}

	}

}
