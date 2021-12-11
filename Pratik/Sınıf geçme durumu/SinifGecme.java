import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {
        int math,chem,pyhsics,turk,music,sayac=5;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Matematik Notu:");
        math = sc.nextInt();
        if(math>100 || math<0){ math=0; sayac--;}
        
        System.out.print("Kimya Notu:");
        chem = sc.nextInt();
        if(chem>100 || chem<0) {chem=0; sayac--;}
        
        System.out.print("Fizik Notu:");
        pyhsics = sc.nextInt();
        if(pyhsics>100 || pyhsics<0) {pyhsics=0;sayac--;}

        System.out.print("Türkçe Notu:");
        turk = sc.nextInt();
        if(turk>100 || turk<0) {turk=0;sayac--;}
        
        System.out.print("Music Notu:");
        music = sc.nextInt();
        if(music>100 || music<0) {music=0;sayac--;}

        int toplam = math + chem + pyhsics + turk + music;

        if((toplam/sayac)>55) System.out.println((toplam/sayac)+"ile gectiniz.");
        else System.out.println((toplam/sayac)+"ile kaldiniz");
    }
}