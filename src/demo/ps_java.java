package demo;
import java.util.Scanner;
public class ps_java {
    // question 1
    /*public static void main(String[] args) {
        System.out.println("write your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("hello "+name+"!");
    }*/
    //question 2
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
