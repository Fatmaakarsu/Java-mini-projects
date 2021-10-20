/**
 * Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
 */

public class PrimeNumber {
    public static void main(String[] args) {
        
        for(int i=2;i<=100;i++){
            int kontrol=0;
            for(int k=2;k<i;k++){
                if(i%k==0){
                    kontrol++;
                    break;
                }
            }
            if(kontrol==0){
                System.out.print(i+" ");
            }
        }
    }
}
