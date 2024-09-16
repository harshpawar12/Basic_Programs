package BasicProgram;

import java.util.Scanner;

public class Strongnumber {
	void method()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1=sc.nextInt();
	//	System.out.println("Enter the second number:");
		//int n2=sc.nextInt();
			
		
		int rem=0;
		int sum=0;
			for(int j=n1;j!=0;j=j/10)
			{
				rem=j%10;
				//System.out.println(rem)
				int fact=1;
				for(int i=1;i<=rem;i++)
				{
					fact=fact*i;

					
				}
				sum+=fact;

				//System.out.println(fact);
				
			}
		//	System.out.println(sum);
			if(sum==n1)
			{
				System.out.println("Strong number");
			}
			else
			{
				System.out.println("not strong");
			}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3a. Strong Numbers Between a Range:
   Write a program to find
    and print all strong 
    numbers between two given numbers.
     A strong number is a number in which
      the sum of the factorial of its
       digits is equal to the number itself.
        For example, 145 is a strong number
         because 1! + 4! + 5! = 145.



		 */
		Strongnumber s=new Strongnumber();
		s.method();
	}

}
