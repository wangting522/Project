/*
 * Student Name: Ting Wang
 * Lab Professor: Wafa Hasanain
 * Due Date: November 25
 * Description: Assignment 02 (22F) Starter Code
 */
/*
 * This class is to determine if the diameter and kerf is each 
 * within tolerance or not and report this to the user
 */
public class CircularSawBladeVerifier {
	public static final double EPSILON=0.015625;
	/*
	 * This is a utility class with only static members, prevent
	 * Instantiation.
	 */
	private CircularSawBladeVerifier() {}
	
	// check that the diameter does not differ more than EPSILON and expected diameter
	public static boolean isDiameterInTolerance(CircularSawBlade blade) {
		
		if(Math.abs(blade.getDiameter()-CircularSawBlade.EXPECTED_DIAMETER)<=EPSILON) {
			return true;
		}else
		return false; //placeholder so the code will compile, update with the actual true or false
	}
//	double difference;
//	boolean isInTolerance = false;
//	
//	difference = Math.abs(blade.getDiameter() - CircularSawBlade.EXPECTED_DIAMETER);
//	if(difference <= EPSILON) {
//		isInTolerance = true;
//	}
//	
//	return isInTolerance;

		
	//check that the diameter does not differ more than EPSILON and expected kerf
	public static boolean isKerfInTolerance(CircularSawBlade blade) {
	
		if(Math.abs(blade.getKerf()-CircularSawBlade.EXPECTED_KERF)<=EPSILON) {
			return true;
		}else
		return false; //placeholder so the code will compile, update with the actual true or false
	}
//	double difference;
//	boolean isInTolerance = false;
//	
//	difference = Math.abs(blade.getKerf() - CircularSawBlade.EXPECTED_KERF);
//	if(difference <= EPSILON) {
//		isInTolerance = true;
//	}
//	
//	return isInTolerance;

}
