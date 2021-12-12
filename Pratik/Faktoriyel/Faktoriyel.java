import java.util.Scanner;

/**
 * Faktoriyel
 */
public class Faktoriyel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayi girin n :");
        int n = sc.nextInt();
        System.out.print("Bir sayi girin r :");
        int r = sc.nextInt();

        int fact1=1,fact2=1,fact3=1;

        for(int i=1;i<=n;i++) fact1*=i;
       
        for(int i=1;i<=r;i++) fact2*=i;

        for(int i=1;i<=n-r;i++) fact3*=i;

        System.out.println(fact1/(fact2*fact3));

        //pratik
        // for(int i=1;i<=n;i++)
        // {
        //     fact*=i;
        //     System.out.println(i+"."+fact);
        // }
    }
}