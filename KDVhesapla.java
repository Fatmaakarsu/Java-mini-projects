import java.util.Scanner;
public class KDVhesapla {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz fiyatı giriniz : ");
        int price = input.nextInt();
        
        if(price<=1000){
            System.out.println("KDV'li fiyat : "+price*1.18);
            System.out.println("KDV tutarı : "+price*0.18);
        }
        else{
            System.out.println("KDV'li fiyat : "+price*1.08);
            System.out.println("KDV tutarı : "+price*0.08);
        }

    }
}
    

