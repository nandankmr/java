class Stock
{
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	Stock(String aSymbol, String aName, double aCurrent, double aPrevious)
	{
		symbol = aSymbol;
		name = aName;
		previousClosingPrice = aPrevious;
		currentPrice = aCurrent;
	}

	double getPriceChangePercentage()
	{
		return ((currentPrice - previousClosingPrice)*100)/previousClosingPrice;
	}
}

class Test
{
	public static void main(String[] args) 
	{
		
		Stock x = new Stock("ORCL", "Oracle Corporation", 34.35, 34.5);
		System.out.println(x.getPriceChangePercentage() + "%");	

	}
}