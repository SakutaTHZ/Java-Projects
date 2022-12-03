package p6;
import java.util.Scanner;

public class Scrambler {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Write Something - ");
            String sentence = s.nextLine();
            String[] strArray = null;
            strArray = sentence.split(" ");
            for (String string : strArray) {
                System.out.print(reverse(string)+" ");
            }
        }
    }

    private static String reverse(String string) {
        StringBuffer sb = new StringBuffer(string);
        sb.reverse();
        return switchFirstLast(sb.toString());
    }

    private static String switchFirstLast(String sb){
        char[] chr = sb.toCharArray(); 
        char temp = chr[0];
        chr[0] = chr[sb.length()-1];
        chr[sb.length()-1] = temp;
        return String.valueOf(chr);
    }
}
