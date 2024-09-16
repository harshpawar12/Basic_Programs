package BasicProgram;

import java.util.Scanner;

public class ArrayPrime {
	
	public void Array() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		
			System.out.print("Enter the element in array:");
			

			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("prime number in array");
			for(int i=0;i<a.length;i++)
			{
				int c=0;
				for(int j=1;j<=a[i];j++)
				{
					
					if(a[i]%j==0)
					{
						c++;
					}
				}
				if(c==2)
				{
					System.out.print(a[i]+" ");
				}
			}
			
			
		
		
	}

	public static void main(String[] args) {
		ArrayPrime a=new ArrayPrime();
		a.Array();
		
		

	}

}
