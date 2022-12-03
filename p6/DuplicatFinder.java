package p6;
import java.util.Scanner;

public class DuplicatFinder {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Write Something - ");
            String sentence = s.nextLine();
            String result = "";
            char[] checker = sentence.toCharArray();
            for (int i = 0; i < checker.length; i++) {
                for (int j = 0; j < checker.length; j++) {
                    if(checker[i] == checker[j] && i!=j){
                        result = result.contains(checker[i]+"")? result + "": result + checker[i];
                    }
                }
            }
            System.out.println("Duplicates - " + result );
        }
    }
}
