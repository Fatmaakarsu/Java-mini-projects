import java.util.Scanner;
public class KuvvetBulma {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        a = input.nextInt();

        System.out.println("4 ün kuvvetleri");
        for(int i=1;i<=a;i*=4){
            System.out.println(i);
        }

        System.out.println("5 in kuvvetleri");
        for(int i=1;i<=a;i*=5){
            System.out.println(i);
        }



    
    }
}
