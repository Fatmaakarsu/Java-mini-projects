/**
 * Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program
 */
import java.util.Scanner;
public class PalindromNumbers {

    static boolean palindrom(int number){
        int temp=number, reverseNumber=0, lastNumber;
        while (temp!=0) {
            lastNumber=temp%10;
            reverseNumber= reverseNumber*10 +lastNumber;
            temp=temp/10;

        }
        if(number==reverseNumber){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi= input.nextInt();
        System.out.println(palindrom(sayi));
    }
}
