import java.util.Scanner;

public class triangle {
    public class Global
    {
        public static int number = 5;
    }
    public static void main(String[] args) throws Exception {

        System.out.println("Hello my painful World of JAVA! \n_________________________________");
        acceptInput();
        normalTriangle(Global.number);
        mirrorTriangle(Global.number);
        reverseTriangle(Global.number);
        reverseMirrorTriangle(Global.number);
        pyramid(Global.number);
        reversePyramid(Global.number);
        diamond(Global.number);
        reverseDiamond(Global.number);
    }

    //accept input here
    public static void acceptInput() {
        System.out.print("Enter the number of stars - ");
        try (Scanner input = new Scanner(System.in)) {
            String amount = input.nextLine();
            try{
                if(Integer.parseInt(amount) <= 0){
                    System.out.println("Please use number larger than 0");
                    acceptInput();
                }else{
                    Global.number = Integer.parseInt(amount);
                    System.out.println("Generated results - \n");
                }
            }
            catch (NumberFormatException ex){
                System.out.println("Please use number");
                acceptInput();
            }
        }
    }

    //Triangle 
    public static void normalTriangle(int am) {
        System.out.println("\\___Triangle___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Mirror Triangle
    public static void mirrorTriangle(int am) {
        System.out.println("\\___ MirrorTriangle ___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= am - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Reversed Triangle 
    public static void reverseTriangle(int am) {
        System.out.println("\\___Reversed Triangle___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= am - (i - 1); j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Reversed Mirrored Triangle 
    public static void reverseMirrorTriangle(int am) {
        System.out.println("\\___Reversed Mirrored Triangle___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= am - (i - 1); k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Pyramid
    public static void pyramid(int am) {
        System.out.println("\\___Pyramid___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= am - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i + (i -1); k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Reversed Pyramid
    public static void reversePyramid(int am) {
        System.out.println("\\___Reverse Pyramid___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (am - i + 1)+(am - i); k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Diamond
    public static void diamond(int am) {
        System.out.println("\\___Diamond___/\n");

        // Check Even or Odd
        int isEven = (am%2 == 0) ? 0 : 1;
        // first half
        for (int i = 1; i <= am/2  + isEven; i++) {
            for (int j = 1; j <= am/2 - i + isEven; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i + (i -1); k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        // second half
        for (int i = 1; i <= am/2; i++) {
            for (int j = 1; j <= i - 1 + isEven; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (am/2 - i + 1)+(am/2 - i); k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Diamond
    public static void reverseDiamond(int am) {
        System.out.println("\\___Reverse Diamond___/\n");

        // Check Even or Odd
        int isEven = (am%2 == 0) ? 0 : 1;
        // first half
        for (int i = 1; i <= am/2  + isEven; i++) {
            for (int j = 1; j <= am/2 - i + isEven; j++) {
                System.out.print("x ");
            }
            for (int k = 1; k <= i + (i -1); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= am/2 - i + isEven; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        // second half
        for (int i = 1; i <= am/2; i++) {
            for (int j = 1; j <= i - 1 + isEven; j++) {
                System.out.print("x ");
            }
            for (int k = 1; k <= (am/2 - i + 1)+(am/2 - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i - 1 + isEven; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
