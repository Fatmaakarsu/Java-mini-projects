/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/
import java.util.Scanner;
public class OnikiyeBolunenSayilarinOrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        int toplam=0;
        int kacSayi=0;

        for(int i =0;i<=number;i++){
            if(i%12==0){
                toplam= toplam+i;
                kacSayi++;
            }
        }

        float ortalama = toplam/kacSayi;
        System.out.println(ortalama);
    }
}