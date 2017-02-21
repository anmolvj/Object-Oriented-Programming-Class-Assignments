package assign2_anmolVijayvargiya;

public class MyTestCase {

	public static void main(String[] args) {
		
		DietPlanOrder myOrder1 = new DietPlanOrder("Anmol Vijayvargiya","high_carb_recipes.txt",MealType.HIGH_CARB);
		myOrder1.acceptPayment("Anmol Vijayvargiya", "4234567891234", myOrder1.getCost());
		myOrder1.generateInvoice();
		
		
		DietPlanOrder myOrder2 = new DietPlanOrder("Matt Peterson","low_carb_recipes.txt",MealType.VEGAN);
		myOrder1.acceptPayment("Matt Peterson", "5234567891012131", myOrder2.getCost());
		myOrder1.generateInvoice();
		
		
		DietPlanOrder myOrder3 = new DietPlanOrder("Jonathan Langdon","high_carb_recipes.txt",MealType.LOW_CARB);
		myOrder1.acceptPayment("Jonathan Langdon", "5554123456789043", myOrder3.getCost());
		myOrder1.generateInvoice();
		
		}

}
