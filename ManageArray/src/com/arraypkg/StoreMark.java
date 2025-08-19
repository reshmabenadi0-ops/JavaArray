package com.arraypkg;

public class StoreMark {

	public static void main(String[] args) {
		int marks[]= {50,70,70,80,90,100};
		int size=marks.length;
		System.out.println("size="+size);
		/*for (int i=0;i<size;i++)
		{
			System.out.println("marks["+i+"]="+marks[i]);
		}*/
		int highest=marks[0];
		int lowest=marks[0];
		for (int i=0;i<size;i++)	
		{
			if (marks[i]<lowest)
			{
				lowest=marks[i];
			}
			if (marks[i]>highest)
			{
				highest=marks[i];
			}
		}
		System.out.println("highest="+highest);
		System.out.println("lowest="+lowest);
		
	}

}
