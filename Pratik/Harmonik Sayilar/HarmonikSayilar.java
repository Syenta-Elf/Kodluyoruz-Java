import java.util.Scanner;

/**
 * HarmonikSayilar
 */
public class HarmonikSayilar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayi giriniz:");
        double n = sc.nextDouble();
        double total=0;

        for(double i=1;i<=n;i++)
        {
            System.out.print(1/i+"\t" );
            total += (1/i);
        }

        System.out.println("\ntotal:"+total);
    }
}