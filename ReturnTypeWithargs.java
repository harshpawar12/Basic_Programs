package BasicProgram;

import java.util.Scanner;

public class ReturnTypeWithargs {
	
	public int add()
	{
		int ans=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the first number:");
		int n1=sc.nextInt();
		System.out.println("Entre the second number:");
		int n2=sc.nextInt();
		ans=n1+n2;
		sc.close();

		return ans;
		
	}
	

	public static void main(String[] args) {
		ReturnTypeWithargs R= new ReturnTypeWithargs();
		int kill=R.add();
		System.out.println("Addition of Two numbers is"+kill);
		
	}

}
