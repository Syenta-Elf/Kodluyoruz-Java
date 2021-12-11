/**
 * NotOrtalamasi
 */
import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int math,music,physics,turkish,history,chem;

        System.out.println("Matematik Notu:");
        math = input.nextInt();

        System.out.println("Müzik Notu:");
        music = input.nextInt();

        System.out.println("Fizik Notu:");
        physics = input.nextInt();

        System.out.println("Türkçe Notu:");
        turkish = input.nextInt();

        System.out.println("Tarih Notu:");
        history = input.nextInt();

        System.out.println("Kimya Notu:");
        chem = input.nextInt();

        int result = (math+physics+turkish+chem+music+history)/6;

        if(result>60) System.out.println("Sınıfı geçtiniz.");
        else System.out.println("Sınıfta kaldınız");

        
    }
}