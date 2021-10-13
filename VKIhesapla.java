import java.util.Scanner;
public class VKIhesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz ");
        float boy=input.nextFloat();
        System.out.println("Kilonuzu giriniz ");
        float kilo=input.nextFloat();

        // Kilo (kg) / Boy(m) * Boy(m)

        float vki = kilo/(boy*boy);
        System.out.println("Vücut Kütle Endeksiniz : "+vki);


    }
}
