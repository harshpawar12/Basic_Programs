package BasicProgram;

import java.util.Scanner;

public class ConstructorFiboSum {
	int n1,n2;
	ConstructorFiboSum(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		this.method();
	}
	void method()
	{
		System.out.println("Fibonancii are:");
		int a=0,b=1,c=0,sum=0;
		for(int i=n1;i<=n2;i++)
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
			if(a%2==0)
			{
				sum+=a;
			}
			
		}
		System.out.println("\n sum in Even fibo:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
		System.out.println("Enter the second number:");
		int n2=sc.nextInt();
		ConstructorFiboSum C=new ConstructorFiboSum(n1,n2);
		

	}

}
