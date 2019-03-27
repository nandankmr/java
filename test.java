import java.util.Date;
import java.util.Random;
import java.util.GregorianCalendar;

class Test
{
	public static void main(String[] args)
	{
		Object o = new A();
		A a = (A)o;
		((A)o).fun();
	}

	static void getDate()
	{
		Date x;
		for(long i = 0, time = 10000; i<8; i++, time *= 10)
		{
			x = new Date(time);
			System.out.println(x);
		}
	}

	static void getRandom()
	{
		Random x = new Random(1000);
		for(int i=0; i<50; i++)
			System.out.println(x.nextInt(100));

	}

	static void getCalender()
	{
		GregorianCalendar x = new GregorianCalendar();
		System.out.println("Month: " + x.get(GregorianCalendar.MONTH));
		System.out.println("Year: " + x.get(GregorianCalendar.YEAR));
		System.out.println("Day: " + x.get(GregorianCalendar.DAY_OF_MONTH));
		x.setTimeInMillis(1234567898765L);
		System.out.println("Month: " + x.get(GregorianCalendar.MONTH));
		System.out.println("Month: " + (x.get(GregorianCalendar.YEAR)));
		System.out.println("Month: " + (x.get(GregorianCalendar.DAY_OF_MONTH)));
	}
}

class A
{
	void fun()
	{
		System.out.println("This is a message");
	}
}
