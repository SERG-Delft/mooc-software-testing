package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
// Нужно вставить проверку null!!

public class GHappyTestOneT {
    @ParameterizedTest(name = "string={0}, result={1}")
    @CsvSource({"xxggaa,True", "xxxx, False", "gxxgxxggxx, False", "xxggaaaggss, True", "null,False",
            "ggaaaggaagg, True", ",False"})
    public void dHappyTestTest(String sm, boolean expectedResult ) {
        GHappy bags = new GHappy();
        boolean result = bags.gHappy(sm);
        Assertions.assertEquals(expectedResult, result);
    }
}