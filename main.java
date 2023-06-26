import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
	//Body-mass index calculation with conditions
	// BMI : Mass / Height(m) * Height(m)
	 
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Please enter your weight (Example: 54)");
	int weight = scanner.nextInt();
	
	System.out.println("Please enter your height (Example: 1.64)");
	double height = scanner.nextDouble();
	
	double bmi = weight / (height * height);
	
	if(bmi < 18.5) {
		System.out.println("Thin");
	}
	
	else if(25 > bmi && bmi >= 18.5) {
		System.out.println("Normal");
	}
	
	else if(30 > bmi && bmi>=25) {
		System.out.println("Overweight");
	}
	
	else {
		System.out.println("Obese");
	}
	
	
	
	}

}
