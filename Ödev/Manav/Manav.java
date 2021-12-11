import java.util.Scanner;

/**
 * Manav
 */
public class Manav {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double elma=3.67,armut=2.14,domates=1.11,muz=0.95,patlican=5.0,toplam=0;

        System.out.print("Elma Kac Kilo :");
        elma *= sc.nextDouble();
        
        System.out.print("Armut Kac Kilo :");
        armut *= sc.nextDouble();
        
        System.out.print("Domates Kac Kilo :");
        domates *= sc.nextDouble();
        
        System.out.print("Muz Kac Kilo :");
        muz *= sc.nextDouble();
        
        System.out.print("Patlican Kac Kilo :");
        patlican *= sc.nextDouble();

        toplam = elma + armut + domates + muz + patlican;
        System.out.println("Toplam : "+toplam);
       
    }
}