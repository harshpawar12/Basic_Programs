package BasicProgram;

import java.util.Scanner;

public class AutomorphicNumber {
	
	void method()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
		
		System.out.println("given number are the Automorphic");

		for(int i=n;i<=n1;i++)
		{
			int square=0;
			int count=0;
			double lastDigit=0;
				square=i*i;
					for(int j=i;j!=0;j=j/10)
					{
					count++;
					}
	lastDigit=(square%(Math.pow(10,count)));
		 			if(i==lastDigit)
		 			{
		 				System.out.print(i+" ");
		 				
		 			}
		 
		}
			
		
	}
		
	
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomorphicNumber A=new AutomorphicNumber();
		A.method();

	}

}
