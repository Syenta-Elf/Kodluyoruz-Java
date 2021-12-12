import java.util.Scanner;

    public class UcakBileti {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int mesafe,yas,gidisDonus;
            double tutar;

            System.out.println("Mesafeyi KM olarak girin.");
            mesafe = sc.nextInt();
           while(mesafe<0)
           {
               System.out.println("Hatali giris, tekrar girin:");
               mesafe = sc.nextInt();
           }
            System.out.println("Yasinizi giriniz:");
            yas = sc.nextInt();
            while(yas<0)
           {
               System.out.println("Hatali giris, tekrar girin:");
               yas = sc.nextInt();
           }

            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
            gidisDonus = sc.nextInt();
            tutar = mesafe * 0.10;

            if(12>yas) tutar -= tutar*0.5;
            else if(12<yas && 24>yas) tutar -= (tutar * 0.1);
            else if(65<yas) tutar-=(tutar*0.3);

            if(gidisDonus==2) tutar-=(tutar*0.2);
            System.out.println("Toplam Tutar ="+(tutar*2));
        }
    }