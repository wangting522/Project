
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.

public class SalariedProgrammer extends Programmer  {
private double weeklySalary;

//constructor
public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, 
  double weeklySalary) {
super(firstName, lastName, socialSecurityNumber); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//set salary
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//return salary
public double getWeeklySalary() {
return weeklySalary;
} 

//calculate earnings; override abstract method earnings in Programmer
@Override                                                           
public double earnings() {                                          
return getWeeklySalary();                                        
}                                             

public double getPaymentAmount() {
    return earnings();
}
//return String representation of SalariedProgrammer object   
@Override        
public String toString() {
    return String.format("Salaried Programmer:%s\nweekly salary: $%.2f",
            super.toString(), getWeeklySalary());
}

}

