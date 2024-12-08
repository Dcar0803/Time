import static org.junit.jupiter.api.Assertions.*;
import java.time.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
    void testGetCurrentDateTime() {
        
		LocalDateTime now = DateTimeFunctions.getCurrentDateTime();
       
        assertNotNull(now, "Current date and time should not be null");
   
	}//end of testGetCurrentDateTime method 
	
	
	 @Test
	    void testConvertDateToISO8061() {
	        
		 LocalDateTime date = LocalDateTime.of(2024, 12, 3, 14, 10, 31);
	        
		 String isoDate = DateTimeFunctions.convertDateToISO8061(date);
	        
		 assertEquals("2024-12-03T14:10:31Z", isoDate, "Date should be formatted as ISO 8061 UTC string");
	    
	 }//end of testConvertDateToISO8061
	 
	 
	 @Test
	    void testDaysBetweenDates() {
		 
	        LocalDate startDate = LocalDate.of(2024, 12, 1);
	        
	        LocalDate endDate = LocalDate.of(2024, 12, 5);
	        
	        long days = DateTimeFunctions.daysBetweenDates(startDate, endDate);
	        
	        assertEquals(4, days, "There should be 4 days between 2024-12-01 and 2024-12-05");
	   
	 }//end of testDaysBetweenDates 

}//end of Testing class 
