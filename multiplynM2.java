package BasicProgram;

import java.util.Scanner;

public class multiplynM2 {
	
	public void multi(int n)
	{
		int rem=0;
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		multiplynM2 m=new multiplynM2();
		m.multi(n);
		
		
		

	}

}
