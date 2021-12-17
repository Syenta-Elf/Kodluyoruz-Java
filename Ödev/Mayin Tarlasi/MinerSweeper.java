import java.util.*;

public class MinerSweeper {
    public static Random rnd = new Random();
    public static Scanner sc = new Scanner(System.in);

    public  void run()
    {
        String[][] board ;
        int row,column;
        System.out.print("Satır girin:");
        row = sc.nextInt();
        System.out.print("Sütun girin:");
        column = sc.nextInt();

        board = createBoard(row,column);
        show(board, row, column);
    }

    public static String[][] createBoard(int row,int column)  
    {    
        
        String[][] board = new String[row][column];
        int bomb = row*column/4;

        while(bomb>0)
        {
            board[rnd.nextInt(row)][rnd.nextInt(column)] = "*";
            bomb--;
        }
        int count = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {   
                if(board[i][j]!= "*")
                {    
                    if(j+1<column)if(board[i][j+1]== "*")count++; //sağ
                    if(j-1>-1)if(board[i][j-1]== "*")count++;// sol
                    if(i+1<row)if(board[i+1][j]== "*")count++;//aşağısı
                    if(i-1>-1)if(board[i-1][j]== "*")count++;//yukarısı

                    if(i+1<row && j+1<column)if(board[i+1][j+1]== "*")count++;//sağ aşağı çapraz
                    if(j-1>-1 && i+1<row)if(board[i+1][j-1]== "*")count++; // sol aşağı çapraz
                    if(j+1<column && i-1>-1)if(board[i-1][j+1]== "*")count++;// sağ yukarı çapraz
                    if(j-1>-1 && i-1>-1)if(board[i-1][j-1]== "*")count++;//sol yukarı çapraz

                    board[i][j] = Integer.toString(count);
                }
                count=0;
                //System.out.print(" "+board[i][j]);               
            }
            //System.out.println();   
        }
        return board;
    } 
    

    public static void show(String[][] board,int row,int column)
    {
        String[][] nullBoard = new String[row][column];
        int bomb = 1;
        int count = row*column - bomb;
        for(int i=0;i<row;i++)
            for(int j=0;j<column;j++)
                nullBoard[i][j]="- ";

        for(int i=0;i<row;i++)
           { 
               for(int j=0;j<column;j++)
                System.out.print(nullBoard[i][j]);

                System.out.println();
            }  
        
        while(bomb>0 )
        {
            System.out.print("Satır girin:");
            int rowCheck = sc.nextInt();
            System.out.print("Sütun girin:");
            int columnCheck = sc.nextInt();

            if(rowCheck>=0 && rowCheck<row && columnCheck>=0 && columnCheck<column)
            {
                if(board[rowCheck][columnCheck]=="*")
                {
                    System.out.println("============================");
                    System.out.println("Kaybettiniz.");
                    break;
                }
                else
                {
                    nullBoard[rowCheck][columnCheck] = board[rowCheck][columnCheck];
                    for(int i=0;i<row;i++)
                    { 
                        for(int j=0;j<column;j++)
                        {
                             System.out.print(nullBoard[i][j]+" ");
                        }
                        System.out.println();
                    }
                    count--;
                    if(count == 0)
                    {
                        System.out.println("============================");
                        System.out.println("Tebrikler.");
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Yanlış değer girdiniz. Tekrar deneyiniz.");
            }

        }
        
    }

    
}
