import java.util.Scanner;

public class RecursiveAsal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi girin:");
        int num = sc.nextInt();

        if(asalMi(num,2)) System.out.println(num+" Asal sayidir");
        else System.out.println(num+" Asal sayi degildir.");
    }

    int counter=0;
    public static boolean asalMi(int num ,int bolen)
    {
        if(num <= 2) return (num==2) ? true : false;
        if(bolen==num) return true;
        if(num%bolen==0) return false;
        



        return asalMi(num, bolen+1);
    }
}
