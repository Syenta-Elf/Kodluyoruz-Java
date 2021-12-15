/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,3,-32,64,23,60,35,-20};

        int enBuyuk=numbers[0],enKucuk=numbers[0],enBuyukYakin=numbers[0],enKucukYakin=numbers[0];

        
        for(int i=1;i<numbers.length;i++)
        {
            if(enBuyuk<numbers[i])
            {
                enBuyukYakin = enBuyuk;
                enBuyuk = numbers[i];
            }
            if(numbers[i]!=enBuyuk && enBuyukYakin<numbers[i])
            {
                enBuyukYakin=numbers[i];
            }
            if(enKucuk>numbers[i])
            {
                enKucuk = numbers[i];
            }
            if(numbers[i]!=enKucuk && enKucukYakin>numbers[i])
            {
                enKucukYakin = numbers[i];
            }
            

        }

        System.out.println("En büyük:"+enBuyuk);
        System.out.println("En büyüğe yakın olan:"+enBuyukYakin);
        System.out.println("En küçük:"+enKucuk);
        System.out.println("En küçüğe yakin:"+enKucukYakin);
    }
}