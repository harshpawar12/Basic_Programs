package BasicProgram;

import java.util.Scanner;

public class ConstruPrimePellLargest {
	int n1,n2;
	ConstruPrimePellLargest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		 n1=sc.nextInt();
		 System.out.println("Enter the second number");
		 n2=sc.nextInt();
		this.n1=n1;
		this.n2=n2;
		this.method1();
	}
	public void method1()
	{
		int max=0;int product=1;
		for(int i=n1;i<=n2;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				int rem=0,rev=0;
				for(int k=i;k!=0;k=k/10)
				{
					rem=k%10;
					rev=rev*10+rem;
				}
				if(i==rev)
				{
					if(i>max)
					{
						max=i;
					}
				}

			}
			
			
		}
		System.out.println("maximum number is:"+max);
		int i=max;int rem=0;
		for(int k=i;k!=0;k=k/10)
		{
			rem=k%10;
			product*=rem;
		}
		System.out.println("product of digit is:"+product);
		}
		public static void main(String[] args) {
		
		ConstruPrimePellLargest obj=new ConstruPrimePellLargest();
	}

}
