package vijayvargiya.assign1.salebin;

import vijayvargiya.assign1.money.USMoney;

public interface BinType {
	
	public void addItem(ItemType item);
	
	public USMoney calculatePrice();
	
	public double getWeight();
	
	public Integer getNoOfItems();
	
	public String showDetails();
	
}
