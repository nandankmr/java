class QuadraticEquation
{
	private int a, b, c;

	QuadraticEquation(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	int getA(){return a;}
	int getB(){return b;}
	int getC(){return c;}

	int getDiscriminant()
	{
		return b*b - 4*a*c;
	}

		int getRoot1()
		{
			if(getDiscriminant() < 0)
				return 0;
			else {
				return (-1*b + getDiscriminant())/(2*a);
			}
		}
		int getRoot2()
		{
			if(getDiscriminant() < 0)
				return 0;
			else {
				return (-1*b - getDiscriminant())/(2*a);
			}
		}
}
