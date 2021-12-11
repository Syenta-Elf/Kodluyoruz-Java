import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sayi1,sayi2;
        String islem;

        System.out.print("Sayi girin:");
        sayi1 = sc.nextInt();
        System.out.print("Sayi girin:");
        sayi2 = sc.nextInt();

        System.out.println("İstediginiz islemi giriniz: [+] [-] [*] [/]");
        islem = sc.next();

        switch(islem)
        {
            case "+":
            System.out.println("Sonuc = "+(sayi1+sayi2));
            break;
            case "-":
            System.out.println("Sonuc = "+(sayi1-sayi2));
            break;
            case "*":
            System.out.println("Sonuc = "+(sayi1*sayi2));
            break;
            case "/":
            System.out.println("Sonuc = "+(sayi1/sayi2));
            break;
            default:
            System.out.println("Yanlis islem girdiniz.");
        }
    
    }
}