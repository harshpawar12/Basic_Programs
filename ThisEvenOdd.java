package BasicProgram;

public class ThisEvenOdd {
	
	ThisEvenOdd()
	{
		this.Even();
		
	}
	public void Even()
	{
		for(int i=2;i<=50;i=i+2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Odd number are");
		this.odd();
	}
	public void odd()
	{
		for(int i=1;i<=50;i=i+2)
		{
			System.out.print(i+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisEvenOdd T=new ThisEvenOdd();
		
	}

}
