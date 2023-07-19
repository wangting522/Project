package s23assignment2;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
public class Clock {
	   public String getHours() {
	      String timeString = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toString();
	      //The resulting time string is in the format "yyyy-MM-ddTHH:mm:ss"
	      return timeString.substring(11, 13);
	      //retrieves the characters at index 11 and 12
	   }

	   public String getMinutes() {
	      String timeString = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toString();
	      return timeString.substring(14, 16);
	    //retrieves the characters at index 14 and 15
	   }

	   public String getTime() {
	      String hours = getHours();
	      String minutes = getMinutes();
	      return hours + ":" + minutes;
	   }
	}
