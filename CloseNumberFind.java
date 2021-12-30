import java.util.Arrays;
import java.util.Scanner;

/**
 * Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
 */
public class CloseNumberFind {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println(Arrays.toString(list));
        Scanner inp = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int numb = inp.nextInt();

        // Girilen elemanı listeye ekleyelim
        int a = list.length;
        int[] newArr = new int[a+1];
        int j=0;
        
        for(int i = 0; i<newArr.length; i++) {
            if(i==0) {
                newArr[i] = numb;
            }else {
                newArr[i] = list[j];
                j++;
            }
        }

        // listeyi sıralayalım
        Arrays.sort(newArr);
        
        // Girilen elemanın yerini bulalım.
        int index = Arrays.binarySearch(newArr, numb);

        // Elemanın sağındaki ve solundaki elemanlar bizden istenen şeylerdir.
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+ newArr[index-1] );
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+ newArr[index+1] );

    }
}
