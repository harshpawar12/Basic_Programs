package BasicProgram;

import java.util.Scanner;

public class primeNumber {
	static boolean isprime(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return true;
		}
		return false;
	}
	static String isprime1(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return "String using prime";
		}	
		else
		{
			return "String using not prime";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number:");
		int n=sc.nextInt();
		sc.close();
		primeNumber p=new primeNumber();
		p.isprime(n);
		p.isprime1(n);
		System.out.println(isprime1(n));
		if(isprime(n))
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
		

	}

}
