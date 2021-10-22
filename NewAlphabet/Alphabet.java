import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;

public class Alphabet {
    String strTranslate;
    HashMap<String, String> dictionary;

    public Alphabet(String strTranslate) {
        this.strTranslate = strTranslate.toLowerCase();
        dictionary = getPattern();
    }

    private HashMap<String, String> getPattern() {
        String[] newAlphabet = { "@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]",
                "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2" };
        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };

        HashMap<String, String> mapAlph = new HashMap<>();

        for (int i = 0; i < newAlphabet.length; i++) {
            mapAlph.put(alphabet[i], newAlphabet[i]);
        }

        return mapAlph;
    }

    public void translate() {
        String newStr = "";
        for (int i = 0; i < strTranslate.length(); i++) {
            String currChar = Character.toString(strTranslate.charAt(i));
            if (dictionary.containsKey(currChar)) {
                newStr += dictionary.get(currChar);
            } else {
                newStr += currChar;
            }
        }

        System.out.println(newStr);
    }

}
