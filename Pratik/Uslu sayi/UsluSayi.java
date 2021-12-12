import java.util.Scanner;

/**
 * UsluSayi
 */
public class UsluSayi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayi girin:");
        int n= sc.nextInt();
        System.out.print("Us girin:");
        int us=sc.nextInt();
        int carpan=1;

        for(int i=0;i<us;i++)
        {
            carpan *=n;
        }

        System.out.println("Sonuc"+carpan);
    }
}