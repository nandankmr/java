class RegulaPolygon
{
	private int n;
	private double side;
	private double x;
	private double y;

	RegulaPolygon()
	{
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}

	RegulaPolygon(int aN, double aSide, double aX, double aY)
	{
		n = aN;
		side = aSide;
		x = aX;
		y = aY;
	}

	void setNumberOfSides(int aN){ n = aN; }

	void setSide(double aSide){ side = aSide;}

	double getPerimeter()
	{
		return n * side;
	}

	double getArea()
	{
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
}

class Test
{
	static public void main(String...args)
	{
		RegulaPolygon one = new RegulaPolygon();
		RegulaPolygon two = new RegulaPolygon(10, 4, 5.6, 7.8);

		one.setSide(6);
		one.setNumberOfSides(4);

		System.out.println("Area of polygon 1:  " + one.getArea());
		System.out.println("Area of polygon 2:  "+ two.getArea());
		System.out.println("Perimeter of polygon 1:  " + one.getPerimeter());
		System.out.println("Perimeter of polygon 2:  " + two.getPerimeter());


	}
}
