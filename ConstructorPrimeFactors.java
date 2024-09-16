package BasicProgram;

import java.util.Scanner;

public class ConstructorPrimeFactors {
	int n;
	ConstructorPrimeFactors(int n)
	{
		this.n=n;
		this.method();
	}
	public void method()
	{
		int c=0;int max=0;
		System.out.println("Factors of given number:");
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.print(i+" ");
			int prime=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prime=1;
					
				}
			}
			if(prime==0) {
				if(i>max) {
					max=i;
				}
			}
			
			
		}
		
	}
	System.out.println("\nmax number in seris is prime:"+max);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		ConstructorPrimeFactors C=new ConstructorPrimeFactors(n);

	}

}
