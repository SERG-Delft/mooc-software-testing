package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    private GHappy ghappy;

    @BeforeEach
    public void initialize() {
        this.ghappy = new GHappy();
    }

    @ParameterizedTest(name="text")
    @CsvSource({"gg", "xxggxx", "ggxx", "xxgg", "gg xx", "xx gg", "xx g gg", "xx gg g"})
    public void twoG(String text) {
        boolean b = this.ghappy.gHappy(text);
        Assertions.assertTrue(b);
    }

    @ParameterizedTest(name="text")
    @CsvSource({"ggg", "xxgggxx", "gggxx", "xxggg", "ggg xx", "xx ggg", "xx g ggg", "xx ggg g"})
    public void manyG(String text) {
        boolean b = this.ghappy.gHappy(text);
        Assertions.assertTrue(b);
    }

    @ParameterizedTest(name="text")
    @CsvSource({"g", "xxgxx", "gxx", "xxg", "xx g", "g xx", "g g", "xx g xx", "g xx g"})
    public void oneG(String text) {
        boolean b = this.ghappy.gHappy(text);
        Assertions.assertFalse(b);
    }
}
