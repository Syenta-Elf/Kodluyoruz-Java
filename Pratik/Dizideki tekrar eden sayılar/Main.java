import java.util.Arrays;
import java.util.Collections;

/**
 * Main
 */
public class Main {
     public static boolean isFind(int[] arr,int value)
    {
        for (int i : arr) {
            if(i== value)
            {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {2,6,12,2,6,89,0,12,2,7,9,1,85,90,75,36,55,32,56,150,89};
        int[] duplicate = new int[numbers.length];
        int counter=0;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
               if(i!=j && numbers[i]==numbers[j] )
                {
                    if(isFind(duplicate,numbers[i]))
                    {
                        break;
                    }
                    else
                    {
                        duplicate[counter++] = numbers[i];
                    }

                }
            }
        }
        for (int i : duplicate) {
            if(i!=0)
            {
                System.out.print("["+i+"] ");
            }
        }
        
    }
}