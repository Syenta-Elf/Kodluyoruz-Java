import java.util.Scanner;

/**
 * TersUcgen
 */
public class TersUcgen {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayi girin:");
        int n = sc.nextInt();

        for(int i=n-1 ; 0<=i;i--)
        {
            for(int j=0;j < (n - i); j++ )
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}