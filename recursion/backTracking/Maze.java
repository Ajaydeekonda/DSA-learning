package backTracking;
import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
    //    System.out.println(count(4,4));
    //    ArrayList<String> paths = new ArrayList<>();
    //    pathPassingList(3,3,paths,"");
    //    System.out.println(paths.toString());
        // pathWithDiagonal("", 3, 3);
    // System.out.println(pathReturn("",3,3));

    boolean [][] maze ={
        {true,true,true},
        {true,false,true},
        {true,true,true}
    };
    pathWithRestrictions2("", maze, 0, 0);
    }

    static int count(int row,int col)
    {
        if(row == 1 || col == 1)
        {
            return 1;
        }

        int left = count(row-1,col);
        int right = count(row,col-1);

        return left+right;
    }

    static void pathPassingList(int row, int col, ArrayList<String> path, String temp) {
        if (row == 1 && col == 1) {
            path.add(temp);
            return; // Return immediately after adding the path to the list
        }
    
        if (row > 1) {
            String newPath = temp + "D"; // Create a new string for the down path
            pathPassingList(row - 1, col, path, newPath); // Pass the new path to the recursive call
        }
        if (col > 1) {
            String newPath = temp + "R"; // Create a new string for the right path
            pathPassingList(row, col - 1, path, newPath); // Pass the new path to the recursive call
        }
    }

    static ArrayList<String> pathReturn(String p,int r,int c)
    {
        if(r==1 && c ==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1)
        {
            list.addAll(pathReturn(p+'D',r-1,c));
        }
        if(c>1)
        {
            list.addAll(pathReturn(p+'R',r,c-1));
        }
        return list;
    }

    
    

    static void pathWithDiagonal(String p,int r,int c)
    {
        if(r==1 && c ==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            pathWithDiagonal(p+'D',r-1,c);
        }

        if(r>1 && c>1)
        {
            pathWithDiagonal(p+"X",r-1,c-1);
        }
        if(c>1)
        {
            pathWithDiagonal(p+'R',r,c-1);
        }
    }

    static void pathWithRestrictions(String p,int r,int c)
    {
        if(r== 2 && c == 2)
        {
            return;
        }
        if(r==1 && c ==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            pathWithRestrictions(p+'D',r-1,c);
        }

        if(r>1 && c>1)
        {
            pathWithRestrictions(p+"X",r-1,c-1);
        }
        if(c>1)
        {
            pathWithRestrictions(p+'R',r,c-1);
        }
    }

    static void pathWithRestrictions2(String p,boolean[][]maze,int r,int c)
    {
        if(!maze[r][c])
        {
            return;
        }
        if(r== maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(r<maze.length-1)
        {
            pathWithRestrictions2(p+'D',maze,r+1,c);
        }

        if(r<maze.length-1 && c<maze[0].length-1)
        {
            pathWithRestrictions2(p+"X",maze,r+1,c+1);
        }
        if(c<maze[0].length-1)
        {
            pathWithRestrictions2(p+'R',maze,r,c+1);
        }
    }


    
    
}
