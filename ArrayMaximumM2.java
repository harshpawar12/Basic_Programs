package BasicProgram;

import java.util.Scanner;

public class ArrayMaximumM2 {
	
	public void max(int a[])
	{
		int max=0;
		System.out.println("Maximum number of given array");
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
		}
		System.out.println("maximum is"+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enetr the element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayMaximumM2 b=new ArrayMaximumM2();
		b.max(a);
		
		

	}

}
