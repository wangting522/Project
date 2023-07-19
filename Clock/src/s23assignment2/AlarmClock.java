package s23assignment2;

public class AlarmClock extends Clock {
    private int alarmHours;
    private int alarmMinutes;
    private boolean alarmSet;
/*
 * When setAlarm is called, the AlarmClock stores the alarm (hours, minutes).
 * keeps track of whether the alarm is set or not.
 */
    public void setAlarm(int hours, int minutes) {
       alarmHours = hours;
       alarmMinutes = minutes;
       alarmSet = true;
    }
/*
 * This method compares the current time (retrieved using getHours and getMinutes) 
 * with the set alarm time to determine if the alarm time has been reached or exceeded.
 * If the current hours are greater than the alarm hours. 
 * it indicates that the alarm time has been reached. 
 * If the current hours are equal to the alarm hours, it checks if the current minutes are greater than or equal to the alarm minutes. 
 * This handles the case where the current time matches the alarm time exactly.
 */
    private boolean isAlarmTimeReached() {
        String hours = super.getHours();
        String minutes = super.getMinutes();
        int currentHours;
        int currentMinutes;
        currentHours = Integer.parseInt(hours);
        currentMinutes = Integer.parseInt(minutes);
        
        return currentHours > alarmHours || (currentHours == alarmHours && currentMinutes >= alarmMinutes);
    }
/*
 * This method resets the alarmSet flag to false, indicating that the alarm has been cleared.
 */
    private void clearAlarm() {
        alarmHours = 0;
        alarmMinutes = 0;
    	alarmSet = false;
    }
/*
 * This method is overridden to check if the alarm time has been reached or exceeded. 
 * If the alarm is set and the current time has passed or matches the alarm time, it returns the current time followed by the string "Alarm" and clears the alarm. 
 * If the alarm is not set or the alarm time has not been reached, it returns the current time as usual.
 */
    @Override
    public String getTime() {
        String currentTime = super.getTime();
        if (alarmSet && isAlarmTimeReached()) {
            clearAlarm();
            return currentTime + " Alarm";
        }
        return currentTime;
    }

}
