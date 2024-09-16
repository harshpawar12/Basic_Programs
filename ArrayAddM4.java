package BasicProgram;

import java.util.Scanner;

public class ArrayAddM4 {
	
	public int array(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayAddM4 A=new ArrayAddM4();
		int cal=A.array(a);
		System.out.println("Additiom of given array is:"+cal);
	}

}
