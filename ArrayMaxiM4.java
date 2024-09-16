package BasicProgram;

import java.util.Scanner;

public class ArrayMaxiM4 {
	
	public int Arr(int a[])
	{
		int max=0,secmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			
		}
		return secmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the size of an array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayMaxiM4 A=new ArrayMaxiM4();
		int cal=A.Arr(a);
		System.out.println("SecMaximum in given array:"+cal);
		
	}

}
