import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, ebob, ekok;
        System.out.print("N1 Sayısını Girin: ");
        int smallNumber = scan.nextInt();
        n1 = smallNumber;
        System.out.print("N2 Sayısını Girin: ");
        int bigNumber = scan.nextInt();
        n2 = bigNumber;

        if (smallNumber > bigNumber) {
            n1 = bigNumber;
            n2 = smallNumber;
        }
        System.out.println("-----------------------------");
        System.out.println("N1 Sayısı: " + n1);
        System.out.println("N2 Sayısı: " + n2);

        for (int i = n1;; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
        }

        System.out.println("Ebob : "+ebob);

        for(int j=n1*n2;;j--){
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
        }

        System.out.println("Ekok : "+ekok);


    }
}
