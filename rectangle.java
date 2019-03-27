class Rectangle
{
	private double width = 1;
	private double height = 1;

	Rectangle()
	{
		//creates the object
	}

	Rectangle(double aWidth, double aHeight)
	{
		width = aWidth;
		height = aHeight;
	}

	double getArea()
	{
		return width * height;
	}

	double getPerimeter()
	{
		return 2 *(height + width);
	}
}

class Test
{
	static public void main(String...arg)
	{
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);

		System.out.println("Area of 1st rectangle: " + rec1.getArea());
		System.out.println("Area of 2nd rectangle: " + rec2.getArea());
		System.out.println("Perimeter of 1st rectangle: " + rec1.getPerimeter());
		System.out.println("Perimeter of 2nd rectangle: " + rec2.getPerimeter());
	}
}