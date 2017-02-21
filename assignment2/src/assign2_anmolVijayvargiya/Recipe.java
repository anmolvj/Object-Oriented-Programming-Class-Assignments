package assign2_anmolVijayvargiya;

public class Recipe {
	
	String name;
	String description;
	double cost;
	int calories;
	
	//custom constructor
	public Recipe (String name, String description, double cost, int calories)
	{
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.calories = calories;
	}

	//default constructor
	public Recipe ()
	{
		name = null;
		description = null;
		cost = 0.0;
		calories = 0;
	}
	
	public String getName(){
		return name;
	};
	
	public String getDescription(){
		return description;
	};
	
	public double getCost(){
		return cost;
	};
	
	public int getCalories(){
		return calories;
	};
	
	
}//class Recipe ends here
