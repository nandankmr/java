class MyInteger
{
	private int value;

	MyInteger(int value)
	{
		this.value = value;
	}

	int getValue()
	{
		return value;
	}

	boolean isEven()
	{
		return isEven(value);
	}

	boolean isOdd()
	{
		return isOdd(value);
	}

	boolean isPrime()
	{
		return isPrime(value);
	}

	static boolean isEven(int x)
	{
		return x%2 == 0;
	}

	static boolean isOdd(int x)
	{
		return x%2 != 0;
	}

	static boolean isPrime(int x)
	{
		int k=0;
		for(int i=1; i<x; i++)
			if(x%i == 0)
				k++;

		return k == 1;
	}

	static boolean isEven(MyInteger x)
	{
		return isEven(x.getValue());
	}

	static boolean isOdd(MyInteger x)
	{
		return isOdd(x.getValue());
	}

	static boolean isPrime(MyInteger x)
	{
		return isPrime(x.getValue());
	}

	boolean equals(int x)
	{
		return value == x;
	}

	boolean equals(MyInteger x)
	{
		return value == x.getValue();
	}

	int parseInt(char c[])
	{
		return Integer.parseInt(String.valueOf(c));
	}

	int parseInt(String str)
	{
		return Integer.parseInt(str);
	}
}

class Test
{
	public static void main(String...args)
	{
		MyInteger x = new MyInteger(50);
		System.out.println(x.isEven());
		System.out.println(MyInteger.isPrime(53));
		System.out.println(x.isOdd());
	}
}
