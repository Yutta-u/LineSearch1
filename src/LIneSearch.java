import java.util.Arrays;
import java.util.Scanner;

public class LIneSearch {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
        }
        int num = scan.nextInt();
        int x = 0;
        for (int element : array) {
            if (element == num) {
                x++;
            }
        }
        System.out.println(x);
    }
}