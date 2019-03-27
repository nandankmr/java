class StopWatch
{
	private long startTime, endTime;

	StopWatch()
	{
		startTime = System.currentTimeMillis();
		endTime = System.currentTimeMillis();
	}

	long getElapsedTime()
	{
		return endTime - startTime;
	}

	void start()
	{
		startTime = System.currentTimeMillis();
	}

	void stop()
	{
		endTime = System.currentTimeMillis();
	}
}

class Test
{
	static public void main(String...arg)
	{
		int numbers[] = new int[10000];
		for(int i=0; i < numbers.length; i++)
				numbers[i] = (int)(Math.random()*10000);
		
		StopWatch x = new StopWatch();
		x.start();
		sort10ThousandNumbers(numbers);
		x.stop();
		System.out.println(x.getElapsedTime());
		

		// for(int i:numbers)
		// 	System.out.println(i);
	}

	static int[] sort10ThousandNumbers(int...numbers)
	{
		for(int i=0; i<numbers.length; i++)
			for(int j=i+1; j<numbers.length; j++)
			{
				if(numbers[i]>numbers[j])
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		return numbers;
	}
}