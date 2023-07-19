package s23assignment2;

/**
 * Tests the Clock class.
 */
public class ClockDemo
{
   public static void main(String[] args)
   {

      System.out.println("Testing Clock class");
      Clock clock = new Clock();
      System.out.println("Hours: " + clock.getHours());
      System.out.println("Minutes: " + clock.getMinutes());
      System.out.println("Time: " + clock.getTime());
   }
}

