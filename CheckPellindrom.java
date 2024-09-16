package BasicProgram;

import java.util.Scanner;

public class CheckPellindrom {

	int arr(int n)
	{
		int rem=0,rev=0;
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			rev=rev*10+rem;
		}
		if(rev==n)
		{
			
			System.out.println("given number are pellindrom");
		}
		else
		{
			System.out.println("Given number are not pellindrom");
		}
		return n;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number");
		int n=sc.nextInt();
		sc.close();
		System.out.println("using returnType....");
		CheckPellindrom c=new CheckPellindrom();
		int a=c.arr(n);
		
		
		
		

	}

}
