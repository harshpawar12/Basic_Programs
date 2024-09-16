package BasicProgram;

import java.util.Scanner;

public class ConstructorPerfectNumber {
	int n;
	ConstructorPerfectNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		 n=sc.nextInt();
		this.n=n;
		this.method();
	}
	public void method()
	{
		System.out.println("perfect number are:");
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println(n);
			
		}
		else
		{
			System.out.println("not perfect");
		}
		
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorPerfectNumber A=new ConstructorPerfectNumber();
	}

}
