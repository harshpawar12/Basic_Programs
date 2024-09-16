package BasicProgram;

public class krishna {

	krishna()
	{
		int n=145;
		int rem=0;
		int sum=0;
			for(int i=n; i!=0; i=i/10)
			{
				rem=i%10;
				int fact=1;
				for(int j=1;j<=rem;j++)
				{
				fact=fact*j;
				}
				sum=sum+fact;
				
			}
			System.out.println("Sum is:"+sum);
			if(sum==n)
			{
			System.out.println("Given number is KrishnaMurthy Number");
			}
			else
			{
			System.out.println("Given number is not KrishnaMurthy number");
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		krishna k=new krishna();

	}

}
