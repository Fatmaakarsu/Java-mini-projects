import java.util.Scanner;
public class TaksimetreHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acilis = 10;
        float km = 2.20f;

        System.out.println("Kaç km gittiniz : ");
        int a = input.nextInt();

        double tutar = acilis+km*a;

        if(tutar<20){
            tutar=20;
            System.out.println("Taksimetre tutarı :"+tutar);
        }
        else{
            System.out.println("Taksimetre tutarı :"+tutar);
        }
        
    }
}
