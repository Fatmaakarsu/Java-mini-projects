/**
 * Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program
 */

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int minNum , maxNum , readNumber;

        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        int number = scan.nextInt();

        System.out.print("1. Sayıyı Giriniz: ");
        int bir = scan.nextInt();
        minNum=bir;
        maxNum=bir;

        for (int i = 2; i <= number; i++) {
            System.out.printf("%s. Sayıyı Giriniz: ", i);
            readNumber = scan.nextInt();
            if (readNumber < minNum) minNum = readNumber;
            else if (readNumber > maxNum) maxNum = readNumber;
        }
        System.out.println("En Büyük Sayı: " + maxNum);
        System.out.println("En Küçük Sayı: " + minNum);
    }
}