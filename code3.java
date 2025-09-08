
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        System.out.println("Enter 3 numbers");

        if (n1 < n2 && n2 < n3) {
            //if(n2<n3){
            System.out.println("Increasing Order");
            //}
        } else if (n1 > n2 && n2 > n3) {
            //               if(n2>n3){
            System.out.println("Decreasing Order");
        } else {

            System.out.println("Either Increasing or Decreasing");

        }

    }
}
