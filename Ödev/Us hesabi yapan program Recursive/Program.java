import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Taban sayisini girin: ");
        int taban = sc.nextInt();
        System.out.print("Us sayisini girin: ");
        int us = sc.nextInt();

        System.out.println("Sonuc:"+us(taban,us));
    }

    public static int us(int taban,int usSayisi)
    {
        if(usSayisi==0)
        return 1;

        return us(taban,usSayisi-1)*taban;
    }
}