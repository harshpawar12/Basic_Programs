package BasicProgram;

public class ThisConstructoOverload {
	
	
	ThisConstructoOverload()
	{
		this(23); // this access int a
		System.out.println("Default constructor...");
	}
	ThisConstructoOverload(int a)
	{
		this(34,45.90f);// this acess int b,float c
		System.out.println("value are:"+a);
	}
	ThisConstructoOverload(int b,float c)
	{
		this(12345L,56.09f);//this aceess long l,float c
		System.out.println(b+" value "+c);
	}
	ThisConstructoOverload(long l,float f)
	{
		
		System.out.println(l+" valus "+f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructoOverload obj=new ThisConstructoOverload();
		
	}

}
