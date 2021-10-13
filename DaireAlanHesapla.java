
import java.util.Scanner;
public class DaireAlanHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Formül : (𝜋 * (r*r) * 𝛼) / 360
        System.out.println("Dairenin merkes açısının derecesini girin : ");
        double a = input.nextDouble();
        System.out.println("Dairenin yarıçapını girin : ");
        double r = input.nextDouble();

        float pi = 3.14f;

        double alan = (pi*(r*r)*a)/360;

        System.out.print("Dairenin alanı : "+alan);
    }
}

