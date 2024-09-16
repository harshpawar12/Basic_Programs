package BasicProgram;

public class PreviousPell {

	public static int ispreviousPell(int n)
	{
		int result=0;
		for(int i=n-1;i>=1;i--)
		{
			int rem=0,rev=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev==i)
			{
				result=rev;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=121;
		System.out.println(PreviousPell.ispreviousPell(n));

	}

}
