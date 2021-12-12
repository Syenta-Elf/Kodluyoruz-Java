import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pratik
        System.out.print("Sayi giriniz :");
        int n= sc.nextInt();

        for(int i=0;i<=n;i++)
        {
            if(i%2==0) System.out.println(i);
        }
        //Odev
        System.out.println("******************");
        int counter=0,sum=0;
        for(int j=0;j<=n;j++)
        {
            if(j%3==0 && j%4==0)
            {
                System.out.println(j);
                sum+=j;
                counter++;
            }  
        }
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: "+(sum/counter));
    }
}