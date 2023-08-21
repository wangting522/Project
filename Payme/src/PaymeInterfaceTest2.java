public class PaymeInterfaceTest2  {

public static void main(String[] args) {
	
	Payme[] paymeObjects = new Payme[6];

    paymeObjects[0] = new Invoice("22776", "brakes", 3, 300.00);
    paymeObjects[1] = new Invoice("33442", "gear", 5, 90.99);
    paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 320);
    paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 18.95, 40);
    paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 16500, 0.44);
    paymeObjects[5] = new BasePlusCommissionProgrammer("Ting", "Wang", "102-34-5888", 1200, 0.04, 720);	

 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 
 
 for (Payme currentPayme : paymeObjects) {
    // make current object print itself by calling default method 
     currentPayme.display(); 
   
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
    	BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf(
          "new base salary with 10%% increase is: $%,.2f\n",programmer.getBaseSalary());
    } 
    System.out.printf("payment due: $%,.2f\n", currentPayme.getPaymentAmount());
    System.out.println();
 }
}
}
