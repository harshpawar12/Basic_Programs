package BasicProgram;


public class PellImp {

	public static int isNextPell(int n)
	{
		int resut=0;
		for(int i=n+1;i<=n*n;i++)
		{
			int rem=0,rev=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev==i)
			{
				resut=rev;
				//System.out.println(rev);
				break;
				
			}
		}
		return resut;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
	System.out.println(	PellImp.isNextPell(n));

	}

}
