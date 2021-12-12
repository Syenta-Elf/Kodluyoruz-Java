import java.util.Scanner;

/**
 * MukemmelSayi
 */
public class MukemmelSayi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayi girin:");
        int n = sc.nextInt();
        int total =0;

        for(int i=1;i<n;i++)
        {
            if(n%i==0) total+=i;
        }
        if(total==n)
        {
            System.out.println(n+" Mükemmel sayıdır");
        }
        else
        System.out.println(n+" Mükemmel sayı değildir.");
    }
}