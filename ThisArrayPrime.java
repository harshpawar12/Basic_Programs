package BasicProgram;

import java.util.Scanner;

public class ThisArrayPrime {
	
	int a[];
	ThisArrayPrime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Prime  arrey are :");
		this.a=a;
		//this.method1();
	}
	public void method1()
	{
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
				}
				
			}
			if(c==2)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisArrayPrime obj=new ThisArrayPrime();
		obj.method1();
		
	}

}
