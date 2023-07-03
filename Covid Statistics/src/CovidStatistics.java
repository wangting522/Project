/*
 * File name:CovidStatistics.java
 * Author: Ting Wang 41077727
 * Course: CST8284-301
 * Assignment: 2
 * Date: 5/17/2023
 * Professor: HESHAM SAADAWI
 * Purpose: Shows the number of people who have recovered from COVID-19: 
 * Across 7 provinces in Canada Over a period of 8 months.
 */

/**
* @author Ting Wang
* @version 3
* @see CovidStatistics
* @since jdk 17
*/

public class CovidStatistics
{
/**
* main method that conduct 2D array
* @param args command-line arguments
*/	
public static void main(String[] args)
 {
/**
 * constant value of ROWS AND COLUMNS won't change.
 */
   final int ROWS = 7;
   final int COLUMNS = 8;

   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
	     {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
         
      };

   String[] provinces = 
      { 
         "Ontario", 
         "Quebec", 
         "Nova Scotia",
         "New Brunswick", 
         "Manitoba", 
         "British Columbia",
	     "Prince Edward Island"         
      };
   
   System.out.println("             Month      Feb     March   April   May     June    July    Aug     Sept");
   System.out.println();
   
   /** 
   * It is important to know the number of patients per province. 
   * So we need to print out the number of patients for all provinces (content of the array) 
   * for each month. Update the code in this section by using a nested for loop. 
   */

    for(int row = 0; row < ROWS; row++) {
    	System.out.printf("%22s",provinces[row]);
    	for(int col = 0; col < COLUMNS; col++) {
    		System.out.print("    "+patients[row][col]);
    	}
    	System.out.println(); 
    }
    /**
     * use the difference between stop time and start time to get run time
     */

   /** 
   * Update the code in this section by writing a nested for loop (for the columns and rows of the array) 
   * to compute the sum (column). 
   * Print the column sum using printf. Check the sample output file (CovidSample.txt) to see the expected pattern.
   */ 
   System.out.println();
   System.out.print("    Recovered Patients");
   /**
    * nested for loop to print the sum of recovered patients.
    * @param sum sum
    */
   int [] average = new int[COLUMNS];
   
   long startTime = System.currentTimeMillis();

   for(int col = 0; col < COLUMNS; col++) { 
	   int sum=0;//reset to 0 every time finish calculating all rows before enter another column
	   for(int row = 0; row < ROWS; row++) {
   		sum=sum+ patients[row][col];	
   	}
	   System.out.printf("%8d",sum);
	   int avg=sum/ROWS;
	   average[col]=avg;
   }
   
    System.out.println();
    System.out.print("     Average Patients");
   /**
    * nested for loop to print the average of recovered patients.
    * @param avg average
    * @param sum sum
    */
   for(int col = 0; col < COLUMNS; col++) {
  	   System.out.printf("%8d",average[col]);
     }  
   long stopTime = System.currentTimeMillis();
   long runTime = stopTime - startTime;

     System.out.println(); 
     System.out.println("               Vaccinate and maintain good health practices!" );
     System.out.println("Run time : "+runTime);
     
  }

  }

