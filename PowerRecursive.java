import java.util.Scanner;
public class PowerRecursive {

    static int powerRecursive(int base,int pow){
        if(base==1 || pow==0){
            return 1;
        }
        if(pow==1){
            return base;
        }
        return base*powerRecursive(base, pow-1) ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int pow = input.nextInt();
        System.err.println("Sonuç : "+powerRecursive(base, pow));

    }
}
