package backTracking;
import java.util.Arrays;

public class N_Knights {
    public static void main(String[] args) {
        int n =8;
        char[][] board= new char[n][n];
        System.out.println(Nknights(board, n));


    }

    static int Nknights(char [][]board,int row)
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
                board[row][col] = 'K';
                count+=Nknights(board, row+1);
                board[row][col]='X';
            }
            
        }
        return count;

    }

    static void display(char [][]board)
    {
        for(char[] row:board)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    static boolean isSafe(char [][]board,int row,int col)
    {
        if(isValid(board, row, col) && board[row-2][col+1]=='K')
        {
            return false;
        }
        if(isValid(board, row, col) && board[row-2][col-1]=='K')
        {
            return false;
        }
        if(isValid(board, row, col) && board[row-1][col+2]=='K')
        {
            return false;
        }
        if(isValid(board, row, col) && board[row-1][col-2]=='K')
        {
            return false;
        }
        if(isValid(board, row, col) && board[row+1][col+2]=='K')
        {
            return false;
        }
        if(isValid(board, row, col) && board[row+2][col-2]=='K')
        {
            return false;
        }
        if(isValid(board, row, col) && board[row+2][col+1]=='K')
        {
            return false;
        }
        if(isValid(board, row, col) && board[row+2][col-1]=='K')
        {
            return false;
        }
            
        
        return true;
    }

    static boolean isValid(char[][]board,int row,int col)
    {
        if(row>=0 && row<board.length && col>=0 && col<board[0].length)
        {
            return false;
        }
        return true;
    }

    

    
}
