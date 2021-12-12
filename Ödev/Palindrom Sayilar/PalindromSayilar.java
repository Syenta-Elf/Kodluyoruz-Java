import java.util.Scanner;


/**
 * PalindromSayilar
 */
public class PalindromSayilar {
    public static boolean Palindrom(int num)
    {
        int temp = num, reverseNumber=0,lastNumber;

        while(temp>0)
        {
            lastNumber = temp%10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            temp/=10;
        }

        if(num==reverseNumber) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sayi gir");
        int sayi = sc.nextInt();
        if(Palindrom(sayi))
        {
            System.out.println(sayi+" palindrom sayidir.");
        }
        else System.out.println(sayi+" palindrom degildir.");


    }

    
}