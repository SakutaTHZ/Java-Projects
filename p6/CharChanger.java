package p6;
import java.util.Scanner;

public class CharChanger {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Write Something - ");
            String sentence = s.nextLine();
            sentence = sentence.toUpperCase();
            sentence = sentence.replace("A", "@");
            System.out.println(sentence);
        }
    }
}
