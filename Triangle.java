/**
 * Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Satır sayısı giriniz : ");
        int satir = inp.nextInt();

        
        for(int i=1;i<=satir;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(satir-i+1)*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
