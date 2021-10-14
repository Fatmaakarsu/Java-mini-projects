import java.util.Scanner;
public class SinifGecmeHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dersSayisi =5;
        System.out.println("enter your math grade : ");
        int math = input.nextInt();
        if(math<0 || math>100){
            math=0;
            dersSayisi--;

        }
        System.out.println("enter your physical grade : ");
        int physical = input.nextInt();
        if(physical<0 || physical>100){
            physical=0;
            dersSayisi--;

        }
        System.out.println("enter your chemical grade : ");
        int chemical = input.nextInt();
        if(chemical<0 || chemical>100){
            chemical=0;
            dersSayisi--;

        }
        System.out.println("enter your turkish grade : ");
        int turkish = input.nextInt();
        if(turkish<0 || turkish>100){
            turkish=0;
            dersSayisi--;

        }
        System.out.println("enter your music grade : ");
        int music = input.nextInt();
        if(music<0 || music>100){
            music=0;
            dersSayisi--;
        }

        float avarage = (math+physical+chemical+turkish+music)/dersSayisi;

        System.out.println("Ortalamanız :"+avarage);

        if(avarage>=50){
            System.out.println("Sınıfı geçtiniz");
        }
        else{
            System.out.println("Sınıfta kaldınız.");
        }
    }
}
