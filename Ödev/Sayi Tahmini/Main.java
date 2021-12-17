import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int wrong = 5;
       
        
        int n = -1;
        
        int number = rnd.nextInt(100);
        System.out.println("Sayi "+number);

        while (wrong>0 && n!=number) {
            System.out.print("Tahmin ettiğiniz sayiyi girin:");
            n = sc.nextInt();


            if(n==number)
            {
                System.out.println("Tahmininiz doğru!");
            }

            else
            {
                wrong--;
                if(number>n)
                {
                    System.out.println("Tahmininiz gizli sayidan küçük. " +wrong+" hakkiniz kaldi.");
                }
                else if(n>number)
                {
                    System.out.println("Tahmininiz gizli sayidan büyük. " +wrong+" hakkiniz kaldi.");
                }
                
                if(wrong==0)
                {
                    System.out.println("Tahminleriniz yanlis,hakkiniz kalmadi!");
                    break;
                }
            }
            
        }

        
    }
}