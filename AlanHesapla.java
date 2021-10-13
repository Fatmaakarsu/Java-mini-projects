import java.util.Scanner;
public class AlanHesapla {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üçgeninizin kenarlarını giriniz");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        
        // 𝑢 = (a+b+c) / 2
        float u = (a+b+c)/2;
        
        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı : "+alan);

    }
    
}
