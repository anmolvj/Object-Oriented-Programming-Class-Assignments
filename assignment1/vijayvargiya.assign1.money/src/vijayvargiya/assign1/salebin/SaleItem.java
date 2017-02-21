package vijayvargiya.assign1.salebin;

import vijayvargiya.assign1.money.USMoney;

public class SaleItem implements ItemType {
	
	protected String itemName;
	protected USMoney price;
	protected double weight;
	protected boolean fragile;
	
	//Custom Constructor
	public SaleItem(String itemName,USMoney price, double weight, boolean fragile )
	{
		this.itemName = itemName;
		this.price = price;
		this.weight = weight;
		this.fragile = fragile;
	}
	
	
	

	@Override
	public Boolean isFragile() {
		
		return fragile;
	}

	@Override
	public USMoney getPrice() {
		
		return price;
	}

	@Override
	public double getWeight() {
		
		return weight;
	}

	//Returns concatenated string of item-name and price. 
	@Override
	public String getDetails() {
		
		return(itemName + "," + price.toString());
	}
	
	
}//Class Sale Item Ends
