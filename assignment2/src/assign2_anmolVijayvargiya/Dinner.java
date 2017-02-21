package assign2_anmolVijayvargiya;

public class Dinner implements Meal {

	
	Recipe recipe;
	MealCategory mealCategory;
	Boolean delivery;
	double deliveryFee;
	String newLine = System.getProperty("line.separator");//to create new line within systemoutprintln
	
	public Dinner(MealCategory mealCategory){
		
		
		this.mealCategory = mealCategory;
		recipe  = mealCategory.getARecipe();
		
	}
	
	
	@Override
	public int getCalories() {
		
		return recipe.getCalories();
	}
	
	@Override
	public double getCost() {
		
		return recipe.getCost()+deliveryFee;
	}
	
	public void setDeliveryFee(double fee){
		deliveryFee = fee;
		
	};
	
	@Override
	public String getDetails() {
		
		String name = recipe.getName();
		String description = recipe.getDescription();
		int calories = recipe.getCalories();
		double cost = recipe.getCost();
		
		String returnString = "Recipe Name: " + name + newLine + "Description: " + description + newLine + "Calories: " + calories + newLine + "Cost: " + cost + newLine + "Delivery Fee: " + deliveryFee + newLine;
		
		return(returnString);
	}

	@Override
	public Recipe getARecipe() {
		
		return recipe;
	}
	
	
	
}
