package BasicProgram;

import java.util.Scanner;

public class ConstructorFactorialSumDigit {
	int n;
	ConstructorFactorialSumDigit ()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		this.n=n;
		this.method();
	}
	public void method()
	{
		System.out.println("Factorial digit seprated of given number:");
		int fact=1;int sum=0;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			int rem=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				
			}
			if(fact==rem)
			{
				sum+=rem;
				System.out.println(rem);
			}
		
			
		}
		System.out.println("Factorial of given number:");

		System.out.println("factorial:"+fact);
		System.out.println("sum of digits:"+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorFactorialSumDigit obj=new ConstructorFactorialSumDigit();

	}

}
