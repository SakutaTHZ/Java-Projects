import java.util.Scanner;

public class triangle {
    public class Global
    {
        public static int number = 5;
        public static int mode = 1;
        //mode 1 is stars <-- default
        //mode 2 is number
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Hello my painful World of JAVA! \n_________________________________");
        acceptInput();
        normalTriangle(Global.number,Global.mode);
        mirrorTriangle(Global.number,Global.mode);
        reverseTriangle(Global.number,Global.mode);
        reverseMirrorTriangle(Global.number,Global.mode);
        pyramid(Global.number,Global.mode);
        reversePyramid(Global.number,Global.mode);
        diamond(Global.number,Global.mode);
        reverseDiamond(Global.number,Global.mode);
    }

    //accept input here
    public static void acceptInput() {
        try{
        System.out.print("Choose mode - \n1) X mode\n2) Number Mode\n-->");
        Scanner input = new Scanner(System.in);
        // this is for mode input
        try{
            Global.mode = input.nextInt();
        }catch(Exception e){
            input.next();
        }
        System.out.print("Enter the number of stars - ");
        // this is for number input
        Scanner inputrow = new Scanner(System.in);
        String amount = inputrow.nextLine();
            if(Integer.parseInt(amount) <= 0 || Integer.parseInt(amount) >= 10){
                System.out.println("Please use number larger than 0 and less then 9");
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
    

    //Triangle 
    public static void normalTriangle(int am,int m) {
        System.out.println("\\___Triangle___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= i; j++) {
                if(m==1){
                    System.out.print("x ");
                }else{
                    System.out.print(i+" ");
                } 
            }
            System.out.println();
        }
        System.out.println();
    }

    //Mirror Triangle
    public static void mirrorTriangle(int am,int m) {
        System.out.println("\\___ MirrorTriangle ___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= am - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                if(m==1){
                    System.out.print("x ");
                }else{
                    System.out.print(i+" ");
                } 
            }
            System.out.println();
        }
        System.out.println();
    }

    //Reversed Triangle 
    public static void reverseTriangle(int am,int m) {
        System.out.println("\\___Reversed Triangle___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= am - (i - 1); j++) {
                if(m==1){
                    System.out.print("x ");
                }else{
                    System.out.print(i+" ");
                } 
            }
            System.out.println();
        }
        System.out.println();
    }

    //Reversed Mirrored Triangle 
    public static void reverseMirrorTriangle(int am,int m) {
        System.out.println("\\___Reversed Mirrored Triangle___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= am - (i - 1); k++) {
                if(m==1){
                    System.out.print("x ");
                }else{
                    System.out.print(i+" ");
                } 
            }
            System.out.println();
        }
        System.out.println();
    }

    //Pyramid
    public static void pyramid(int am,int m) {
        System.out.println("\\___Pyramid___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= am - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i + (i -1); k++) {
                if(m==1){
                    System.out.print("x ");
                }else{
                    System.out.print(i+" ");
                } 
            }
            System.out.println();
        }
        System.out.println();
    }

    //Reversed Pyramid
    public static void reversePyramid(int am,int m) {
        System.out.println("\\___Reverse Pyramid___/\n");
        for (int i = 1; i <= am; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (am - i + 1)+(am - i); k++) {
                if(m==1){
                    System.out.print("x ");
                }else{
                    System.out.print(i+" ");
                } 
            }
            System.out.println();
        }
        System.out.println();
    }

    //Diamond
    public static void diamond(int am,int m) {
        System.out.println("\\___Diamond___/\n");

        // Check Even or Odd
        int isEven = (am%2 == 0) ? 0 : 1;
        
        for (int i = 1; i <= am ; i++) {
            if(i <=am/2 + isEven){
                // first half
                for (int j = 1; j <= am/2 - i +1; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i + (i -1); k++) {
                    if(m==1){
                        System.out.print("x ");
                    }else{
                        System.out.print(i+" ");
                    } 
                }
            }else{
                // second half
                for (int j = 1; j <= i - (am/2) - isEven; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= (am - i + 1)+(am - i); k++) {
                    if(m==1){
                        System.out.print("x ");
                    }else{
                        System.out.print(i+" ");
                    } 
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //Reverse Diamond
    public static void reverseDiamond(int am,int m) {
        System.out.println("\\___Reverse Diamond___/\n");

        // Check Even or Odd
        int isEven = (am%2 == 0) ? 0 : 1;

        for (int i = 1; i <= am; i++) {
            if(i <= am/2 + (isEven) ){
                // first half
                for (int j = 1; j <= am/2 - i + isEven; j++) {
                    if(m==1){
                        System.out.print("x ");
                    }else{
                        System.out.print(i+" ");
                    } 
                }
                for (int k = 1; k <= i + (i -1); k++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= am/2 - i + isEven; j++) {
                    if(m==1){
                        System.out.print("x ");
                    }else{
                        System.out.print(i+" ");
                    } 
                }
            }else{
                // second half
                for (int j = 1; j <= i - (am/2) - 1; j++) {
                    if(m==1){
                        System.out.print("x ");
                    }else{
                        System.out.print(i+" ");
                    }
                }
                for (int k = 1; k <= (am - i + 1)+(am - i); k++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i - (am/2) - 1; j++) {
                    if(m==1){
                        System.out.print("x ");
                    }else{
                        System.out.print(i+" ");
                    }
                }
            }
            System.out.println();
        }
    
        System.out.println();
    }
}
