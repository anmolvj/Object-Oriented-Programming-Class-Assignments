package assign2_anmolVijayvargiya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VeganMeal implements MealCategory {

	ArrayList<Recipe> recipeList = new ArrayList<Recipe>();
	
	@Override
	public ArrayList<Recipe> showRecipes() {
		
		return recipeList;
		
	}//show recipes method completed here

	
	@Override
	public Recipe getARecipe() {
		
		Random randomIndex = new Random();
		Recipe randomRecipe = recipeList.get(randomIndex.nextInt(recipeList.size()));
		return randomRecipe;
		
	}//getarecipe is completed here

	
	@Override
	public void loadRecipes(String fileName) {
		
		//file input block
		File file = new File(fileName);
		Scanner scannedFile = null;
		if(file.exists())
		{
			try {
				scannedFile = new Scanner(file);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("The file with the name " + fileName + " does not exist");
		}
		
		
		//file reading block
		while(scannedFile.hasNext()){
			String[] fileItems;
			String tempLine = scannedFile.nextLine();
			fileItems = tempLine.split("[:]");
			String name = fileItems[0];
			String description = fileItems[1];
			double cost = Double.parseDouble(fileItems[2]);
			int calories = Integer.parseInt(fileItems[3]);
			
			recipeList.add(new Recipe(name,description,cost,calories));
		}
		
		scannedFile.close();
	}//loadRecipies method definition ends here
	
	
	
	

}//class Vegan meal ends here
