/**
 * Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
 */
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = input.nextInt();
        int toplam =0;

        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(toplam==sayi){
            System.out.println(sayi+" Mükemmel Sayıdır.");
        }
        else{
            System.out.println(sayi+" Mükemmel Sayı Değildir.");
        }
    }
}
