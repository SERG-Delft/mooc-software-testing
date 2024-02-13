package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GHappyTest {
    private GHappy G;

    @BeforeEach
    public void initialize() {this.G = new GHappy();}

    /**
     * Test the following conditions
     * checkG_001 gHappy("xxggxx") ==> true
     * checkG_002 gHappy("xxgxx") ==> false
     * checkG_003 gHappy("xxggyygxx") ==> false
     */
    @Test
    public void checkG_001() {
        boolean check001 = G.gHappy("ABggCD");
        Assertions.assertTrue(check001);
    }
    @Test
    public void checkG_002() {
        boolean check001 = G.gHappy("ABgCD");
        Assertions.assertFalse(check001);
    }
    @Test
    public void checkG_003() {
        boolean check001 = G.gHappy("ABggCDgEF");
        Assertions.assertFalse(check001);
    }
    @Test
    public void checkG_004() {
        boolean check001 = G.gHappy("ggABggCD");
        Assertions.assertTrue(check001);
    }
    @Test
    public void checkG_005() {
        boolean check001 = G.gHappy("ABggCDgg");
        Assertions.assertTrue(check001);
    }
}

