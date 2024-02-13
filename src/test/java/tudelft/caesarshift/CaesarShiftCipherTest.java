package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher encrypt;
    @BeforeEach
    public void initialize() {this.encrypt = new CaesarShiftCipher();}

    @Test
    public void encryptTest_01() {
        String encrypt_A = encrypt.caesarShiftCipher("abc",3);
        Assertions.assertEquals("def", encrypt_A);
    }
    @Test
    public void encryptTest_02() {
        String encrypt_A = encrypt.caesarShiftCipher("xyz",3);
        Assertions.assertEquals("abc", encrypt_A);
    }
    @Test
    public void encryptTest_03() {
        String encrypt_A = encrypt.caesarShiftCipher("ABC",3);
        Assertions.assertEquals("invalid", encrypt_A);
        //Capital letters should return invalid
    }
    @Test
    public void encryptTest_04() {
        String encrypt_A = encrypt.caesarShiftCipher("abc",4);
        Assertions.assertEquals("efg", encrypt_A);
        // shifting at 4 spaces
    }
    @Test
    public void encryptTest_05() {
        String encrypt_A = encrypt.caesarShiftCipher("ace",3);
        Assertions.assertEquals("dfh", encrypt_A);
        //a plus 3 shifts equals d, c plus 3 shifts is f and e plus 3 shifts is h, "dfh"
    }
    @Test
    public void encryptTest_06() {
        String encrypt_A = encrypt.caesarShiftCipher("123",3);
        Assertions.assertEquals("invalid", encrypt_A);
        // "456" is not expected as anything out small letters 'a to z' is "invalid"
    }

}
