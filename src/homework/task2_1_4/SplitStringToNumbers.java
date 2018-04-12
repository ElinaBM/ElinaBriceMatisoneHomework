package homework.task2_1_4;

import java.util.Scanner;

public class SplitStringToNumbers {
    public static void main(String[] args) {

        Scanner textScanner = new Scanner(System.in);
        String inputText;

        System.out.println("Enter list of numbers and decimals separated by space");
        inputText = textScanner.nextLine();

        System.out.println("============================================");

        String amendedText = amendString(inputText);
        System.out.print("Text amended by replacing spaces with ; : \n" + amendedText + "\n");

        createTextArray(amendString(inputText));

        System.out.println("============================================");

        double calculatedSum = calculateElementSum(createTextArray(amendedText));

        System.out.println("\n Sum is: " +calculatedSum );
    }

    private static String[] createTextArray(String stringOfText) {

        String[] devidedText = stringOfText.split(";");

        return devidedText;
    }

    private static String amendString(String inputText) {
        String amendedText = inputText.replace(" ", ";");
        return amendedText;
    }

    private static double calculateElementSum(String[] devidedText) {
        double elementSum = 0;
        for (int i = 0; i < devidedText.length; i++) {
            double newElement = Double.parseDouble(devidedText[i]);
            elementSum += newElement;
        }
        return elementSum;
    }
}

