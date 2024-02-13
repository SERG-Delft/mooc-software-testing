package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String caesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift % 26;

        for (int i = 0; i < length; i++){
            currentChar = message.charAt(i);
           
//            sb.append(currentChar);
            //The above line is wrong as it tries to
            //appending the original character and the shifted character to the StringBuilder
            // within the loop. This results in each character being appended twice.
            // You should append only the shifted character after the necessary checks.

            if (currentChar < 'a' || currentChar > 'z') {
                // Handle invalid characters here, either throw an exception or return a special value
                return "invalid";
            } else if ((char) (currentChar + shift) > 'z') {
                currentChar = (char) (currentChar - 26);
            } else if ((char) (currentChar + shift) < 'a'){
                currentChar = (char) (currentChar + 26);
            }
            sb.append((char) (currentChar + shift));
        }

        return sb.toString();
    }
}
