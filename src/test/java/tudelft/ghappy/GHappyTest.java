package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GHappyTest {
    private GHappy G;

    @BeforeEach
    public void initialize() {this.G = new GHappy();}

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     *
     * Examples:
         * gHappy("xxggxx") ==> true
         * gHappy("xxgxx") ==> false
         * gHappy("xxggyygxx") ==> false
     * See our implementation in the GHappy class (package tudelft.ghappy).
     * There's a bug in this implementation. Apply everything you learned and do your best to find the bug!!
     * Write your automated tests inside GHappyTest class.
     * At the end, push your solution to your GitHub repository.
     *
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

