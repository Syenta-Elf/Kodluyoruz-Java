import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayi girin:");
        int n = sc.nextInt();
        int k4 = 1,k5=1;
       
        //pratik
        // while(k<n)
        // {
        //     System.out.println(k);
        //     k*=2;
        // }

        //ödev

        while(k4<n || k5<n)
        {
            if(k4<n) System.out.print("k4 :"+k4);
            if(k5<n) System.out.print(" k5 :"+k5+"\n");
            k4*=4;
            k5*=5;
        }


    }
}