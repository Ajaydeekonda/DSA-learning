package backTracking;
import java.util.Arrays;

public class N_Queens {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        System.out.println(queens(board, 0));
    }

    static int queens(int [][]board,int row)
    {
        if(row == board.length)
        {
            display(board);
            return 1;
        }
        int count = 0;
        for(int col=0;col<board[0].length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = 1;
                count+=queens(board, row+1);
                board[row][col]=0;
            }
            
        }
        return count;
        
    }

    static void display(int [][]board)
    {
        for(int[] row:board)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    static boolean isSafe(int [][]board,int row,int col)
    {
        
            
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col] == 1)
            {
                return false;
            }
        }
        int j=0;
        for(;j<=Math.min(row,(board[0].length-1)-col);j++)
        {
            if(board[row-j][col+j] == 1)
            {
                return false;
            }

        }
        for(j=0;j<=Math.min(row,col);j++)
        {
            if(board[row-j][col-j] == 1)
            {
                return false;
            }

        }
        return true;
    }


}
