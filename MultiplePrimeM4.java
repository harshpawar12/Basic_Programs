package BasicProgram;

import java.util.Scanner;

public class MultiplePrimeM4 {
	
	public int[] arr(int a[])
	{
		int cnt=0;
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
			//	System.out.println(a[i]+" ");
				cnt++;
			}
		}
		int b[]=new int[cnt];
		int ind=0;
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
				
				b[ind]=a[i];
				ind++;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size in array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("prime number between array:");
		MultiplePrimeM4 M=new MultiplePrimeM4();
		int p[]=M.arr(a);
		for(int i=0;i<p.length;i++)
		{
			System.out.print(p[i]+" ");
		}
		

	}

}
