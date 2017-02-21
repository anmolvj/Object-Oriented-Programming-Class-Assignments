package vijayvargiya.assign1.money;

public class USMoney {

	int dollars;
	int cents;

	//Constructor with required checks
	public USMoney(int dollars, int cents)
	{
		if(cents>=100)//if cents have value greater than hundred
		{
			this.cents = (cents % 100);
			this.dollars = dollars + (cents - this.cents)/100;
		}
		
		else//if cents have a value less than hundred
		{
			this.dollars = dollars;
			this.cents = cents;
		}
	}//constructor ends

	//Default constructor
	public USMoney()
	{
		dollars = 0;
		cents = 0;
	}//default constructor ends

	/*
	SETTERS
	*/
	//setter to set dollars
	public void setDollars(int dollars)
	{
		this.dollars = this.dollars + dollars;
		
	}//setter for dollar ends

	//setter to set cents
	public void setCents(int cents)
	{
		if(cents>=100)
		{
			this.cents = cents%100;
			dollars = dollars + (cents-this.cents)/100;
		}
		else
		{
			this.cents = cents;
		}
	
	}//setter for cents ends

	/*
	GETTERS
	*/
	//getter to get dollar
	public int getDollars()
	{
		return dollars;
	}//getter for dollar ends

	//getter to get cents
	public int getCents()
	{
		return cents;
	}//getter for cents end

// addTo() method Definition
	public void addTo(int dollars, int cents)
	{
	int d1=0,c1=0;
	
		//CHECK IF VALUE OF CENTS IS LESS THAN 100
		if(cents>=100)//if cents have value greater than hundred
			{
				c1 = (cents % 100);
				d1 = dollars + (cents - c1)/100;
			}
		else
			{
				c1 = cents;
				d1 = dollars;
			}
		
		this.dollars = this.dollars + d1;
		this.cents = this.cents + c1;
		
			}//addTo() definition ends

	//add USMoney method
	public USMoney add(USMoney money)
	{
		USMoney USMoney1 = new USMoney();
		
		int ce= money.getCents();
		USMoney1.setCents(cents + ce);
		int dol = this.dollars + money.getDollars();
		USMoney1.setDollars(dol);
		
		return(USMoney1);
	}//USMoney method ends

	//toString method
	public String toString()
	{
		return(String.valueOf(dollars) + "." + String.valueOf(cents));
	}//to string method ends

}
