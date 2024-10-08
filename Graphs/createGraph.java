import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class createGraph{
    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w)
        {
            this.src =s;
            this.dest=d;
            this.wt = w;
        }
    }
    public static void main(String[] args) {
        

        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> [] graph = new ArrayList[V];
        for(int i =0;i<V;i++)
        {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5)); 
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        graph[4].add(new Edge(4, 2, 2));

        //neighbours of 2

        // bfs(graph);
        // dfs(graph);
        boolean [] vis = new boolean[V];
       
        // System.out.println(hasPath(graph, 0, 3, vis));
        System.out.println(detectCycle(graph));

    }

    public static void bfs(ArrayList<Edge>[] graph)
    {
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                bfsUtil(graph,vis);
            }
        }

        
    }

    public static void bfsUtil(ArrayList<Edge>[] graph,boolean [] vis)
    {
        if (graph == null || graph.length == 0) {
            System.out.println("Invalid input graph");
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr])
            {
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    q.add(graph[curr].get(i).dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph)
    {
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                dfsUtil(graph,vis,i);
            }
        }

        
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr) {
        if (graph == null || graph.length == 0 || curr < 0 || curr >= graph.length) {
            System.out.println("Invalid input graph or vertex");
            return;
        }
        
        vis[curr] = true;
        System.out.print(curr + " ");
        
        for (Edge e : graph[curr]) {
            int neighbour = e.dest;
            if (!vis[neighbour]) {
                dfsUtil(graph, vis, neighbour);
            }
        }
    }


    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean[] vis)
    {
        if(src == dest)
        {
            return true;
        }
        vis[src] = true;
        for(int i=0;i<graph[src].size();i++)
        {
            Edge e= graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph)
    {
        boolean [] vis = new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(detectCycleUtil(graph,vis,i,-1))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parr) {
        vis[curr] = true;
    
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            } else if (e.dest != parr) {
                return true;
            }
        }
    
        return false;
    }
    

    public static boolean isBipartite(ArrayList<Edge>[] graph)
    {
        int col[] = new int [graph.length];
        for(int i=0;i<graph.length;i++)
        {
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<graph.length;i++)
        {
            if(col[i] == -1)
            {
                q.add(i);
                col[i] = 0;
                while(!q.isEmpty())
                {
                    int curr = q.remove();
                    for(int j=0;j<graph[curr].size();j++)
                    {
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] == -1)
                        {
                            int nextcol = col[curr] == 0 ? 1: 0;
                            col[e.dest] = nextcol;
                            q.add(e.dest);
                        }
                        else if(col[e.dest] == col[curr])
                        {
                            return false;
                        }
                        
                    }
                }
            }
        }

        return true;
    }

    public static boolean isCycle(ArrayList<Edge>[] graph)
    {
        boolean [] vis = new boolean[graph.length];
        boolean [] stack = new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(isCycleUtil(graph,i,vis,stack))
            {
                return true;
            }
        }

        return false;
    }

    private static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr,boolean [] vis,boolean[] stack)
    {
        vis[curr] = true;
        stack[curr]= true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(stack[e.dest])
            {
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack))
            {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    //topological Sort

    public static void topSort(ArrayList<Edge>[] graph)
    {
        boolean [] vis = new boolean[graph.length];
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                topSortUtil(graph,i,vis,s);
            }
        }

        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }

    private static void topSortUtil(ArrayList<Edge>[] graph,int curr,boolean[]vis,Stack<Integer> stack)
    {
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
            {
                topSortUtil(graph, e.dest, vis, stack);
            }
            
        }
        stack.push(curr);
    }
    


}