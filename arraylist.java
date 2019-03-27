import java.util.ArrayList;
class Test
{
	static public void main(String...arg)
	{
		ArrayList x = new ArrayList();
		x.add(5);
		x.add(10);
		x.add(15);
		x.add("A String");
		x.add(new java.util.Date());
		x.add(x.size(), "Another String");
		for(Object i:x)
		if(i instanceof String)
			System.out.println(((String)i).toUpperCase());
		else
			System.out.println(i);
	}
}
