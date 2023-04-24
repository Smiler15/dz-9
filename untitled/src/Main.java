import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println(getIntegerSum());

        System.out.println();

        // Task 2
        printUniqueSymbols("Alex90000");

    }

    public static int getIntegerSum(){
        int[] array = new int[]{8,2,3,4,5,6,7};
        int summ = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] % 2 ==0){
                summ += array[i];
            }
        }
        return(summ);

    }
    public static void printUniqueSymbols(String input) {
        char[] characters = input.toCharArray();
        Set<Character> uniqueSymbols = new LinkedHashSet<>();
        for (Character symbol : characters) {
            uniqueSymbols.add(symbol);
        }

        for (Character symbol : uniqueSymbols) {
            System.out.println(symbol);
        }
    }
}

