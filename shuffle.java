class Test
{

	public static void shuffle(java.util.ArrayList list)
	{
		java.util.Collections.shuffle(list);
	}
	static public void main(String...arg)
	{
		java.util.ArrayList<Number> x = new java.util.ArrayList<>();
		for(int i = 0; i<10; i++)
		{
			x.add((int)(Math.random()*50));
		}
		java.lang.System.out.println(x);
		shuffle(x);
		java.lang.System.out.println(x);
		shuffle(x);
		java.lang.System.out.println(x);
		shuffle(x);
		java.lang.System.out.println(x);
		shuffle(x);
		java.lang.System.out.println(x);
		shuffle(x);
		java.lang.System.out.println(x);
	}
}
