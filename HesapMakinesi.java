import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz ");
        int ilk = input.nextInt();
        System.out.println("İkinci sayıyı giriniz ");
        int ikinci = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Semininiz ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                int sonuc = ilk + ikinci;
                System.out.println("Sonuç = " + sonuc);
                break;
            case 2:
                sonuc = ilk - ikinci;
                System.out.println("Sonuç = " + sonuc);
                break;
            case 3:
                sonuc = ilk * ikinci;
                System.out.println("Sonuç = " + sonuc);
                break;
            case 4:
                sonuc = ilk / ikinci;
                System.out.println("Sonuç = " + sonuc);
                break;
            default:
            System.out.println("Yanlış seçim yaptınız.");
                break;
        }

    }
}
