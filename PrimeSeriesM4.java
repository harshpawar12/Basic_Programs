package BasicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeSeriesM4 {
	
	public void arry(int first,int last)
	{
		System.out.println("prime number between them");
		for(int i=first;i<=last;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i);
			}
		}
	
		
	}
public int[] arry1(int first,int last)
{
	int cnt=0;
	for(int i=first;i<=last;i++)
	{
	int c=0; 
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
		{
			c++;
		}
	}
	if(c==2)
	{
		cnt++;
	}
	
}
	int b[]=new int[cnt];
	int ind=0;
	for(int i=first;i<=last;i++)
	{
	int c=0; 
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
		{
			c++;
		}
	}
	if(c==2)
	{
		b[ind]=i;
		ind++;
	}
	}
	
	return b;
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first element:");
		int first=sc.nextInt();
		System.out.println("Enter the last element:");
		int last=sc.nextInt();
		
		
		PrimeSeriesM4 p=new PrimeSeriesM4();
		p.arry(first, last);
		
		int  c[]=p.arry1(first, last);
		System.out.println("printing prime array:");
		
			System.out.print(Arrays.toString(c));
		
		
	}

}
