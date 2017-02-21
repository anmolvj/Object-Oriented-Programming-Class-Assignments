package vijayvargiya.assign1.salebin;

import vijayvargiya.assign1.money.USMoney;

public class SmartBin extends Bin {
	
	String label;
	protected static int itemsIndex = 0;
	
	// Custom Constructor
	public SmartBin()
	{
		binNumber = "SM" + generateBinNumber();
	}
	
	//method to set Label
	public void setLabel(String label)
	{
		this.label = label;
	}
	
	//addItem method that only adds items irrespective of value of fragile
	public void addItem(ItemType item)
	{
		if(items[0]==null)
		{
			
				items[0]=item;
				itemsIndex++;
				if(!(item.isFragile()))
				{
					setLabel("Fragile - Handle with Care");
				}
			
		}	
		
		else
		{
			double newWeight = item.getWeight() + getWeight();
			if(newWeight<= maxWeight)
			{
				
					items[itemsIndex] = item;
					itemsIndex++;
					if(!(item.isFragile()))
					{
						setLabel("Fragile - Handle with Care");
					}
				
			}
		}
		
	}
	
	//method to get total current weight of the bin
	public double getWeight() {
		
		double currentWeight = 0;
		if(items[0]!=null)
		{
			for(int i=0;i<itemsIndex;i++)
			{
				currentWeight = currentWeight + items[i].getWeight();
			}
		}
		return currentWeight;
	}
	

	//method to calculate the total price of the bin
	public USMoney calculatePrice() {
		int dollar = 0;
		int cents = 0;
		
		for(int i=0;i<itemsIndex;i++)
		{
			dollar = dollar + items[i].getPrice().getDollars();
			cents = cents + items[i].getPrice().getCents();
		}
		return (new USMoney(dollar,cents));
	}

	
	public String showDetails() {
		
		return ("SmartBinNumber:" + binNumber + "  Weight:" +String.valueOf(getWeight()) + "  Price:" + calculatePrice().toString() );
	}
	
}
