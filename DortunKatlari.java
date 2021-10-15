/**
 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

import java.util.Scanner;

public class DortunKatlari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do{
            System.out.println("Sayı giriniz");
            sayi = inp.nextInt();
            
            if(sayi%4==0){
                toplam+=sayi;
            }

        }while(sayi%2==0);
        System.out.println("Toplam : "+toplam);

    }
}
