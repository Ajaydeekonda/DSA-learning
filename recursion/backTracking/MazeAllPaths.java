package backTracking;
import java.util.Arrays;

public class MazeAllPaths {

    public static void main(String[] args) {
        boolean [][] maze ={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        // AllPaths("", maze, 0, 0);
        // System.out.println(Arrays.deepToString(maze));
        int[][]matrix = new int[3][3];

        AllPathsWithMatrix("", matrix, maze, 0, 0,1);


        
    }
    

    static void AllPaths(String p,boolean[][]maze,int r,int c)
    {
        
        if(r== maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            maze[r][c]=true;
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1)
        {
            AllPaths(p+'D',maze,r+1,c);
        }

        // if(r<maze.length-1 && c<maze[0].length-1)
        // {
        //     AllPaths(p+"X",maze,r+1,c+1);
        // }
        if(c<maze[0].length-1)
        {
            AllPaths(p+'R',maze,r,c+1);

        }
        if(r>0)
        {
            AllPaths(p+'U', maze, r-1, c);

        }
        if(c>0)
        {
            AllPaths(p+'L', maze, r, c-1);

        }
        //this where the function will be over
        //so before the function  gets removed,also remove the changes that are mades;
        maze[r][c]=true;

    }

    static void AllPathsWithMatrix(String p,int[][]matrix,boolean[][]maze,int r,int c,int count)
    {
        if(r== maze.length-1 && c == maze[0].length-1)
        {
            matrix[r][c]=count;
           for(int[] arr:matrix)
           {
            System.err.println(Arrays.toString(arr));
           }
            System.out.println(p);
            System.out.println();
            maze[r][c]=true;
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c] = false;
        matrix[r][c]=count;
       
        
        if(r<maze.length-1)
        {
            AllPathsWithMatrix(p+'D',matrix,maze,r+1,c,count+1);
        }

        // if(r<maze.length-1 && c<maze[0].length-1)
        // {
        //     AllPathsWithMatrix(p+"X",maze,r+1,c+1);
        // }
        if(c<maze[0].length-1)
        {
            AllPathsWithMatrix(p+'R',matrix,maze,r,c+1,count+1);

        }
        if(r>0)
        {
            AllPathsWithMatrix(p+'U',matrix, maze, r-1, c,count+1);

        }
        if(c>0)
        {
            AllPathsWithMatrix(p+'L',matrix, maze, r, c-1,count+1);

        }
        //this where the function will be over
        //so before the function  gets removed,also remove the changes that are mades;
        maze[r][c]=true;
        matrix[r][c]=0;
        
    }
}
