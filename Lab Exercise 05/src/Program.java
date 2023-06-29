/*
 * Student Name: Ting Wang
 * Lab Professor: Wafa Hasanain
 * Due Date: December 2
 * Description: The method main display menu options,get user option,
 * delegate processing from the menu to the methods of class DiceReporter.
 */
public class Program {

	
	public static void main(String[] args) {
		DiceChecker diceChecker = new DiceChecker();
		final int ENTER_VALUES = 1;
		final int DISPLAY_REPORT = 2;
		final int RESET_VALUES = 3;
		final int EXIT_PROGRAM = 4;
		int option = 0;

		
		do {

			System.out.printf("%d Enter Dice Roll Values%n", ENTER_VALUES);
			System.out.printf("%d Display Report%n", DISPLAY_REPORT);
			System.out.printf("%d Reset Dice Roll Data%n", RESET_VALUES);
			System.out.printf("%d Exit Program%n", EXIT_PROGRAM);
			option=User.inputInteger("Select option: ");

			switch(option) {
			case ENTER_VALUES:
				diceChecker.enterData();
				break;
			case DISPLAY_REPORT:
				diceChecker.printReport();
				break;
			case RESET_VALUES:
				diceChecker.resetData();
				break;
			case EXIT_PROGRAM:
				System.out.println("Program by Ting Wang.");
				System.out.println("Program exits");
				break;
			}
		} while (option != EXIT_PROGRAM);
	}
}
