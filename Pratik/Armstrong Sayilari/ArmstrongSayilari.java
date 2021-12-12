import java.util.Scanner;

 /**
  * ArmstrongSayilari
  */
 public class ArmstrongSayilari {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Bir sayi girin:");
         int n = sc.nextInt();
         int total=0;

         while(n%10!=0)
         {
             total += n%10;
             n/=10;
             if(n%10==0) n/=10;
         }
         System.out.println("Toplam = "+total);
     }
 }