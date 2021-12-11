import java.util.Scanner;


public class KullaniciGirisi {
    public static void main(String[] args) {
        String user,password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanici adi :");
        user = sc.nextLine();
        System.out.print("Sifre :");
        password = sc.nextLine();
        
        if(user.equals("patika")&&password.equals("patika"))
        {
            System.out.println("Basariyla giris yaptiniz.");
        }
        if(!user.equals("patika")) 
        {
            System.out.println("Kullanici adi yanlis.");
        }
        if(!password.equals("patika"))
        {
            System.out.println("Sifreniz yanlis.");
        }
        
        
    }
    
}