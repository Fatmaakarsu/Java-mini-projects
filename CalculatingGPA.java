/**
 * CalculatingGPA
 */
import java.util.Scanner;
public class CalculatingGPA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your math grade : ");
        int math = input.nextInt();
        System.out.println("enter your physical grade : ");
        int physical = input.nextInt();
        System.out.println("enter your chemical grade : ");
        int chemical = input.nextInt();
        System.out.println("enter your turkish grade : ");
        int turkish = input.nextInt();
        System.out.println("enter your history grade : ");
        int history = input.nextInt();
        System.out.println("enter your music grade : ");
        int music = input.nextInt();

        float gpa = (math+physical+chemical+turkish+history+music)/6;

        System.out.println("Your GPA : "+gpa);
    }
}