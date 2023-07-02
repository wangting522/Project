import java.util.Scanner;
public class MyHealthDataTest {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Patient patient= new Patient();
		
        System.out.print("Enter patient's first name: ");
        String firstName = keyboard.nextLine();
        patient.setFirstName(firstName);
        
        System.out.print("Enter patient's last name: ");
        String lastName = keyboard.nextLine();
        patient.setLastName(lastName);
        
        System.out.print("Enter patient's gender: ");
        String gender = keyboard.nextLine();
        patient.setGender(gender);
        
        System.out.print("Enter patient's year of birth: ");
        int birthYear = keyboard.nextInt();
		keyboard.nextLine();
        patient.setBirthYear(birthYear);
        
        System.out.print("Enter patient's month of birth: ");
        int birthMonth = keyboard.nextInt();
		keyboard.nextLine();
        patient.setBirthMonth(birthMonth);
        
        System.out.print("Enter patient's day of birth: ");
        int birthDay = keyboard.nextInt();
		keyboard.nextLine();
        patient.setBirthDay(birthDay);
        
        System.out.print("Enter patient's height (inches): ");
        double height = keyboard.nextDouble();
		keyboard.nextLine();
        patient.setHeight(height);
        
        System.out.print("Enter patient's weight (pounds): ");
        double weight = keyboard.nextDouble();
		keyboard.nextLine();
        patient.setWeight(weight);
        
        keyboard.close();
        System.out.println("Patient Health Data:");
        patient.displayMyHealthData();

	}
}
