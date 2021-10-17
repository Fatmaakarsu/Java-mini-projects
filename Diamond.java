// Java'da döngüler kullanarak yıldızlar ile elmas yapı

import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısı giriniz ");
        int row = input.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=i;j<=row-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int a=row-1;a>=1;a--){
            for(int b=1;b<=row-a;b++){
                System.out.print(" ");
            }
            for(int c=1;c<=a*2-1;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
