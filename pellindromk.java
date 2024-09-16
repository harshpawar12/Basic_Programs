package BasicProgram;

import java.util.Scanner;

public class pellindromk {
	static  boolean pell(int n)
	{
		int rem=0,rev=0;
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			rev=rev*10+rem;
		}
		
			return rev==n;
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		
		pellindromk.pell(n);
		/*if(pell(n))
		{
			System.out.println("pellindrom");
		}
		else
		{
			System.out.println("not pellindrom");
		}
		*/
		System.out.println("if "+ n+" "+pell(n));
		
	}

}
