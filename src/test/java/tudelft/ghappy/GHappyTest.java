package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.chocolate.ChocolateBags;
//import tudelft.ghappy.GHappy;

public class GHappyTest {

    private GHappy happy;

    @BeforeEach
    public void initialize() {
        this.happy = new GHappy();
    }


    @Test
    public void oneNoHappy() {
        Assertions.assertFalse(happy.gHappy("xxxgxxx"));
    }

    @Test
    public void twoHeppy(){
        Assertions.assertTrue(happy.gHappy("xxxggxx"));
    }

    @Test
    public void twoNoHappy() {
        Assertions.assertFalse(happy.gHappy("gxxgxgg"));
    }

    @Test
    public void twoHappy() {
        Assertions.assertTrue(happy.gHappy("ggxxggxgg"));
    }

    @Test
    public void outgHappy() {
        Assertions.assertFalse(happy.gHappy("xxxx"));
    }


}