import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFunctions {
	
	 /**
     * Returns the current date and time as a LocalDateTime object.
     *
     * @return LocalDateTime representing the current date and time
     */
	
	public static LocalDateTime getCurrentDateTime() {
		
		return LocalDateTime.now();
		
	}//end of getCurrentDateTime
	
	
	 public static String convertDateToISO8061(LocalDateTime dateTime) {
	        
		 ZonedDateTime utcDateTime = dateTime.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneOffset.UTC);
	        
	        return utcDateTime.format(DateTimeFormatter.ISO_INSTANT);
	   
	 }//end of convertDateToISO8061

}//end of DateTimeFunctions
