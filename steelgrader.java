import java.util.Random;

public class steelgrader {
    public static void main(String[] args) {
        /*
            Create three variables : hardness, carbon and tensile
            hardness value must be greater than 50
            carbon value must be less than 0.7
            tensile value must be greater than 5600
            - The grades are as follows:
            } Grade is 10 if all three conditions are met
            } Grade is 9 if conditions (i) and (ii) are met
            } Grade is 8 if conditions (ii) and (iii) are met
            } Grade is 7 if conditions (i) and (iii) are met
            } Grade is 6 if only one condition is met
            } Grade is 5 if none of the conditions are met
         */
        double carbon = 0;
        int hardness = 0, tensile = 0;
        generateData(hardness,carbon,tensile);
    }

    //check da quality
    private static void qualityCheck(int hardness, double carbon, int tensile) {
        int checker = 0; 
        checker = hardness > 50 ? checker+2 : checker+0;
        checker = carbon < 0.7 ? checker+3 : checker+0;
        checker = tensile > 5600 ? checker+4 : checker+0;
        System.out.println("Hardness value "+hardness+" > 50 ? ( "+ (hardness > 50 ? ":) )" : ":( )") + "\nCarbon Value "+carbon+" < 0.7 ? ( "+ (carbon < 0.7 ? ":) )" : ":( )") + "\nTensile Value "+tensile+" > 5600 ? ( "+ (tensile > 5600 ? ":) )" : ":( )\n\n"));
        switch (checker) {
            case 0:
                System.out.println("No Conditions Met\nThis Steel is Grade 5");
                break;
            case 6:
                System.out.println("This Steel is Grade 7");
                break;
            case 7:
                System.out.println("This Steel is Grade 8");
                break;
            case 5:
                System.out.println("This Steel is Grade 9");
                break;
            case 9:
                System.out.println("This Steel is Grade 10");
                break;
            default:
                System.out.println("This Steel is Grade 6");
                break;
        }
    }

    //Generate data
    private static void generateData(int hardness, double carbon, int tensile) {
        Random random = new Random();
        hardness = random.nextInt(100);
        carbon = Math.round(0.0 + (1.0 - 0.0) * random.nextDouble()* 10.0) / 10.0;
        tensile = random.nextInt(10000);
        System.out.println("Hardness - "+hardness+"\nCarbon - "+carbon+"\nTensile - "+tensile+"\n");
         
        qualityCheck(hardness,carbon,tensile); 
    }
}
