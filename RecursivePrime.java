/**
 * Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
*/
import java.util.Scanner;
public class RecursivePrime {

    static boolean isPrime(int x,int i) {
        if (x == i)
            return true;
        if (x % i == 0 || x == 1)
            return false;
        return isPrime(x, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        int i=2;
        System.out.print(number+" sayısı ");
        System.out.println(isPrime(number, i) ? "Asaldır !" : "Asal Değildir !");

        input.close();
    }
}