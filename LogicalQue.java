package BasicProgram;

import java.util.Scanner;

public class LogicalQue {
	/*
	 * int a=123459 

   take n=2
   
   explanation: 
   
    1*2+2/2+3*2+4/2+5*2+9*2 =
	 */
	void method()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("Enter the number to we can mult & divide");
		int k=sc.nextInt();
		int rem=0;int sum=0;
		System.out.println("the ans is :");
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			if(rem%2!=0)
			{
				System.out.print(rem+"*"+n+" ");
				sum+=rem*k;
			}
			else
			{
				System.out.print(rem+"/"+n);

				sum+=rem/k;
			}
			System.out.println();
		}
		
			System.out.println(sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicalQue L=new LogicalQue();
		L.method();

	}

}
