package vijayvargiya.assign1.q2;

import vijayvargiya.assign1.money.USMoney;
import vijayvargiya.assign1.salebin.Bin;
import vijayvargiya.assign1.salebin.SaleItem;
import vijayvargiya.assign1.salebin.SmartBin;

public class Q2TestCase {

	public static void main(String[] args) {
		
		
		SaleItem si1 = new SaleItem("SaleItem1", new USMoney(10,90), 32, true);
		SaleItem si2 = new SaleItem("SaleItem2", new USMoney(11,23), 54, false);
		SaleItem si3 = new SaleItem("SaleItem3", new USMoney(13,57), 78, true);
		SaleItem si4 = new SaleItem("SaleItem4", new USMoney(14,97), 14, false);
		SaleItem si5 = new SaleItem("SaleItem5", new USMoney(32,98), 76, true);
		
		
		Bin myBin = new Bin();
		
		myBin.addItem(si1);
		myBin.addItem(si2);
		myBin.addItem(si3);
		myBin.addItem(si4);
		myBin.addItem(si5);
		
		System.out.println(myBin.showDetails());
		
		SaleItem si6 = new SaleItem("SaleItem6", new USMoney(10,38), 47, true);
		SaleItem si7 = new SaleItem("SaleItem7", new USMoney(132,76), 11, false);
		SaleItem si8 = new SaleItem("SaleItem8", new USMoney(100,100), 105, true);
		SaleItem si9 = new SaleItem("SaleItem9", new USMoney(45,250), 92, false);
		SaleItem si10 = new SaleItem("SaleItem10", new USMoney(76,781), 81, true);
		
		SmartBin mySmartBin = new SmartBin();
		
		mySmartBin.addItem(si6);
		mySmartBin.addItem(si7);
		mySmartBin.addItem(si8);
		mySmartBin.addItem(si9);
		mySmartBin.addItem(si10);
		
		System.out.println(mySmartBin.showDetails());
		
		Bin bin3 = new SmartBin();
		try{
			bin3.addItem(si6);
			System.out.println(bin3.showDetails());
		}catch(Exception e){
			System.out.println("You cannot add fragile SaleItems to bin3");
		}
		
		
		
		
		}

}
