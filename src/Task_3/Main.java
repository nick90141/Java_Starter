package Task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> letterValues = new HashMap<>();
        letterValues.put('R', 18);
        letterValues.put('O', 15);
        letterValues.put('M', 13);
        letterValues.put('A', 1);
        letterValues.put('N', 14);

        String name = "ROMAN";

        int nameNumber = calculateNameNumber(name, letterValues);

        System.out.println("Число імені для " + name + ": " + nameNumber);
    }

    private static int calculateNameNumber(String name, Map<Character, Integer> letterValues) {
        int sum = 0;

        for (char letter : name.toCharArray()) {
            sum += letterValues.getOrDefault(Character.toUpperCase(letter), 0);
        }

        return sum;
    }
}
