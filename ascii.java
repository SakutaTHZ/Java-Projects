import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a char - ");
            String input = scanner.nextLine();
            for (int i = 0; i < input.length(); i++) {
                char firstChar = input.charAt(i);
                int asciivalue = firstChar;
                String result = asciivalue>=65 && asciivalue<=90 ? "Capital Letter": asciivalue>=97 && asciivalue<=122 ? "Small Case Letter":asciivalue>=48 && asciivalue<=57 ? "Number":"Special Symbol";
                System.out.println("ASCII value of '"+firstChar+"' is '"+ result+"'.");
            }
        }
    }

    
}
