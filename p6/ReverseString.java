package p6;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Write Something - ");
            String sentence = s.nextLine();
            StringBuffer sb = new StringBuffer(sentence);
            System.out.print("Result - "+ sb.reverse());
        }
    }
}
