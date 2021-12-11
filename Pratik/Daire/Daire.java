
import java.util.Scanner;
public class Daire {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r,a;
        final double pi = 3.14;

        System.out.print("Yari capi girin:");
        r = input.nextDouble();

        System.out.print("Dilim uzunlugunu girin:");
        a = input.nextDouble();

        System.out.println("Alani: "+(r*pi*r));
        System.out.println("Cevresi: "+(r*pi*2));
        System.out.println("Dilim alani: "+((pi*(r*r)*a)/360));
    }
}