package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();
      //  if(null == shift) {return "invalid shift!";}
        shift = shift%26;
//eight.equals(m.get("null")
        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
           
            //sb.append(currentChar);
            if((char)(currentChar) == ' '){
                sb.append(' ');
                continue;
            }
            if (currentChar > 'z' || currentChar < 'a') {
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
