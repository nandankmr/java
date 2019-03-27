
abstract class A
{
	public void fun()
	{
		System.out.println("This is A function");

	}
}

class Test extends A
{
	static int a = 10;
	public void fun2()
	{
		System.out.println("This is I2 function");
	}

	static public void main(String...a)
	{
		Test x = new Test();
		x.fun();
		System.out.println(a);
	}
}
