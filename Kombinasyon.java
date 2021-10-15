/**
 * Java ile kombinasyon hesaplayan program yazınız.
 */
import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyonu hesaplamak istediğiniz sayıyı ve kombinaysonunu giriniz");
        int n = input.nextInt();
        int r = input.nextInt();
        
        /**Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
        */
        
        int nFak=1;
        int rFak=1;
        int nEksiRfak=1;

        // n!
        for(int i=1;i<=n;i++){
            nFak*=i;
        }

        //r!
        for(int i=1;i<=r;i++){
            rFak*=i;
        }

        // (n-r)!
        for(int i=1;i<=(n-r);i++){
            nEksiRfak*=i;
        }

        // n! / (r! * (n-r)!)
        double result = nFak/(rFak*nEksiRfak);

        System.out.println("("+n+","+r+") = "+result);



    }
}
