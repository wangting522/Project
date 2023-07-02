/*
 * File name: Patient.java
 * Author: Ting Wang 41077727
 * Course: CST8284-301
 * Assignment: 1
 * Date: 6/5/2023
 * Professor: HESHAM SAADAWI
 * Purpose: Represents a patient's electronic record with important health information .
 */
/**
 * @author Ting Wang
 * @version 2
 * @see Driver
 * @since jdk 17
 */
import java.util.Calendar;
public class Patient{
/**
 * Variables are private to protect the state of your objects,
 * it's safe from unexpected changes and our class can manage its own state.
 * Encapsulating the instance variable. 
*/
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private double height;
    private double weight;
/**
 * no-argument constructor set default value
 */
public Patient() {
	this("unknown","unknown","unknown",0,0,0,0.0,0.0);
}
/**
 * overloaded constructor accepting values for fields
 * @param firstName  first name of the patient
 * @param lastName   first name of the patient
 * @param gender     gender of the patient
 * @param birthYear  birth year of the patient
 * @param birthMonth birth month of the patient
 * @param birthDay   birth date of the patient
 * @param height     height of the patient
 * @param weight     weight of the patient
 */
public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay,double height, double weight) {
	this.firstName = firstName;
	this.lastName = lastName;
	this. gender = gender;
	this.birthYear = birthYear;
	this.birthMonth = birthMonth;
	this.birthDay = birthDay;
	this.height = height;
	this.weight = weight;
}
/**
 * get method for firstName
 * @return an String specifying First Name.
 */
public String getFirstName() {
	return firstName;
}
/**
 * set method for firstName
 * @param firstName patient's First Name.
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * get method for lastName
 * @return an String specifying Last Name.
 */
public String getLastName() {
	return lastName;
}
/**
 * set method for lastName
 * @param firstName patient's Last Name.
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * get method for gender
 * @return an String specifying Gender.
 */
public String getGender() {
	return gender;
}
/**
 * set method for gender
 * @param gender patient's Gender.
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * get method for birthYear
 * @return an int specifying Birth Year.
 */
public int getBirthYear() {
	return birthYear;
}
/**
 * set method for birthYear
 * @param birthYear patient's Birth Year.
 */
public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}
/**
 * get method for birthMonth
 * @return an int specifying Birth Month.
 */
public int getBirthMonth() {
	return birthMonth;
}
/**
 * set method for birthMonth
 * @param birthMonth patient's Birth Month.
 */
public void setBirthMonth(int birthMonth) {
	this.birthMonth = birthMonth;
}
/**
 * get method for birthDay
 * @return an int specifying Birth Day.
 */
public int getBirthDay() {
	return birthDay;
}
/**
 * set method for birthDay
 * @param birthDay patient's Birth Day.
 */
public void setBirthDay(int birthDay) {
	this.birthDay = birthDay;
}
/**
 * get method for height
 * @return an double specifying Height.
 */
public double getHeight() {
	return height;
}
/**
 * set method for height
 * @param height patient's height.
 */
public void setHeight(double height) {
	this.height = height;
}
/**
 * get method for weight
 * @return an double specifying Weight.
 */
public double getWeight() {
	return weight;
}
/**
 * set method for weight
 * @param weight patient's weight.
 */
public void setWeight(double weight) {
	this.weight = weight;
} 
/**
 * method to calculate THE PATIENT'S age
 * @returns int 
 */
public int calculateAge() {
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    return (currentYear - birthYear);
}
/**
 * method to calculate THE PATIENT'S maximum hear rate
 * @returns int 
 */
public int calculateMaximumHeartRate() {
    return (220 - calculateAge());
}
/**
 * method to calculate THE PATIENT'S target heart rate range
 * @returns int 
 */
public int calculateMinimumTargetHeartRate() {
    int maximumHeartRate = calculateMaximumHeartRate();
    return (int)(0.5 * maximumHeartRate);
}

public int calculateMaximumTargetHeartRate() {
    int maximumHeartRate = calculateMaximumHeartRate();
    return (int)(0.85 * maximumHeartRate);
}
/**
 * method to calculate THE PATIENT'S Body Mass Index (BMI)
 * @returns double 
 */
public double getBMI() {
   return (getWeight() * 703) / (getHeight() * getHeight()) ;
}
public double getBMIError() {
	   return getWeight() * 703 / getHeight() / getHeight() ;
	}
/**
 * method to DISPLAY ALL THE PATIENT'S HEALTH DATA.
 */
public void displayMyHealthData() { 

    System.out.printf("First Name: %s%n", firstName);
    System.out.printf("Last Name: %s%n", lastName);
    System.out.printf("Gender: %s%n", gender);
    System.out.printf("Age: %d%n", calculateAge() );
    System.out.printf("Maximum Heart Rate: %d%n", calculateMaximumHeartRate());
    System.out.printf("Target Heart Rate Range: %d - %d%n", calculateMinimumTargetHeartRate(), calculateMaximumTargetHeartRate());
    System.out.printf("Body Mass Index (BMI): %.2f%n", getBMI());

   System.out.println("BMI VALUES");
   System.out.println("Underweight: less than 18.5");
   System.out.println("Normal:      between 18.5 and 24.9");
   System.out.println("Overweight:  between 25 and 29.9");
   System.out.println("Obese:       30 or greater");   
} 

} // end class Patient



