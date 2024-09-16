package BasicProgram;

import java.util.Scanner;

public class NDigitSum {
	int n;
	NDigitSum (int n)
	{
		this.n=n;
		this.method();
	}
	void method()
	{
		int rem=0,sum=0;
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			System.out.println(rem);
			sum+=rem;
		}
		System.out.println("sum of digits:"+sum);
		System.out.println("The digits are seprated");
		int rem1=0;int sum1=0;
		for(int i=sum;sum!=0;sum=sum/10)
		{
			rem1=sum%10;
			sum1+=rem1;
		System.out.println(rem1);
		}
		System.out.println("sum of rem is:"+sum1);
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		NDigitSum N=new NDigitSum(n);
		}

}
