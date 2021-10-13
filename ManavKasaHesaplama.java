import java.util.Scanner;
public class ManavKasaHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float armut = 2.14f;
        float elma = 3.67f;
        float domates = 1.11f;
        float muz = 0.95f;
        float patlıcan = 5.0f;

        System.out.println("Kaç adet armut aldınız");
        int a = input.nextInt();
        System.out.println("Kaç adet elma aldınız");
        int e = input.nextInt();
        System.out.println("Kaç adet domates aldınız");
        int d = input.nextInt();
        System.out.println("Kaç adet muz aldınız");
        int m = input.nextInt();
        System.out.println("Kaç adet patlıcan aldınız");
        int p = input.nextInt();

        float result = armut*a + elma*e + domates*d + muz*m + patlıcan*p;

        System.out.println("Armut          "+a);
        System.out.println("Elma          "+e);
        System.out.println("Domates         "+d);
        System.out.println("Muz         "+m);
        System.out.println("Patlıcan        "+p);
        System.out.println("Toplam      "+result);

        
    }
}
