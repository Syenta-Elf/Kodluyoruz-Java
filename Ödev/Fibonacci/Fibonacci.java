import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c=0;

        System.out.print("Bir sayi girin:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            
            c=a+b;
            System.out.print(c+"   ");
            a=b;
            b=c;
        }

    }
}