package BasicProgram;

import java.util.Scanner;

public class PellindromNumber {
	
	public void pellindrom() {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the number:");
		int n=sc.nextInt();
		int rem=0,rev=0;
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			rev=rev*10+rem;
		}
		if(rev==n)
		{
			System.out.println("given number are pellindrom");
		}
		else
		{
			System.out.println("given number are not pellindrom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PellindromNumber p=new PellindromNumber();
		p.pellindrom();
	}

}
