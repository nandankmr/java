abstract class Shape
{
	private String color = "White";
	private java.util.Date dateCreated;

	Shape()
	{
		dateCreated = new java.util.Date();
	}

	Shape(String col)
	{
		this();
		color = col;
	}

	abstract double getPerimeter();

	abstract double getArea();

	String getColor()
	{
		return color;
	}

	void setColor(String col){ color = col; }
}

class Circle extends Shape
{
	private double radius = 1;

	Circle(double rad, String color)
	{
		super(color);
		radius = rad;
	}

	@Override
	double getArea(){ return Math.PI * radius * radius; }

	double getPerimeter() { return 2 * Math.PI * radius; }

	void fun()
	{
		System.out.println("This is for fun");

	}
}

class Test
{
	static public void main(String...args)
	{
		BigInteger b = new BigInteger();

	}
}
