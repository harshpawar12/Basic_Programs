package BasicProgram;

public class ConstructorOverloading {
	
	public ConstructorOverloading(int a)
	{
		System.out.println("Integer value:"+a);
	}
	public ConstructorOverloading(int b,float c)
	{
		System.out.println("Integer :"+b+" Float: "+c);
	}
	public ConstructorOverloading(long b,int  c)
	{
		System.out.println("Long :"+b+" Integer: "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj1=new ConstructorOverloading(100);
		ConstructorOverloading obj2=new ConstructorOverloading(12,34.45f);
		ConstructorOverloading obj3=new ConstructorOverloading(12345L,34);
	}

}
