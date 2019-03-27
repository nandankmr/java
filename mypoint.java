class MyPoint
{
	private double x, y;

	MyPoint()
	{
		x = 0;
		y = 0;
	}

	MyPoint(double a, double b)
	{
		x = a;
		y = b;
	}

	double distance(MyPoint point)
	{
		return Math.sqrt((x-point.x)*(x-point.x) + (y-point.y)*(y-point.y));
	}
}

class Test
{
	static public void main(String...arg)
	{
		double d = new MyPoint().distance(new MyPoint(10,30.5));
		System.out.println(d);
	}
}
