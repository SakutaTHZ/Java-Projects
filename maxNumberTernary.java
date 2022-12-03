import java.util.Random;

public class maxNumberTernary {
    public static void main(String[] args) {
        Random random = new Random();
        int var1 = random.nextInt(100), var2 = random.nextInt(100), var3= random.nextInt(100), max= 0;
        max = var1 > var2 ? var1>var3 ? var1: var3 : var2>var3 ? var2 : var3;
        System.out.println("Number one - "+var1+"\nNumber two - "+var2+"\nNumber three - "+var3+"\n\nMax number - " + max);
    }
}
