package BasicProgram;

import java.util.Scanner;

public class Fibonancii {
	
	public void fibo(int n)// No return type with argument.
	{
		int a=0,b=1;
		int c=0;
		System.out.println("fibonacii series are :");

		for(int i=0;i<=n;i++)
		{
			c=a+b;
			System.out.print(a+" ");

			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");

		int n=sc.nextInt();
		Fibonancii f=new Fibonancii();
		f.fibo(n);

	}

}
