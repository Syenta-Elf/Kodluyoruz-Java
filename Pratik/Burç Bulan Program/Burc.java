import java.util.Scanner;

public class Burc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month,day;
        System.out.print("Dogdunuz ayi sayiyla giriniz:");
        month = sc.nextInt();
        System.out.print("Dogdunuz ayi sayiyla giriniz:");
        day = sc.nextInt();
        if(month == 1)
        {
            if(day<=21) System.out.println("Oglak");
            if(day>=22) System.out.println("Kova");
        }
        else if(month == 2)
        {
            if(day<=19) System.out.println("Kova");
            if(day>=20) System.out.println("Balik");
        }
        else if(month == 3)
        {
            if(day<=20) System.out.println("Balik");
            if(day>=21) System.out.println("Koc");
        }
        else if(month == 4)
        {
            if(day<=20) System.out.println("Koc");
            if(day>=21) System.out.println("Boga");
        }
        else if(month == 5)
        {
            if(day<=21) System.out.println("Boga");
            if(day>=22) System.out.println("İkizler");
        }
        else if(month == 6)
        {
            if(day<=22) System.out.println("İkizler");
            if(day>=23) System.out.println("Yengec");
        }
        else if(month == 7)
        {
            if(day<=22) System.out.println("Yengec");
            if(day>=23) System.out.println("Aslan");
        }
        else if(month == 8)
        {
            if(day<=22) System.out.println("Aslan");
            if(day>=23) System.out.println("Basak");
        }
        else if(month == 9)
        {
            if(day<=22) System.out.println("Basak");
            if(day>=23) System.out.println("Terazi");
        }
        else if(month == 10  )
        {
            if(day<=22) System.out.println("Terazi");
            if(day>=23) System.out.println("Akrep");
        }
        else if(month == 11  )
        {
            if(day<=21) System.out.println("Akrep");
            if(day>=22) System.out.println("Yay");
        }
        else if(month == 12  )
        {
            if(day<=21) System.out.println("Yay");
            if(day>=22) System.out.println("Oglak");
        }



    }    
}