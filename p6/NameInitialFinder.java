package p6;

import java.util.Scanner;

public class NameInitialFinder {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Your Name - ");
            String name = s.nextLine();
            String[] strArray = null;
            strArray = name.split(" ");
            System.out.print("The Initials are - |");
            for (String string : strArray) {
                System.out.print(string.toUpperCase().charAt(0) + "|");
            }
        }
    }
}
