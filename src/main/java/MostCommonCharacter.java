import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        char mostCommonChar = ' '; 
        int commonCharCount = 0;
        char[] strArr = str.toCharArray();
        Map<Character, Integer> hMap = new HashMap<Character, Integer>();
        
        for (char character : strArr) {
            if (hMap.containsKey(character)) {
                hMap.put(character, hMap.get(character) + 1);

            } else {
                hMap.put(character, 1);
            }
        }
        
        for (Map.Entry<Character, Integer> currentEntry : hMap.entrySet()) {
            char char_Key = currentEntry.getKey();
            int count_Value = currentEntry.getValue();
            
            if (count_Value > commonCharCount) {
                commonCharCount = count_Value;
                mostCommonChar = char_Key;
            }
        }

        return mostCommonChar;
    }
}
