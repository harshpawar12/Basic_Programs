package BasicProgram;

import java.util.Scanner;

public class ConstuctorPrimeSum {
	
	int n1,n2;
	ConstuctorPrimeSum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		 n1=sc.nextInt();
		 System.out.println("Enter the second number:");
		 n2=sc.nextInt();
		 
		this.n1=n1;
		this.n2=n2;
		this.method();
	}
	public void method()
	{
		int sum=0;
		for(int i=n1;i<=n2;i++)
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
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of prime number are:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstuctorPrimeSum obj=new ConstuctorPrimeSum();

	}

}
