import java.util.Scanner;

/**
 * ArtikYil
 */
public class ArtikYil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yil;

        System.out.print("Yıl Giriniz :");
        yil = sc.nextInt();

        if(yil%10==0 && yil%100==0)
            {
                if(yil%400==0)
                {
                    System.out.println(yil+" bir artık yıldır !");
                }
                else  System.out.println(yil+" bir artık yıl değildir !");
            }
        else if(yil%4==0) 
        {
            System.out.println(yil+" bir artık yıldır !");
        }
        else  System.out.println(yil+" bir artık yıldır !");
        
    }
}