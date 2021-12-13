import java.util.Scanner;

/**
 * GelismisHesapMakinesi
 */
public class GelismisHesapMakinesi {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("1- Toplama İşlemi\n"
        + "2- Çıkarma İşlemi\n"
        + "3- Çarpma İşlemi\n"
        + "4- Bölme işlemi\n"
        + "5- Üslü Sayı Hesaplama\n"
        + "6- Faktoriyel Hesaplama\n"
        + "7- Mod Alma\n"
        + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
        + "0- Çıkış Yap\n"
        + "Islem secin:");
        int num = sc.nextInt();
        gelismisHesapMakinesi(num);
    }

    public static void gelismisHesapMakinesi(int num)
    {
        
        switch(num)
        {
            case 0:
            break;

            case 1:
            topla();
            break;

            case 2:
            cikar();
            break;

            case 3:
            carp();
            break;

            case 4:
            bolum();
            break;

            case 5:
            us();
            break;

            case 6:
            System.out.print("Bir sayi girin:");
            int num1 = sc.nextInt();
            System.out.println(factorial(num1));
            break;

            case 7:
            mod();
            break;

            case 8:
            dikdortgenAlanVeCevre();
            break;

            default:
            System.out.println("Hatali giris yaptiniz.");

        }
    }
    public static void topla()
    {  
        System.out.print("Kac sayiyla islem yapacaksiniz:");
        int tane = sc.nextInt();
        int toplam=0;
        while(tane>0)
        {
            System.out.print("Sayi girin:");
            int num = sc.nextInt();
            toplam+=num;
            tane--;
        }
        System.out.print("Sonuc:"+toplam);
    }

    public static void cikar()
    {
        System.out.print("Kac sayiyla islem yapacaksiniz:");
        int tane = sc.nextInt();
        int sonuc =sc.nextInt();
        while(tane-1>0)
        {
            System.out.print("Sayi girin:");
            int num = sc.nextInt();
            sonuc-=num;
            tane--;
        }
        System.out.print("Sonuc:"+sonuc);
    }

    public static void carp()
    {
        System.out.print("Kac sayiyla islem yapacaksiniz:");
        int tane = sc.nextInt();
        int sonuc =1;
        while(tane>0)
        {
            System.out.print("Sayi girin:");
            int num = sc.nextInt();
            sonuc*=num;
            tane--;
        }
        System.out.print("Sonuc:"+sonuc);
    }

    public static void bolum()
    {
        System.out.print("Kac sayiyla islem yapacaksiniz:");
        int tane = sc.nextInt();
        System.out.print("Bolunecek sayi:");
        double sonuc =sc.nextDouble();

        while(tane-1>0)
        {
            System.out.print("Sayi girin:");
            double num = sc.nextDouble();
            if(num>0)
            {
                sonuc/=num;
                tane--;
            }
            else
            {
                System.out.println("Bolen 0 olamaz.");
            }
            
        }   
        System.out.print("Sonuc:"+sonuc);
    }
    public static void us()
    {
        System.out.print("Taban sayiyi girin:");
        int taban= sc.nextInt();
        System.out.print("Us sayiyi girin:");
        int us = sc.nextInt();

        System.out.println(Math.pow(taban, us));
    }

    public static int factorial(int num)
    {
        if(num==0)
        return 1;
        
        return factorial(num-1)*num;
    }

    public static void mod()
    {
        System.out.print("Bolunecek sayiyi girin:");
        int num1 = sc.nextInt();
        System.out.print("Bolen sayiyi girin:");
        int num2 = sc.nextInt();

        System.out.println((num1%num2));
    }

    public static void dikdortgenAlanVeCevre()
    {
        System.out.print("Kenar uzunlugu gir");
        int kenar1= sc.nextInt();
        System.out.print("Kenar uzunlugu gir");
        int kenar2= sc.nextInt();

        System.out.println("Alan:"+(kenar1*kenar2));
        System.out.println("Cevre"+((kenar1+kenar2)*2));
    }
}