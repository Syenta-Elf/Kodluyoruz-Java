import java.util.Scanner;

/**
 * ATM
 */
public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user,pass ;
        int right=3;
        int balance = 1500,price;

        while(right>0)
        {
            System.out.print("Kullanici adi:");
            user = sc.nextLine();
            System.out.print("Sifre: ");
            pass = sc.nextLine();
            
            

            if(user.equals("patika")&&pass.equals("dev123"))
            {
                right=0;
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                int select = sc.nextInt();
                
                switch(select)
                {
                    case 1:
                    System.out.print("Para miktarı : ");
                    price = sc.nextInt();
                    balance += price;
                    System.out.println("Bakiyeniz : " + balance);
                    break;

                    case 2:
                    System.out.print("Para miktarı : ");
                    price = sc.nextInt();
                    if (price > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= price;
                        System.out.println("Bakiyeniz : " + balance);
                    }
                    break;

                    case 3:
                    System.out.println("Bakiyeniz : " + balance);
                    break;

                    case 4:
                    System.out.println("Tekrar görüşmek üzere.");
                    break;
                }
            }
            else
            {
                if(right>0)
                {
                    right--;
                    System.out.print("Girdiginiz bilgiler yanlis.Tekrar deneyin.Kalan Hakkiniz:"+right+"\n");
                }
                else
                {
                    System.out.print("Girdiginiz bilgiler yanlis.Hesabiniz bloke oldu.");
                }
            }
        }
        
        

    }
}