import java.util.Scanner;

public class BuyuktenKucuge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,enb;
        
        System.out.println("3 sayi girin:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("*****Buyukten kucuge****");
        if(a>b && a>c)
        {
            if(b>c) System.out.print("1. "+a+"\n2. "+b+"\n3. "+c);
            else System.out.print("1. "+a+"\n2. "+c+"\n3. "+b);
        }
        else if(b>a && b>c)
        {
            if(a>c) System.out.print("1. "+b+"\n2. "+a+"\n3. "+c);
            else System.out.print("1. "+b+"\n2. "+c+"\n3. "+a);
        }

        else if(c>a && c>b)
        {
            if(a>b) System.out.print("1. "+c+"\n2. "+a+"\n3. "+b);
            else System.out.print("1. "+c+"\n2. "+b+"\n3. "+a);
        }

        System.out.println("\n*****Kucuken buyuge****");

        if(a<b && a<c)
        {
            if(b<c) System.out.print("1. "+a+"\n2. "+b+"\n3. "+c);
            else System.out.print("1. "+a+"\n2. "+c+"\n3. "+b);
        }
        else if(b<a && b<c)
        {
            if(a<c) System.out.print("1. "+b+"\n2. "+a+"\n3. "+c);
            else System.out.print("1. "+b+"\n2. "+c+"\n3. "+a);
        }
        else if(c<a && c<b)
        {
            if(a<b) System.out.print("1. "+c+"\n2. "+a+"\n3. "+b);
            else System.out.print("1. "+c+"\n2. "+b+"\n3. "+a);
        }
        
    }
}