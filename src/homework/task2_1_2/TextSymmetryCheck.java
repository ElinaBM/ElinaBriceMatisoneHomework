package homework.task2_1_2;

import java.util.Scanner;

public class TextSymmetryCheck {
    public static void main(String[] args) {

        String enteredText, firstPartOfText, secondPartOfText;

        Scanner textScanner = new Scanner(System.in);

        System.out.println("Please enter one string of symbols. The program will determine if your entered string is symmetrical.\n" +
                "Example of symmetrical string - abcXcba, example of asymmetrical string - abcqgtt");
        enteredText = textScanner.nextLine();

        if (isEvenNumber(enteredText) == true) {
            int halfTextLength = enteredText.length() / 2;
            firstPartOfText = enteredText.substring(0, halfTextLength);
            secondPartOfText = enteredText.substring(halfTextLength, enteredText.length());
        } else {
            int halfTextLength = enteredText.length() / 2;
            firstPartOfText = enteredText.substring(0, halfTextLength);
            secondPartOfText = enteredText.substring(halfTextLength + 1, enteredText.length());
        }

        //reverse 2nd part of text


        compareSymmetryOfString(firstPartOfText, secondPartOfText);
    }

    private static void compareSymmetryOfString(String firstPartOfText, String secondPartOfText) {
        String reversedFirstPartOfText;
        StringBuilder reversedText = new StringBuilder();

        for (int i = firstPartOfText.length() - 1; i <= 0; i--) {
            reversedText = reversedText.append(reversedText.append(firstPartOfText.charAt(i)));
        }
        //reversedFirstPartOfText = reversedText.toString();

        System.out.println(reversedText.toString());

        // System.out.println(secondPartOfText.equals(reversedFirstPartOfText) ? "This is a symmetrical string" : "This is not a symmetrical string");
    }

    private static boolean isEvenNumber(String enteredText) {
        if (enteredText.length() % 2 != 0) {
            return false;
        }
        return true;
    }


}
