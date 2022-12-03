import java.util.Random;

public class gainorloss {
    public static void main(String[] args) {
        Random random = new Random();
        int original  = random.nextInt(100000);
        int sell  = random.nextInt(100000);
        System.out.println("Original Price - "+ original + " $\nSell price - " + sell + " $");
        if(original> sell){
            System.out.println("-- U loss a total of "+ (original - sell) + " $");
        }else if(original < sell){
            System.out.println("++ U got a profit of "+ (sell - original) + " $");
        }else{
            System.out.println("== Hmm this is rare");
        }
    }
}
