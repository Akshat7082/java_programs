package demo;
import java.io.InputStream;
import java.util.Scanner;

public class tut3 {
    public static void main(String[] args) {
        System.out.println("hello world");
        String str = "akshat kumar sharma";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a= sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
    }
}
