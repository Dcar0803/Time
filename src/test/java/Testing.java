import static org.junit.jupiter.api.Assertions.*;
import java.time.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
    void testGetCurrentDateTime() {
        
		LocalDateTime now = DateTimeFunctions.getCurrentDateTime();
       
        assertNotNull(now, "Current date and time should not be null");
   
	}//end of testGetCurrentDateTime method 

}//end of Testing class 
