package BasicProgram;

import java.util.Scanner;

public class PrimeMethod3 {
	
	public boolean isprime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the number:");
		int n=sc.nextInt();
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
		else
		{
			return false;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeMethod3 p=new PrimeMethod3();
	boolean b=p.isprime();
		if(b)
		{
			System.out.println("given number is prime");
			
		}
		else
		{
			System.out.println("Given number are not prime");
		}
	}

}
