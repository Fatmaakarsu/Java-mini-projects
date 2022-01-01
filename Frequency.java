import java.util.Arrays;

/**
 * Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
 */
public class Frequency {

    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("Tekrar Sayıları");
        int sayac =0;
        int[] yedekDizi= new int[dizi.length];

        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi.length;j++){
                if(dizi[i]==dizi[j]){
                    sayac++;
                }
            }
            System.out.println(dizi[i]+" sayısı "+sayac+" kere tekrar edildi.");
            sayac=0;
        }
    }
}
