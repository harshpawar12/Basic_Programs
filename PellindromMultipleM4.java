package BasicProgram;

import java.util.*;

public class PellindromMultipleM4 {
	
	public int[] arr(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			
			int rem=0,rev=0;
			for(int j=a[i];j!=0;j=j/10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev==a[i])
			{
				c++;
			}
		}
		int b[]=new int[c];
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			
			int rem=0,rev=0;
			for(int j=a[i];j!=0;j=j/10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev==a[i])
			{
				b[ind]=a[i];
				ind++;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		PellindromMultipleM4 p=new PellindromMultipleM4();
		
		int k[]=p.arr(a);
		System.out.println("pellindrom number in given array:");
		for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i]+" ");
		}
		
		
	}

}
