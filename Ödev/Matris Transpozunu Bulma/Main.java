
public class Main {

    public static void main(String[] args) {
        int[][] matris = {
            {2,3,4},
            {5,6,4}
        };
        int[][] transpoze = new int[3][2];
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matris[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
               transpoze[j][i] = matris[i][j];
               
            }
        }
        System.out.println("==================");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(transpoze[i][j]+"\t");
            }
            System.out.println();
        }
    }
}