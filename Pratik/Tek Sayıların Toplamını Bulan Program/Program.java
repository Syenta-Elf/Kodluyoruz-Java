import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pratik
        // int n;
        // do
        // {
        // System.out.println("Bir sayi girin");
        // n = sc.nextInt();
        // }while(n>0);
        
        //Odev
        int n,sum=0;
        do{
            System.out.print("Bir sayi girin :");
            n = sc.nextInt();

            if(n%2==0 && n%4==0) 
                sum+=n;
        }while(n%2==0);

        System.out.println("Toplam = "+sum);

    }
}