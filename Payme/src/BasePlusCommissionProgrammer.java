
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!


//BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.

public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

private double baseSalary; // base salary per week

//constructor
public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, 
double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

//set base salary
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

//return base salary
public double getBaseSalary() {
return baseSalary;
}

//calculate earnings; override method earnings in CommissionProgrammer
@Override                                                            
public double earnings() {                                             
return getBaseSalary() + super.earnings();                        
} 

public double getPaymentAmount() {
    return earnings();
}
//return String representation of BasePlusCommissionProgrammer object
@Override     
public String toString() {
    return String.format("Base-Plus Commission Programmer:%s %s\n%s: %s\n%s: %.2f %s: %.2f %s: %.2f",
                getFirstName(), getLastName(),
                "Social Security Number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),"commission rate", getCommissionRate(),"base salary", getBaseSalary());
}  

}



