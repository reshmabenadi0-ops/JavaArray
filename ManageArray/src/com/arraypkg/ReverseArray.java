package com.arraypkg;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int size=a.length;
		System.out.println("size="+size);
		for (int i=size-1;i>=0;i--)
		{
			System.out.println("a["+i+"]="+a[i]);
		}

	}

}
