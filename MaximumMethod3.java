package BasicProgram;

import java.util.Scanner;

public class MaximumMethod3 {

	public int max()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the number first:");
		int n1=sc.nextInt();
		System.out.println("Entre the number first:");
		int n2=sc.nextInt();
		if(n1>=n2)
		{
			return n1;
		}
		else
		{
			return n2;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumMethod3 M=new MaximumMethod3();
		int maxi=M.max();
		System.out.println("maximum number between:"+maxi);
	}

}
