import java.util.Random;

public class sorting{
    static int[] number = new int[10];
    public static void main(String[] args) {
        generateArray();
        bubbleSorting(number);
        insertionSorting(number);
        mergeSort(number);
    }

    private static void generateArray(){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            number[i] = random.nextInt(100);
        }
        showArray(number,"Random");
    }

    private static void showArray(int[] array ,String sortMethod){
        for (int i : array) {
            System.out.print(i+" | ");
        }
        System.out.print(sortMethod + "\n");
    }

    private static void bubbleSorting(int[] array){
        int[] copiedArray = array.clone();
        int turns = 0;
        for (int i = 0; i < copiedArray.length; i++) {
            for (int j = 0; j < copiedArray.length - (i+1); j++) {
                int temp = copiedArray[j];
                if(copiedArray[j] > copiedArray[j+1] && j != copiedArray.length - (i+1)){
                    copiedArray[j] = copiedArray[j+1];
                    copiedArray[j+1] = temp;
                }
                turns++;
            }
        }
        showArray(copiedArray,"bubble. Turns - "+ turns);
    }

    private static void insertionSorting(int[] array){
        int[] copiedArray = array.clone();
        int turns = 0;
        for (int i = 1; i < copiedArray.length; i++) {
            int current = copiedArray[i];

            int j = i-1;
            while(j >=0 && current < copiedArray[j]){
                copiedArray[j+1] = copiedArray[j];
                j--;
                turns++;
            }
            copiedArray[j+1] = current;
        }
        showArray(copiedArray,"insert. Turns - "+ turns);
    }

    private static void mergeSort(int[] array){
        int[] copiedArray = array.clone();
        int length = copiedArray.length;
        if(length < 2){
            return;
        }
        int mid = length/2;
        int[] left = new int[mid];
        int[] right = new int[length - mid]; 
        for (int i = 0; i < mid; i++) {
            left[i] = copiedArray[i];
        }
        for (int j = mid; j < length; j++) {
            right[j - mid] = copiedArray[j];
        }

        mergeSort(left);
        mergeSort(right);

        showArray(left,"left");
        showArray(right,"right");
        showArray(copiedArray,"merge");

        merge(copiedArray, left, right);
    }

    private static void merge(int[] mergearray,int[] left,int[] right){
        int leftLength = left.length;
        int rightLength = right.length;

        int i = 0, j = 0, k = 0;
        while(i < leftLength && j < rightLength){
            if(left[i] <= right[j]){
                mergearray[k] = left[i];
                i++;
            }else{
                mergearray[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < leftLength){
            mergearray[k] = left[i];
            i++;
            k++;
        }
        while(j < rightLength){
            mergearray[k] = right[j];
            j++;
            k++;
        }
        showArray(mergearray,"merged ones");
    }
}