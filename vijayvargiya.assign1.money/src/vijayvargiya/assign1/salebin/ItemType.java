package vijayvargiya.assign1.salebin;

import vijayvargiya.assign1.money.USMoney;

public interface ItemType {
	
	public Boolean isFragile();
	
	public USMoney getPrice();
	
	public double getWeight();
	
	public String getDetails();
	
	
}
