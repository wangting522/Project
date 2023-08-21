
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

// HourlyProgrammer.java
// HourlyProgrammer class extends Programmer.

public class HourlyProgrammer extends Programmer {
private double wage; // wage per hour
private double hours; // hours worked for week

//constructor
public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, 
		double wage, double hours) {
    super(firstName, lastName, socialSecurityNumber);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

//set wage
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

//return wage
public double getWage() {
return wage;
} 

//set hours worked
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

//return hours worked
public double getHours() {
return hours;
} 

//calculate earnings; override abstract method earnings in Programmer
@Override                                                           
public double earnings() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          

public double getPaymentAmount() {
    return earnings();
}
//return String representation of HourlyProgrammer object              
@Override                                                             
public String toString() {
    return String.format("Hourly Programmer:%s\nhourly wage: $%.2f; hours worked: %.2f",
            super.toString(), getWage(), getHours());
}
                     
}

