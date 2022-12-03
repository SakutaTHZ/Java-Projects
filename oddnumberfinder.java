import java.util.*;
import java.util.Random;

public class oddnumberfinder {
    public static void main(String[] args) {
        List<Integer> array=new ArrayList<Integer>();  
        List<Integer> list=new ArrayList<Integer>();  
        generateArray(array);
        showarray(array);
        checkodds(array,list);
        System.out.print("__________\nodd numbers - ");
        showarray(list);
    }
    private static void checkodds(List<Integer> array, List<Integer> list) {
        for (int i : array) {
            if(i%2 != 0){
                list.add(i);
            }
        }
        System.out.println("\n__________\n"+list.size() + " odd numbers found");
    }
    private static void showarray(List<Integer> array) {
        for (int i : array) {
            System.out.print(i+" | ");
        }
    }
    private static void generateArray(List<Integer> array1){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array1.add(random.nextInt(1000));
        }
    }
}
