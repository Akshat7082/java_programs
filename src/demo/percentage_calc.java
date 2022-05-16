package demo;
import java.util.Scanner;
public class percentage_calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of first subject :");
        int a = sc.nextInt();
        System.out.println("Enter marks of second subject :");
        int b = sc.nextInt();
        System.out.println("Enter marks of third subject :");
        int c = sc.nextInt();
        System.out.println("Enter marks of fourth subject :");
        int d = sc.nextInt();
        System.out.println("Enter marks of fifth subject :");
        int e = sc.nextInt();
        float f = (a+b+c+d+e)/5f;
        System.out.println("the percentage is ");
        System.out.println(f);


    }
}
