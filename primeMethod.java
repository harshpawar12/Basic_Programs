package BasicProgram;

import java.util.Scanner;

public class primeMethod {
	
	public void primecheck()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
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
			System.out.println("Given number are prime number:");
		}
		else
		{
			System.out.println("Given number are not prime");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method start");
		primeMethod p=new primeMethod();
		p.primecheck();
		System.out.println("Main method completed...!!");
	}

}
