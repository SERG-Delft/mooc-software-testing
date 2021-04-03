package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CaesarShiftCiperTest1{

    @ParameterizedTest(name = "string = {0}, shift = {1}, rezult = {2}")
    @CsvSource({"abc, 0, abc", "xyz,3, abc", " aa bb cc ,3, dd ee ff "} )
    public void TestTest(String sm, int shift, String expectedResult){
        CaesarShiftCipher str = new CaesarShiftCipher();
        String result = str.CaesarShiftCipher(sm, shift);
        Assertions.assertEquals(result, expectedResult);
    }

}