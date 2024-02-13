package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
    @Test
    public void numberWithandWithoutLargeSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XCIX");
        Assertions.assertEquals(99, result);
    }
    @Test
    public void numberWithLargeSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("CD");
        Assertions.assertEquals(400, result);
    }
}
