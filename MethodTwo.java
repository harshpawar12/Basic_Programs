package BasicProgram;

import java.util.Scanner;

public class MethodTwo {
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("\nAddition of two numbers"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTwo m=new MethodTwo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");

		int a=sc.nextInt();
		System.out.println("Enter the second number:");

		int b=sc.nextInt();
		m.add(a, b);
		
		

	}

}
