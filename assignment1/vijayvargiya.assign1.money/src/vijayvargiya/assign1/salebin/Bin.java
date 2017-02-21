package vijayvargiya.assign1.salebin;

import vijayvargiya.assign1.money.USMoney;

public class Bin implements BinType {

	protected String binNumber;
	ItemType[] items = new ItemType[10000000];
	protected static final double maxWeight = 200.00;
	protected static int counter = 0;
	protected static int itemsIndex = 0;
	
	
	//Custom Constructor
	public Bin()
	{
		binNumber = "bin" + String.valueOf(generateBinNumber());
	}
	
	protected int generateBinNumber()
	{
		counter ++;
		return(counter);
	}
	
	//addItem method that only adds items that are not fragile
	@Override
	public void addItem(ItemType item) {
		if(!(item.isFragile()))
		{
			if(items[0]==null)
			{
				
					items[0]=item;
					itemsIndex++;
				
			}	
			
			else
			{
				double newWeight = item.getWeight() + getWeight();
				if(newWeight<= maxWeight)
				{
					
						items[itemsIndex] = item;
						itemsIndex++;
					
				}
			}
		}

	}//add item ends
	
	
	@Override
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

	@Override
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

	@Override
	public Integer getNoOfItems() {
		
		return (itemsIndex);
	}

	@Override
	public String showDetails() {
		
		return ("BinNumber:" + binNumber + "  Weight:" +String.valueOf(getWeight()) + "  Price:" + calculatePrice().toString() );
	}

}
