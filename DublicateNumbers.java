/**
 * Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazınız.
 */

import java.sql.Array;
import java.util.Arrays;

public class DublicateNumbers {
    static boolean isFinde(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = { 2, 3, 2, 9, 10, 21, 33, 10, 1, 9, 1, 35 };
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {

                if ((i != j) && (list[i] == list[j])) {
                    if (!isFinde(duplicate, list[i])) {
                        duplicate[startIndex] = list[i];
                        startIndex++;
                    }

                    break;
                }
            }
        }

        for(int value: duplicate){
            if(value!=0 && value%2==0){
                System.out.println(value);
            }
        }
    }
}
