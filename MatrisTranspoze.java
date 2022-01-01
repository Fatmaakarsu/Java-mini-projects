import java.util.Arrays;

/**
 * Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
 */
public class MatrisTranspoze {
    public static void main(String[] args) {
        int[][] matris = {{2,3,4},{5,6,4}};
        int[][] matrisTranspoze = new int[3][2];

        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[0].length;j++){
                matrisTranspoze[j][i]=matris[i][j];
            }
        }

        System.out.println("Matris :");
        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[0].length;j++){
               System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpoze :");
        for(int i=0;i<matrisTranspoze.length;i++){
            for(int j=0;j<matrisTranspoze[0].length;j++){
               System.out.print(matrisTranspoze[i][j]+" ");
            }
            System.out.println();
        }
    }
}
