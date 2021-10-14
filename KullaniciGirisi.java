import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String username,password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        username = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if(username.equals("patika")&&password.equals("java123")){
            System.out.println("Giriş yapıldı");
        }
        else{
            System.out.println("Bilgileriniz yanlış.Şirenizi sıfırlamak ister misiniz ? E/H ");
            String yanit = inp.nextLine();
            if(yanit.equals("E")){
                System.out.print("Yeni oluşturacağınız şifreyi giriniz : ");
                String yeni = inp.nextLine();
                if(yeni.equals(password) || yeni.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifre oluşturuldu");
                }
            }
            else if(yanit.equals("H")){
                System.out.println("Çıkış yapıldı");
            }
            else{
                System.out.println("Yanlış karakter girdiniz");
            }
        }

    }
}