package BasicProgram;

import java.util.Scanner;

public class ArmstrongNumber {
 static String  isArm(int n)
	{
		int rem=0;
		int result=0;
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			result+=(Math.pow(rem, 3));
		}
        if(result==n)
        {
        	return "Armstrong";
        }
		return "not armstrong";

        
	 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the number:");
		int n=sc.nextInt();
		ArmstrongNumber A=new ArmstrongNumber();
		String b=A.isArm(n);
		System.out.println(isArm(n));
		/*if(A.isArm(n))
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not armstrong");
		}*/
		
		

	}

}
  