/**
 * Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int boyut = inp.nextInt();
        int[] liste = new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i=0;i<boyut;i++){
            System.out.print((i+1)+". Elemanı : ");
            int a = inp.nextInt();
            liste[i]=a;
        }

        Arrays.sort(liste);
        System.out.print("Sıralama : ");
        for(int x : liste){
            System.out.print(x+" ");
        }
    }
}
