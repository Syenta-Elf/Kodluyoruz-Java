import java.util.Scanner;

public class KDVTutari {

    public static void main(String[] args) {
        double tutar = 0,kdv1=1.18,kdv2=1.08;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Tutari girin:");
        tutar = input.nextDouble();

        if(tutar<=1000) 
            {tutar *= kdv1; }

        else 
            {tutar *= kdv2;}

        System.out.println("KDV : "+tutar);
    }
}