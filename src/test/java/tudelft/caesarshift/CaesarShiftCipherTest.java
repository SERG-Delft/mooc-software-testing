package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import tudelft.roman.RomanNumeral;

// Нужно вставить проверку null!!
public class CaesarShiftCipherTest {

    private CaesarShiftCipher sh;

    @BeforeEach
    public void initialize() {
        this.sh = new CaesarShiftCipher();
    }

    @Test
    public void aBc() {
        String result = sh.CaesarShiftCipher("ab c aa", 0);
        Assertions.assertEquals("ab c aa", result);
    }

}
