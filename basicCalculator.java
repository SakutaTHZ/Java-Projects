import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args){
        int result = 0;
        String resultop = "";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number - ");
            int var1 = scanner.nextInt();
            System.out.print("Enter second number - ");
            int var2 = scanner.nextInt();
            System.out.print("Choose method - \n1) add\n2) subtract\n3) multiply\n4) divide\n5)reminder\n. . .");
            int method = scanner.nextInt();
            
            switch (method){
                case 1:
                    result = var1 + var2;
                    resultop = "+";
                    break;
                case 2:
                    result = var1 - var2;
                    resultop = "-";
                    break;
                case 3:
                    result = var1 * var2;
                    resultop = "*";
                    break;
                case 4:
                    result = var1 / var2;
                    resultop = "/";
                    break;
                case 5:
                    result = var1 % var2;
                    resultop = "%";
                    break;
                default:
                    System.out.println("Invalid method");
                    resultop = "Invalid";
                    break;
            }
            
            System.out.println("\n"+var1 + " " + resultop + " "  + var2 + " = " + result);
        }
        catch (Exception ex){
            System.out.println("An Error has occured");
        }
    }
}

