
import org.junit.Assert;
import org.junit.Test;

public class MyHealthDataTest2 {
    
    @Test
    public void testGetBMI_Failure() {
        Patient patient = new Patient("Christine","Wang","F",1991,5,30,66.6,120.2);
        double expectedBMI = 23.01; 
        
        double actualBMI = patient.getBMIError();
        
        Assert.assertEquals(expectedBMI, actualBMI, 0.01);
        System.out.println("Test failed.");
    }
}
