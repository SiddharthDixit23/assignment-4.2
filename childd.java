//Answer is C option.


package check;
class parentt 
{
private void method1()
{
	System.out.println("parents method1");
	
}
public  void method2()
{
	System.out.println("parents method2");
	method1();
}
}
class childd extends parentt
{
	public void method1()
	{
		System.out.println("Childs method1");
	}
	public static void main(String[] args)
	{
		parentt p=new childd();
		p.method2();
	}
}
