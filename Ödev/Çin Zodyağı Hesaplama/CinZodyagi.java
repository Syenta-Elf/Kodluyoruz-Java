import java.util.Scanner;

/**
 * CinZodyagi
 */
public class CinZodyagi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yil,kalan;

        System.out.println("Dogum yilinizi girin:");
        yil = sc.nextInt();

        kalan = yil%12;

        switch(kalan)
        {
            case 0:
            System.out.println("Maymun");
            break;

            case 1:
            System.out.println("Horoz");
            break;

            case 2:
            System.out.println("Kopek");
            break;

            case 3:
            System.out.println("Domuz");
            break;

            case 4:
            System.out.println("Fare");
            break;

            case 5:
            System.out.println("Okuz");
            break;

            case 6:
            System.out.println("Kaplan");
            break;

            case 7:
            System.out.println("Tavsan");
            break;

            case 8:
            System.out.println("Ejderha");
            break;

            case 9:
            System.out.println("Yilan");
            break;

            case 10:
            System.out.println("At");
            break;

            case 11:
            System.out.println("Koyun");
            break;

            
        }

    }
}