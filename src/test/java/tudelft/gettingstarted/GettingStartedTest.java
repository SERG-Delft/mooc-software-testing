package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveToTwenty() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    // filling this in with 0 and 5
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    // filling this in with -20 and -15
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }
}
