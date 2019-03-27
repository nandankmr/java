class Fan
{

	private int speed = 1;
	private boolean on = false;
	private int radius = 5;
	private String color = "blue";

	boolean setSpeed(int level)
	{
		if(level >=1 && level <=3)
			{
				speed = level;
				return true;
			}
		else
			return false;
	}
	void turnOn(){ on = true; }

	void turnOff(){ on = false; }

	void setColor(String color){ this.color = color; }

	void setRadius(int aRadius){ radius = aRadius; }

	String toString()
	{
		String str = "";
		str += "Color: " + color + "\n";
		if(on)
		{
				str += "Speed: " + speed + "\n";
				str += "Fan is On";
		}
		else
			str+="Fan is Off";

		return str;
	}
}
