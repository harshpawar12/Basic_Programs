package BasicProgram;

import java.util.Scanner;

public class HarshadNumber {
	void method()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int rem=0;int sum=0;int result=0;
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			sum+=rem;
			//System.out.println(rem);
			
		}
		System.out.println(sum);
		if((n%sum)==2)
		{
			System.out.println("Its Harshad number");

		}
		else
		{
			System.out.println("not harshad");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HarshadNumber H=new HarshadNumber();
		H.method();

	}

}
