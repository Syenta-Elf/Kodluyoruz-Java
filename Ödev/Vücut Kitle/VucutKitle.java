import java.util.Scanner;

/**
 * VucutKitle
 */
public class VucutKitle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy,kilo;

        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz:");
        kilo = input.nextDouble();

        System.out.print("Vücut Kitle İndeksiniz: "+(kilo/(boy*boy)));
    }
}