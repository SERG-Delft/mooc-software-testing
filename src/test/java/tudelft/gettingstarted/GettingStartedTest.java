package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

//    @Test
//    public void addFiveToZero() {
//        int result = new GettingStarted().addFive(???);
//        Assertions.assertEquals(???, result);
//    }
//
//    @Test
//    public void addFiveToMinus20() {
//        int result = new GettingStarted().addFive(???);
//        Assertions.assertEquals(????,result);
//    }
}
