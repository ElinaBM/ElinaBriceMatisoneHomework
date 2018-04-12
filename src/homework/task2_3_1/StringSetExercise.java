package homework.task2_3_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSetExercise {
    public static void main(String[] args) {
        String enteredText;
        Scanner textScanner = new Scanner(System.in);
        Set setOfCharacters = new HashSet();

        System.out.println("Enter a list of characters (several lines): ");

        enteredText = textScanner.next();
        do {
            setOfCharacters.add(enteredText);
        } while (enteredText != "end");
        System.out.println(setOfCharacters);
    }
}
