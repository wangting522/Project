
/*
 *This class is used to adjust the world clock's time compared to the UTC time.
 */
package s23assignment2;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class WorldClock extends Clock {
   private int timeOffset; // Time offset in hours

   public WorldClock(int timeOffset) {
      this.timeOffset = timeOffset;
   }

   // Override getHours() to return the correct hour in the given time zone
   @Override
   public String getHours() {
	   LocalDateTime utcTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"));
	   LocalDateTime worldClockTime;
	   if (timeOffset >= 0) {
	       worldClockTime = utcTime.plusHours(timeOffset);
	   } else {
	       worldClockTime = utcTime.minusHours(Math.abs(timeOffset));
	   }

      // Handle cases where the hour exceeds 24 or is negative
      int adjustedHour = worldClockTime.getHour();
      if (adjustedHour >= 24) {
    	  adjustedHour = adjustedHour % 24;
      } else if (adjustedHour < 0) {
    	  adjustedHour = 24 - (Math.abs(adjustedHour) % 24);
      }
      return String.format("%02d", adjustedHour); 
   }
}




