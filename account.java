import java.util.Date;
class Account
{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	Account()
	{
		dateCreated = new Date();
	}
	Account(int aId, double initialBalance)
	{
		id = id;
		balance = initialBalance;
	}

	int getId(){return id;}

	double getBalance(){return balance;}

	double getAnnualInterestRate(){return annualInterestRate;}

	Date getDateCreated(){return dateCreated;}

	void setId(int aId){id = aId;}

	void setAnnualInterestRate(double aAnnualInterestRate){annualInterestRate = aAnnualInterestRate;}

	void setBalance(double aBalance){balance = aBalance;}

	double getMonthlyInterestRate(){	return annualInterestRate/12;	}

	double getMonthlyInterest(){ return balance * getAnnualInterestRate(); }
	boolean withdraw(double amount)
	{
		if(balance >amount)
		{
			balance -= amount;
			return true;
		}
		else
			return false;
	}

	void deposit(double amount)
	{
		balance += amount;
	}

}
