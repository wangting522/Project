
// LAB 6: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!

public abstract class Programmer implements Payme {

private String firstName;
private String lastName;
private String socialSecurityNumber;

//three-argument constructor
public Programmer(String firstName, String lastName, String socialSecurityNumber) {
 this.firstName = firstName;
 this.lastName = lastName;
 this.socialSecurityNumber = socialSecurityNumber;
}

/** CHANGES ARE REQUIRED IN THIS SECTION. 
* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.  GETTERS & SETTERS
* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
*/
public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}

//return String representation of Programmer object
@Override
public String toString() {
  return String.format("%s %s\n%s: %s", 
  getFirstName(), getLastName(), "Social Security Number",getSocialSecurityNumber());
} 

public abstract double earnings(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
}

//Note: We do NOT implement interface Payme method getPaymentAmount() here. 
// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS ABSTRACT!

/*Concrete subclasses of Programmer must provide implementations for the earnings() 
 *(due to abstraction) and the getPaymentAmount() method (due to implementing interface).
 *The abstract class does not need to implement the interface method here,leave the implementation to its subclasses..
 */
