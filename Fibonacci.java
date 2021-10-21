/**
 * Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
 */

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = input.nextInt();

        int bir =0, iki=1, fibo;
        System.out.print(bir+" "+iki);

        for(int i=2;i<sayi;i++){
            fibo=bir+iki;
            System.out.print(" "+fibo);
            bir=iki;
            iki=fibo;
        }
    }
}
