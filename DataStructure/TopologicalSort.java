package collage.DataStructure;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    static class Edge{
        int scr;
        int dest;
        public Edge(int s,int d){
            this.dest = d;
            this.scr = s;
        }
    }
    public static void Create(ArrayList<Edge> [] graph){

        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void tosort(ArrayList<Edge> [] graph){

        boolean vis [] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i=0; i< graph.length; i++){
            if(!vis[i]){
                toSortUtil(graph,i,vis,s);/// modified DFS
            }
        }
        while (!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }

    public static void toSortUtil(ArrayList<Edge> [] graph,int curr,boolean [] vis ,Stack<Integer> s){
        vis[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                toSortUtil(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> [] graph = new ArrayList[6];

        Create(graph);

        tosort(graph);
    }
}
