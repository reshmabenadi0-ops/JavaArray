package com.arraypkg;

public class ArraySum {

	public static void main(String[] args) {
		int a[]= {8,10,3,2,1,4};
		int size=a.length;
		int sum=0;
		for (int i=0;i<size;i++)
		{
			
			sum=a[i]+sum;
		  
		}
		System.out.println(sum);
		for (int i=0;i<size;i++)
		{
			
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		  
		}
		
	}

}
