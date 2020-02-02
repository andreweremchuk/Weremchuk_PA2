import java.util.Scanner;

public class BMICalculator {
	
	//declare variables which wll be used throughout all methods
	int unitType;
	float weight;
	float height;
	float BMI;
	float bmiCategory;

	//given main
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();

	}

	//display function will display the user's bmi
	public void displayBmi() 
	{
		//use instance variable to depict which to display
		if (this.unitType == 1)
		{
			System.out.println("BMI:" + this.BMI);
		}
		
		if (this.unitType == 2)
		{
			System.out.println("BMI:" + this.BMI);
		}
		
	}

	//calculateBmi function will calculate the user's bmi
	private void calculateBmi() 
	{
		//if statements to differenciate which bmi calculation to use
		// if 1, imperial
		if (this.unitType == 1)
		{
			//given formula
			float BMI;
			BMI = (703 * this.weight) / (this.height * this.height);
			getBmi(BMI);
		}
		
		//if 2, metric
		if (this.unitType == 2)
		{
			//given formula
			float BMI;
			BMI = this.weight / (this.height * this.height);
			getBmi(BMI);
		}
		
		//call calculate bmi category to prompt the user which category they're in, also stated in rubric
		calculateBmiCategory();
	}
	
	//takes the bmi and puts it in the specific category
	private void calculateBmiCategory() 
	{
		float BMI = getBmiCategory(this.BMI);
		
		if (BMI  < 18.5)
		{
			System.out.println("You are underweight.");
		}
		
		if (BMI > 18.5 && this.BMI < 24.9)
		{
			System.out.println("You are normal weight.");
		}
		
		if (BMI > 25 && this.BMI < 29.9)
		{
			System.out.println("You are overweight.");
		}
		
		if (BMI > 30)
		{
			System.out.println("You are obesity.");
		}	
		
	}

	// readUserData calls methods in rubric, readUnityType and readMeasureentData
	public void readUserData() 
	{
		readUnitType();
		readMeasurementData();

	}

	//prompts the user with which unit type to select
	private void readUnitType() 
	{
		System.out.println("Select imperial (1) or metric (2): ");
		//scans in the user input and stores it in unit type instance variable
		Scanner sc = new Scanner(System.in);
		this.unitType = sc.nextInt();
	}
	
	private void readMeasurementData() 
	{
		//uses unit type instance variable and calls the appropriate method depending on selection
		if (this.unitType == 1)
		{
			readImperialData();
		}
		
		if (this.unitType == 2)
		{
			readMetricData();
		} 
		
	}
	
	//prompt the user to input height and weight in appropriate units
	private void readMetricData() 
	{
		//store as local variables then call set function to store as instance variable
		//scan in user input as float for precise calculations
		float height;
		float weight;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter height(meters): ");	
		height = sc.nextFloat();
		getHeight(height);
		setHeight();
		
		System.out.printf("Enter weight(kilograms): ");
		weight = sc.nextFloat();
		getWeight(weight);
		setWeight();
	}
	
	//prompt the user to input height and weight in appropriate units
	private void readImperialData() 
	{
		//store as local variables then call set function to store as instance variable
		//scan in user input as float for precise calculations
		float height;
		float weight;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter height (inches): ");	
		height = sc.nextFloat();
		getHeight(height);
		setHeight();
		
		System.out.printf("Enter weight (pounds): ");
		weight = sc.nextFloat();
		getWeight(weight);
		setWeight();
	}
	
	//takes parameter of weight that user enters and sets equal to the instance variable to 
	//be used throughout all functions
	public float getWeight(float weight)
	{
		this.weight = weight;
		return this.weight;
	}
	
	//verifies the weight is valid
	private void setWeight()
	{
		if (this.weight <= 0)
		{
			System.out.println("Invalid weight.");
			System.exit(0);
		}
	}
	//takes parameter of height that user enters and sets equal to the instance variable to 
	//be used throughout all functions
	public float getHeight (float height)
	{
		this.height = height;
		return this.height;
	}
	
	//verifies the height is valid
	private void setHeight ()
	{
		if (this.height <= 0)
		{
			System.out.println("Invalid height.");
			System.exit(0);
		}
	}
	
	//acquires parameter from method call and sets equal to instance variable to be
	//used throughout other functions
	public float getBmi (float bmi)
	{
		this.BMI = bmi;
		return this.BMI;
	}
	
	//gets bmicategory number from method and stores as instance variable
	public float getBmiCategory (float bmiCategory)
	{
		this.bmiCategory = bmiCategory;
		return this.bmiCategory;
	}
}


