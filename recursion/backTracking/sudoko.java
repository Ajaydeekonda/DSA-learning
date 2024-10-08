package backTracking;
import java.util.ArrayList;
import java.util.Arrays;
public class sudoko {
    public static void main(String[] args) {
        char[][]board ={
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {}
        };
        public ArrayList<Character> list = new ArrayList<>();
        for(int i=49;i<58;i++)
        {
            list.add((char)i);
        }
        System.out.println(list);
        
    }

    static void Sudoko(char [][]board,ArrayList<Character> list)
    {

    }

    static boolean isSafe(char[][]board,int row,int col,ArrayList<Character> list)
    {
        ArrayList<Character> nums = new ArrayList<>(list);
        int i=0;
        for(;i<board.length;i++)
        {
            if(nums.contains(board[i][col]))
            {
                nums.remove(board[i][col]);
            }
        }
        for(i=0;i<board[0].length;i++)
        {
            if(nums.contains(board[row][i]))
            {
                nums.remove(board[row][i]);
            }
        }
        int r = row - row%3;
        int c = col - col%3;
        for(i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(nums.contains(board[i][j]))
                {
                    nums.remove(board[i][j]);
                }
            }
        }
    }




}


