import org.junit.Assert;
import org.junit.Test;

public class MyHealthDataTest1 {
    
    @Test
    public void testGetBMI_Success() {
        Patient patient = new Patient("Eric","Yuen","M",1983,9,28,70.7,150.5);
        double expectedBMI = 21.17;
        
        double actualBMI = patient.getBMI();
        
        Assert.assertEquals(expectedBMI, actualBMI, 0.01);
        System.out.println("Test passed successfully.");
    }
}
