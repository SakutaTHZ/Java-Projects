import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
        scanner.close();
    }
}