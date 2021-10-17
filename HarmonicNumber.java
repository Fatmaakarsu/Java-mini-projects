// Java döngüler ile harmonik serisi bulan program yazıyoruz

/**Harmonik Seri Formülü :
 * 1/1 + 1/2 + .... + 1/n = Harmonik Seri toplamı
 */

import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int numb = input.nextInt();
        float toplam =0f;

        for(float i=1f;i<=numb;i++){
            toplam=toplam+(1/i);
        }

        System.out.print("\nGirilen sayının harmonik seri toplamı : "+toplam);



    }
}
