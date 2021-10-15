import java.util.Scanner;
public class ArmstrongSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, digitValue, result = 0;

        System.out.print("Sayı giriniz : ");
        n = input.nextInt();

        while (n != 0) {
            digitValue = n % 10;
            result += digitValue;
            n /= 10;
        }

        System.out.printf("Basamak Sayılarının Toplamı: %s", result);

    }
}
