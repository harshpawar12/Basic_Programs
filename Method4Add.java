package BasicProgram;

import java.util.Scanner;

public class Method4Add {

	public int add(int n1,int n2)
	{
		int ans=0;
		ans=n1+n2;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the first number:");
		int n1=sc.nextInt();
		System.out.println("Entre the second number:");
		int n2=sc.nextInt();
		
		Method4Add M=new Method4Add();
		int cal=M.add(n1, n2);
		System.out.println("Addition of givens:"+cal);
		
		

	}

}
