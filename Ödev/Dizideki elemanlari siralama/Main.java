import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Dizinin boyutu: ");
        int[] list = new int[sc.nextInt()];
        System.out.println("Dizinin elemanlarını girin:");

        for(int i=0;i<list.length;i++)
        {
            System.out.print((i+1)+". Elemani:");
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);

        for (int i : list) {
            System.out.print("["+i+"] ");
        }

    }
}