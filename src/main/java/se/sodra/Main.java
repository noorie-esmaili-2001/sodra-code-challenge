package se.sodra;

import java.util.HashSet;

public class Main {

    public static boolean hasUniqueChars(String text) {
        HashSet<Character> set = new HashSet<>();

        for (char c : text.toCharArray()) {
            if (c != ' ') {
                if (set.contains(Character.toLowerCase(c))) {
                    return false;
                } else {
                    set.add(Character.toLowerCase(c));
                }
            }
        }

        return true;
    }

    private static void displayResult(String text, boolean isUnique) {
        String message = isUnique ? "har endast unika tecken." : "har duplicerade tecken.";
        System.out.println("Texten \"" + text + "\" " + message);
    }

    public static void main(String[] args) {
        String text1 = "Södra";
        String text2 = "Södra Skogsägarna";

        displayResult(text1, hasUniqueChars(text1));
        displayResult(text2, hasUniqueChars(text2));
    }
}