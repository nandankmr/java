class Circle2d
{
	private MyPoint centre;
	private double radius;

	Circle2d()
	{
		centre = new MyPoint();
		radius = 1;
	}

	Circle2d(MyPoint point, double rad)
	{
		centre = point;
		radius = rad;
	}

	MyPoint getCentre()
	{
		return centre;
	}

	double getArea()
	{
		return Math.PI * radius * radius;
	}

	double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}

	boolean contains(MyPoint point)
	{
		return centre.distance(point)<=radius;
	}

	boolean contains(Circle2d circle)
	{
		return centre.distance(circle.getCentre()) <= radius - circle.getRadius();
	}

	boolean overlaps(Circle2d circle)
	{
		return centre.distance(circle.getCentre()) <= (radius+circle.getRadius());
	}

	double getRadius(){ return radius; }

}

class Test
{
	static public void  main(String...args)
	{
		Circle2d c1 = new Circle2d(new MyPoint(2, 2), 5.5);
		System.out.println(c1.contains(new MyPoint(3,3)));
		System.out.println(c1.contains(new Circle2d(new MyPoint(4, 5), 10.5)));
		System.out.println(c1.overlaps(new Circle2d(new MyPoint(3, 5), 2.3)));

	}

}

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
