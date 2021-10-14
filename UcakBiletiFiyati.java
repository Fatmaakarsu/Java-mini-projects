import java.util.Scanner;
public class UcakBiletiFiyati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();

        System.out.print("Yolculuk tipini seçiniz 1/2 : ");
        int tip = input.nextInt();

        if(mesafe<0 || age<0 || tip<0){
            System.out.println("Hatalı veri girdiniz");
        }
        
        float tutar = mesafe*0.1f;
        if(tip ==2){
            if(age<12){
                float indirimOrani = tutar*0.50f;
                float indirimli = (tutar-indirimOrani);
                float ikiliindirim = indirimli*0.2f;
                float sonuc = indirimli-ikiliindirim;
                System.out.println("Toplam tutar : "+(sonuc)*2);
                
            }
            else if(age>=12 && age<24){
                float indirimOrani = tutar*0.10f;
                float indirimli = (tutar-indirimOrani);
                float ikiliindirim = indirimli*0.2f;
                float sonuc = indirimli-ikiliindirim;
                System.out.println("Toplam tutar : "+(sonuc)*2);
            }
            else if(age>65){
                float indirimOrani = tutar*0.30f;
                float indirimli = (tutar-indirimOrani);
                float ikiliindirim = indirimli*0.2f;
                float sonuc = indirimli-ikiliindirim;
                System.out.println("Toplam tutar : "+(sonuc)*2);
               
            }
            else{
                System.out.println("Toplam tutar : "+tutar);
            }
        }
        else if(tip==1){
            if(age<12){
                float indirimOrani = tutar*0.50f;
                System.out.println("Toplam tutar : "+(tutar-indirimOrani));
            }
            else if(age>=12 && age<24){
                float indirimOrani = tutar*0.10f;
                System.out.println("Toplam tutar : "+(tutar-indirimOrani));
            }
            else if(age>65){
                float indirimOrani = tutar*0.30f;
                System.out.println("Toplam tutar : "+(tutar-indirimOrani));
            }
            else{
                System.out.println("Toplam tutar : "+tutar);
            }
        }

    }
}

