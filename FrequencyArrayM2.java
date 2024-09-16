package BasicProgram;

import java.util.Scanner;

public class FrequencyArrayM2 {
	
	public void freq(int a[],int b[])
	{
		System.out.println("Frequency of elemet are");
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
					c++;
					
				}
			}
			if(a[i]!=-1)
			{
				System.out.println(a[i]+": Count is: "+c);
			}
		}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];

		System.out.println("Enetr the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		FrequencyArrayM2 f=new FrequencyArrayM2();
		f.freq(a, b);
		
		

	}

}
