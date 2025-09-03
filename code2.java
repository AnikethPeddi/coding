import java.util.*;
public class Dai1 {
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter No of Students ");
            int x = scan.nextInt();
            String[] ar = new String[x];
            int[] arr = new int[x];
            scan.nextLine();
            int i;
            for (i = 0; i < x; i++) {
                System.out.println("Enter Details of Student:" +i);
                System.out.println("Enter Name:");
                ar[i]=scan.nextLine();
                System.out.println("Enter Marks:");
                arr[i]=scan.nextInt();
                scan.nextLine();

            }
            System.out.println("Total Students :" +i);
            int a=0;
            for (int ii = 0; ii < x; ii++) {
                a = arr[ii]+a;
                
            }
            System.out.println("Average Marks : " +((double)a/x));
            System.out.println("");
            int b=arr[0];
            for (int ii = 0; ii < x; ii++) {
                if(b > arr[ii]){
                    b=arr[ii];
                }
                
            }
            System.out.println("Lowest Marks:" +b);
            int c=arr[0];
            for (int ii = 0; ii < x; ii++) {
                if(c < arr[ii]){
                    c=arr[ii];
                }
                
            }
            System.out.println("Highest Marks:" +c);
            System.out.println("");
            int d=0,e=0;
            for (int ii = 0; ii < x; ii++) {
                if (arr[ii]>=40) {
                    d++;
                }
                else{
                    e++;
                }
                
            }
            double q=(((double)d/x)*100);
            double w=(((double)e/x)*100);
            System.out.println("Pass Percentage: "+q + "%");
            System.out.println("Fail Percentage: "+w+ "%");

            System.out.println("");
            System.out.println("Lists of Students: ");
            for (int ii = 0; ii < x; ii++) {
                System.err.println(ar[ii] +" - "+ arr[ii]);
            }
    }
    
}
