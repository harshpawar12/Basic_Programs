package BasicProgram;

import java.util.Scanner;

public class SwitchCaseUsing {
	void  method()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("prime number:");
		}
		else
		{
			System.out.println("not prime number");
		}
		
	}
	void method1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int p=sc.nextInt();
		int rem=0,rev=0;
		for(int i=p;i!=0;i=i/10)
		{
			rem=i%10;
			rev=rev*10+rem;
		}
		if(rev==p)
		{
		System.out.println("pellindrom number");
		}
		else
		{
			System.out.println("not pellindrom");
		}
		
	}
	void method2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int p=sc.nextInt();
		int rem=0,result=0;
		for(int i=p;i!=0;i=i/10)
		{
			rem=i%10;
			result+=(Math.pow(rem, 3));
		}
		if(result==p)
		{
		System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not Armstronmg");
		}
		
	}
	void method4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int p=sc.nextInt();
		System.out.println("enter the second number:");
		int p1=sc.nextInt();
		for(int i=p;i<=p1;i++)
		{
			int rem=0,rev=0;
			for(int j=i;j!=0;j=j/10)
			{
			rem=j%10;
			rev=rev*10+rem;
			}
			if(rev==i)
			{
				System.out.println(i);
			}
			
		}
		
			
		}
	void  method5()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		System.out.println("enter the number:");
		int n1=sc.nextInt();
		for(int i=n;i<=n1;i++)
		{
				int c=0;
				for(int J=1;J<=i;J++)
				{
					if(i%J==0)
					{
						c++;
					}
				}
				if(c==2)
				{
					System.out.println(i);
				}
		}
		}
	void method6()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int p=sc.nextInt();
		System.out.println("enter the number:");
		int p1=sc.nextInt();
		
		for(int i=p;i<=p1;i++)
		{
		int rem=0,result=0;
			for(int j=i;j!=0;j=j/10)
			{
			rem=j%10;
			result+=(Math.pow(rem, 3));
			}
			if(result==i)
			{
			System.out.println(i);
			}
		}
	}
	void method7()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1. check palindrom number \r\n"
				+ "2. check prime number \r\n"
				+ "3. check armstrong number \r\n"
				+ "4. get the palindrom series between the range \r\n"
				+ "5. get the prime series between the range \r\n"
				+ "6. get the armstrong series between the range.\r\n"
				+ "7. get the fabannoci sequence\r\n"
				+ "8. press zero(0) to exit");


		System.out.println("enter the your choice:");
		int choice=sc.nextInt();
		
		SwitchCaseUsing s=new SwitchCaseUsing();

		
		switch(choice)
		{
		case 1:
			s.method();
		break;
		case 2:
			s.method1();
		break;
		case 3:
			s.method2();
			break;
		case 4:
			s.method4();
		break;
		case 5:
			s.method5();
		break;
		case 6:
			s.method6();
			break;
		case 7:
			s.method7();
			break;
			default:System.out.println("Entre valid number");
			break;
		}
		

	}

}
