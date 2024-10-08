package backTracking;
public class sudoko2own {
    public static void main(String[] args) {
        int [][]board = 
      { {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        if(sudoko(board))
        {
            display(board);
        }
        else{
            System.out.println("connot solve");
        }

    }


    static boolean sudoko(int [][]board)
    {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean empty = true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==0)
                {
                    row=i;
                    col=j;
                    empty = false;
                    break;
                }
            }
            if(!empty)
            {
                break;
            }
        }

        if(empty)
        {
            return true;
        }

        for(int i=1;i<10;i++)
        {
            
            if(isSafe(board, row, col, n))
            {
                board[row][col]=i;
                if(sudoko(board))
                {
                    return true;
                }
                else
                {
                    board[row][col] = 0;
                }
            }
        }

        return false;

    }

    static void display(int [][]board)
    {
        for(int [] row:board)
        {
            for(int x : row)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
    static boolean isSafe(int [][] board,int row,int col,int num)
    {
        for(int i =0;i<board.length;i++)
        {
            if(board[row][col]==num)
            {
                return false;
            }
        }

        for(int []nums:board)
        {
            if(nums[col] == num)
            {
                return false;
            }
        }


        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;

        for(int r = rowStart; r<rowStart + sqrt;r++)
        {
            for(int c = colStart;c <colStart +sqrt;c++)
            {
                if(board[r][c]==num)
                {
                    return false;
                }
            }
        }

        return true; 
    }

    
}
