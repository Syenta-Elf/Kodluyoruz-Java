import javax.swing.text.html.HTMLEditorKit.Parser;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        //Pratik

        // int[] numbers = {1,2,3,4,5};
        // int total = 0;

        // for(int i = 0; i<numbers.length;i++)
        // {
        //     total += numbers[i];
        // }
        // System.out.println(total/numbers.length);
    
        //Ödev
        float[] numbers = new float[5];
        float total = 0;

        for(int i=1;i<numbers.length;i++)
        {
            numbers[i]=(1f/i);
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println((numbers.length-1)/total);
        


        

    }
}