package BasicProgram;

import java.util.Scanner;

public class PrimeArrayMethod2 {
	
	public void method2(int a[])
	{
		System.out.println("prime numbers in given arrays are");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
					break;
				
				}
			}
			if(c==0 && a[i]!=1)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		PrimeArrayMethod2 p=new PrimeArrayMethod2();
		p.method2(a);
		
		
		

	}

}
