import java.util.Scanner;
import java.lang.Math;
public class Hipotenus {

    public static void main(String[] args) {
        
        double kisaKenar1,kisaKenar2,hipotenus;
        Scanner input = new Scanner(System.in);
        System.out.println("Kisa kenar girin:");
        kisaKenar1 = input.nextDouble();
        System.out.println("Diger kisa kenari girin:");
        kisaKenar2 = input.nextDouble();

        hipotenus = Math.sqrt(Math.pow(kisaKenar1, 2)+Math.pow(kisaKenar2, 2));

        System.out.println("Hipotenus: "+hipotenus);
        System.out.println("Cevresi:"+(hipotenus+kisaKenar1+kisaKenar2));
        System.out.println("Alani:"+((kisaKenar1*kisaKenar2)/2));

    }
}