package Strings;

import java.util.Scanner;

public class LetterSearch {
    /*
     * LOOP BREAK
     * Search a String to determine if it contains the letter 'A'.
     */
    public static void main(String[] args) {
        System.out.println("Enter the letter");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        scanner.close();

        boolean letterFound = false;

        for (int i = 0; i < letter.length(); i++) {
            char currentLetter = letter.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }
        if (letterFound) {
            System.out.println("Letter A found");
        } else {
            System.out.println("Letter A not found");
        }
    }
}
