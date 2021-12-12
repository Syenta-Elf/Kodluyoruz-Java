import java.util.Scanner;


/**
 * FibonacciMetod
 */
public class FibonacciMetod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayi girin:");
        int sayi = sc.nextInt();

        System.out.println(Fibonacci(sayi));
    }

    public static int Fibonacci(int num)
    {
        if(num == 1 || num == 2) return 1;
        
        return Fibonacci(num-1)+Fibonacci(num-2);
    }
}