package homework.task2_1_1;

import java.util.Scanner;

public class ConcatenationOfText {

    public static void main(String[] args) {

        String inputTextName;
        String inputTextSurname;

        Scanner textscanner = new Scanner(System.in);

        System.out.print("Enter your First name: ");
        inputTextName =textscanner.next();
        System.out.print("Enter your Last name: ");
        inputTextSurname =textscanner.next();

        System.out.println("Hello, " + inputTextName + " " + inputTextSurname + "!");
    }
}
