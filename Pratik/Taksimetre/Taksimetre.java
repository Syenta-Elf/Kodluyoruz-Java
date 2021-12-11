import java.util.Scanner;
public class Taksimetre {
        public static void main(String[] args) {
            double kmBasina=2.20,mesafe;
            Scanner input = new Scanner(System.in);

            System.out.println("Gidilen mesafeyi KM cinsinden giriniz");
            mesafe = input.nextDouble();

            if((kmBasina*mesafe)+10<20) {
                System.out.println("Tutar : 20 TL.");}
            else {
                System.out.println("Tutar"+((kmBasina*mesafe)+10 + "TL"));}
        }
}