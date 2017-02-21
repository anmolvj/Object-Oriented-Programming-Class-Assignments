package assign2_anmolVijayvargiya;

public class Lunch implements Meal {

	Recipe recipe;
	MealCategory mealCategory;
	String newLine = System.getProperty("line.separator");//to create new line within systemoutprintln
	
	public Lunch(MealCategory mealCategory){
		
		this.mealCategory = mealCategory;
		recipe  = mealCategory.getARecipe();
	}
	
	
	@Override
	public Recipe getARecipe() {
		
		return recipe;
	}


	@Override
	public double getCost() {
		
		return recipe.getCost();
	}

	@Override
	public String getDetails() {
		
		String name = recipe.getName();
		String description = recipe.getDescription();
		int calories = recipe.getCalories();
		double cost = recipe.getCost();
		String returnString = "Recipe Name: " + name + newLine + "Description: " + description + newLine + "Calories: " + calories + newLine + "Cost: " + cost + newLine;
		
		return(returnString);
	}

	@Override
	public int getCalories() {
		
		return recipe.getCalories();
	}

}
