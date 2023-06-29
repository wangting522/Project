/*
 * Student Name: Ting Wang
 * Lab Professor: Wafa Hasanain
 * Due Date: November 25
 * Description: Assignment 02 (22F) Starter Code
 */
/*
 * This class is to output a report of the final result
 */
public class Assignment02 {

	public static void main(String[] args) {
		CircularSawBlade blade = new CircularSawBlade();
		
		String report;
		String continueOption;
		int numBlades=0;
	    int numDiameterOutOfTolerance=0;
	    int numKerfOutOfTolerance=0;
		
	do {
		// set the diameter and kerf into an instance of CircularSawBlade
		double diameter=User.inputPositiveDouble("Enter measured diameter:");
		blade.setDiameter(diameter);
		double kerf=User.inputPositiveDouble("Enter measured kerf:");
		blade.setKerf(kerf);
		
		// use the toString method of class CircularSawBlade to output the information for the blade.
		report=blade.toString();				
		System.out.println(report);
		
		// Use the CircularSawBladeVerifier methods to obtain a true/false regarding if the
		// blade is within specifications for diameter and kerf.
		// by passing the CircularSawBlade reference-value as an argument into each.
		// output a message for diameter and kerf to tell the user if they are within tolerance
		numBlades++;
		if (CircularSawBladeVerifier.isDiameterInTolerance(blade)) {
		    System.out.println("Diameter in tolerance.");	
		}else {
			System.out.println("Diameter out of tolerance.");
			numDiameterOutOfTolerance++;
		}
		if (CircularSawBladeVerifier.isKerfInTolerance(blade)) {
			System.out.println("Kerf in tolerance.");
		}else {
			System.out.println("Kerf out of tolerance.");
			numKerfOutOfTolerance++;
		}
		// collect a count of, and display to the user:
		// the number of blades entered
		// the number of diameters out of tolerance
		// the number of kerfs out of tolerance
		System.out.printf("Blades Entered:%d%n",numBlades);
		System.out.printf("Diameter(s) out of tolerance:%d%n",numDiameterOutOfTolerance);
		System.out.printf("Kerf(s) out of tolerance:%d%n",numKerfOutOfTolerance);
		System.out.println("Program by Ting Wang");
		
	    continueOption = User.inputString("Continue Program (yes / no)?");
	   }
	    while(continueOption.equalsIgnoreCase("yes"));
	
		System.out.println("Program has shut down");
		
	}
}		

//public static void main(String[] args) {
//	CircularSawBlade blade = new CircularSawBlade();
//	String continueLoop = "no";
//	String report;
//	double userInput = 0.0;
//	boolean isInTolerance = false;
//	int bladeCount = 0; // total number of blade entries
//	int diameterCount = 0; // count of diameters out of tolerance
//	int kerfCount = 0; // count of kerfs out of tolerance
//
//	do {
//		report = ""; // reset for each loop
//		
//		userInput = User.inputPositiveDouble("Enter measured diameter: ");
//		blade.setDiameter(userInput);
//
//		userInput = User.inputPositiveDouble("Enter measured kerf: ");
//		blade.setKerf(userInput);
//
//		report += String.format("%s%n", blade.toString());
//
//		bladeCount++;
//		
//		isInTolerance = CircularSawBladeVerifier.isDiameterInTolerance(blade);
//		if(isInTolerance) {
//			report += String.format("%s%n", "Diameter in tolerance.");
//		}
//		else {
//			report += String.format("%s%n", "Diameter out of tolerance.");
//			diameterCount++;
//		}
//		
//		isInTolerance = CircularSawBladeVerifier.isKerfInTolerance(blade);
//		if(isInTolerance) {
//			report += String.format("%s%n", "Kerf in tolerance.");
//		}
//		else {
//			report += String.format("%s%n", "Kerf out of tolerance.");
//			kerfCount++;
//		}
//		
//		report += String.format("Blades Entered: %d%n", bladeCount);
//		report += String.format("Diameter(s) out of tolerance: %d%n", diameterCount);
//		report += String.format("Kerf(s) out of tolerance: %d%n", kerfCount);
//		report += String.format("%s%n", "Program by Stanley Pieda");
//		System.out.print(report);
//		
//		continueLoop = User.inputString("Continue (yes/no)? ");
//		
//	}while(continueLoop.equalsIgnoreCase("yes"));
//	
//	System.out.println("Program has shut down.");
//}


