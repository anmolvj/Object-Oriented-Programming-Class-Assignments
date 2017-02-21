package assign2_anmolVijayvargiya;

import java.util.ArrayList;

public interface MealCategory {

	ArrayList<Recipe> showRecipes();
	Recipe getARecipe();
	void loadRecipes(String fileName);//***void return type added of my own will
	
	
}//interface meal category ends here
