package demo;
import java.util.*;

public class hackkerrank_02 {
    public static void main(String[] args) {
        //n is odd print wierd
        // n is even range 2 to 5 print not wierd
        // n is even range 6 to 20 print wierd
        // n is even greater than 20 not wierd
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2 != 0){
            System.out.println("Weird");
        }
        if (a%2 == 0){
            if((5>a) && (a>2))
            {
                System.out.println("Not weird");
            }
            else if((20>a) && (a>6)){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not weird");
            }

        }
    }
}
