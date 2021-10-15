/**Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 * */
import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        int sayi = input.nextInt();

        System.out.print("Üs : ");
        int us = input.nextInt();

        int total=1;

        for(int i=1;i<=us;i++){
            total*=sayi;
        }

        System.out.println(sayi+" üzeri "+us+" = "+total);
    }
}
