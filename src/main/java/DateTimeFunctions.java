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
	
	
	/**
     * Converts a given date and time to an ISO 8061 UTC time string.
     *
     * @param dateTime The date and time to be converted
     * @return A string in ISO 8061 UTC format (e.g., 2024-12-03T14:10:31Z)
     */
	
	
	 public static String convertDateToISO8061(LocalDateTime dateTime) {
	        
		 ZonedDateTime utcDateTime = dateTime.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneOffset.UTC);
	        
	        return utcDateTime.format(DateTimeFormatter.ISO_INSTANT);
	   
	 }//end of convertDateToISO8061
	 
	 
	 /**
	     * Returns the number of days between two LocalDate objects.
	     *
	     * @param start The start date
	     * @param end   The end date
	     * @return The number of days between start and end
	     */
	 
	 
	 public static long daysBetweenDates(LocalDate start, LocalDate end) {
	        
		 return Duration.between(start.atStartOfDay(), end.atStartOfDay()).toDays();
	    
	 }//end of datsBetweenDates method

}//end of DateTimeFunctions
