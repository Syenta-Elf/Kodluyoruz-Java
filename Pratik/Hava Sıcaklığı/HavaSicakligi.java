import java.util.Scanner;

/**
 * HavaSicakligi
 */
public class HavaSicakligi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Sicakliği giriniz:");
        int sicaklik = sc.nextInt();

        if(sicaklik>25) System.out.println("Yüzmeye gidebilirsin.");
        else if(sicaklik<=25 && sicaklik>=15) System.out.println("Pikniğe gidebilirsin");
        else if(sicaklik<=15 && sicaklik>=5) System.out.println("Sinemaya gidebilirsin");
        else System.out.println("Kayağa gidebilirsin");
    }
}