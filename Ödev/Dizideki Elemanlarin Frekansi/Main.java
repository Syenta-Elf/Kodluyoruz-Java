import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dizi uzunluğunu girin:");
        int[] list = new int[sc.nextInt()];
        int[] duplicate = new int[list.length];
        int[] fr = new int[list.length];
        int visited = -1;

        

        for(int i=0;i<list.length;i++)
        {
            System.out.print((i+1)+". Eleman:");
            list[i] = sc.nextInt();
        }
      
        for(int i=0;i<list.length;i++)
        {
            int count = 1;  
            for(int j=i+1;j<list.length;j++)
            {
                
                if(list[i]==list[j])
                {
                    duplicate[i]=list[i];
                   count++;
                   fr[j]=visited;
                }
            }
            if(fr[i] != visited)  
            fr[i] = count;  
            

        }

        for(int i = 0; i<duplicate.length;i++)
        {
            if(fr[i]!=-1 && duplicate[i]!=0) System.out.println(duplicate[i]+" sayısı "+ fr[i]+" kere tekrar edildi.");
        }
        

    }
}