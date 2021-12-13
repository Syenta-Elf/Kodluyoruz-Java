import java.util.Scanner;

/**
 * DeseneGore
 */
public class DeseneGore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N Sayisi: ");
        int num = sc.nextInt();
        deseneGore(num , 0);

    }

    public static int deseneGore(int num0 , int num1 )
    {
        System.out.print(num0+"\t");
        if(num0 > 0)
        {
            num0-=5;
            return deseneGore(num0, num1+1 );
        }
        else
        {
            for(int i=0;i<=(num1-1);i++)
            {   num0+=5;
                System.out.print(num0+"\t");
            }            
            return 1;
        }
        
        
    }
}