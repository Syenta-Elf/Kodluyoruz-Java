/**
 * Main
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String(); 

        System.out.print("Kelime girin: ");
        str = sc.nextLine();
        if(isPalindrome(str))
        {
            System.out.println("Palindromik Kelime'dir.");
        }
        else
        System.out.println("Palindromik Kelime değildir.");

    }

    public static boolean isPalindrome(String str)
    {
        String  reverse="";
        for(int i=str.length()-1;0<=i;i--)
        {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse))
            return true;
        else
            return false;
    }
}