package assign2_anmolVijayvargiya;

public class VeganDietPlan implements DietPlan {

	Meal lunch;
	Meal dinner;
	String filename;//naming convention different due to way mentioned in doc file
	String dayOfWeek;
	MealCategory veganMeal;
	String newLine = System.getProperty("line.separator");//to create new line within systemoutprintln
	
	
	
	
	public VeganDietPlan(String filename, int dayOfWeek){
		this.filename = filename;
		switch(dayOfWeek){
		
		case 1: this.dayOfWeek = "Sunday" ; break;
		case 2: this.dayOfWeek = "Monday"; break;
		case 3: this.dayOfWeek = "Teusday"; break;
		case 4: this.dayOfWeek = "Wednesday"; break;
		case 5: this.dayOfWeek = "Thursday"; break;
		case 6: this.dayOfWeek = "Friday"; break;
		case 7: this.dayOfWeek = "Saturday"; break;
		default: System.out.println("Invalid Input for the day of week. Day of week must be between 1-7.");
		}//switch statement ends here
		
		veganMeal = new VeganMeal();
		veganMeal.loadRecipes(filename);
		
		lunch = new Lunch(veganMeal);
		dinner = new Dinner(veganMeal);
		
		}//constructor ends here
	
	@Override
	public String showPlan() {
		
		return("The meals for the " + dayOfWeek + " are as follows:-  " + newLine + "Lunch - " + lunch.getDetails() + newLine + "  Dinner - " + dinner.getDetails());
	
	}
	
	
	@Override
	public double getCost() {
		
		return(lunch.getCost() + dinner.getCost());
	}

}
