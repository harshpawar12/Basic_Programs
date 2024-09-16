package BasicProgram;

public class ConstructorDemo {
	
	public  ConstructorDemo()
	{
		System.out.println("Default constructor...");
	}
	
	public ConstructorDemo(int a,int b) //parameterised constructor.
	{
		System.out.println("the Addition  of parameterized \n value are:"+a+"+"+b+"="+(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo C=new ConstructorDemo();
		ConstructorDemo obj=new ConstructorDemo(100,300);
		
	}

}
