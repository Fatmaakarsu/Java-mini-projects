import java.util.Scanner;
public class HavayaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Hava sıcaklığını giriniz");
        int heat = inp.nextInt();

        if(heat<5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(heat>=5 && heat<10){
            System.out.println("Sinemaya gidebilirsin");
        }
        else if(heat>=10 && heat<=15){
            System.out.println("Sinemaya veya Pikniğe gidebilisin");
        }
        else if(heat>15 && heat<25){
            System.out.println("Pikniğe gidebilirsin.");
        }
        else{
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}

