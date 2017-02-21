package assign2_anmolVijayvargiya;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DietPlanOrder {

	String customerName;
	DietPlan plan;
	boolean paymentStatus;
	String newLine = System.getProperty("line.separator");//to create new line within system out println
	
	public DietPlanOrder(String customerName, String filename, MealType mealType){
		this.customerName = customerName;
		switch(mealType){
		
		case VEGAN:		plan = new VeganDietPlan(filename,1)	;break;
		case LOW_CARB:	plan = new LowCarbDietPlan(filename,3)	;break;
		case HIGH_CARB:	plan = new HighCarbDietPlan(filename,6)	;break;
		}//switch case ends here
		
		
	}//dietplanorder constructor ends here
	
	public double getCost(){// need to define getCostOfPlan to complete this block
		return(plan.getCost());
	}
	
	public void acceptPayment(String cardName, String cardNumber, double amount){
		
		if(cardNumber.length()==1){//checks if there are any spaces in cardNumber
			
			if (cardNumber.matches("[0-9]+") && (cardNumber.length()==16 || cardNumber.length()==13) ) {//checks if there are only numeric digits in cardnumber and there count is either 13 or 16
			
				if(cardNumber.charAt(0) == 4){//checks if card unmber stars with 4 which verifies its a Visa Card
					paymentStatus = true;
				}
				else if(cardNumber.charAt(0) == 5){//checks if card number starts with 5
					
					if(cardNumber.charAt(1) >= 1 && cardNumber.charAt(1)<=5){//checks if cardnumber satisfies final check for master card
						paymentStatus = true;
					}
					else{
						paymentStatus = false;
					}
				}
				else{
					paymentStatus = false;
				}
				}
			else{
				paymentStatus = false;
			}
			}
		else{
			paymentStatus = false;
		}
		 
	}//Accept payment method ends here
	
	void generateInvoice(){
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("Customer Name: "+ customerName + newLine + "Date: " + dateFormat.format(date) + newLine + "Details of Diet Plan: " + plan.showPlan() );
	}
	
}
