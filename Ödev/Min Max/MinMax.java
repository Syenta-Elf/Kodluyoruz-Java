import java.util.Scanner;

/**
 * MinMax
 */
public class MinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sayi,eb=0,ek=0;

        System.out.print("Bir sayi girin:");
        n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print(i+". Sayiyi giriniz:");
            sayi = sc.nextInt();

            if(eb<sayi)
            {
                eb=sayi;
            }

            if(ek>sayi) ek=sayi;
            else if (ek==0) ek=sayi;
        }
        System.out.println("En kucuk:"+ek);
        System.out.println("En buyuk:"+eb);
    }
}