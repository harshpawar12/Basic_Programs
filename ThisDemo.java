package BasicProgram;

public class ThisDemo {
	
	int id,m1,m2;  
	ThisDemo (int id,int m1,int m2)
	{
		this.id=id; // this keyword used to we can aceeess in the another method.
		this.m1=m1;
		this.m2=m2;
	}
	
	public void thismethod()
	{
		double total=m1+m2;
		System.out.println(id+"marsks"+total);
	}
	public void method2()
	{
		int total=m1+m2;
		System.out.println(id+"marsks"+total);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo d=new ThisDemo(1,80,80);
		d.thismethod();
		ThisDemo d2=new ThisDemo(2,8,80);
		d2.method2();
	}

}
