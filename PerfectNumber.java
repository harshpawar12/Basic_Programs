package BasicProgram;

import java.util.Scanner;

public class PerfectNumber {
	
	void method()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1=sc.nextInt();
		System.out.println("Enter the second number:");
		int n2=sc.nextInt();
		System.out.println("Perfect number between given Range");
		for(int i=n1; i<=n2;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumber p=new PerfectNumber();
		p.method();
	}

}
