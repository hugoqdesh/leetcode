import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> numerals = new HashMap<>();
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);

        for(int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && numerals.get(s.charAt(i)) < numerals.get(s.charAt(i + 1))) {
                result -= numerals.get(s.charAt(i));
            } else {
                result += numerals.get(s.charAt(i));
            }
        }

        return result;
    }
}
