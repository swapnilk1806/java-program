package collage.DataStructure;

import java.util.ArrayList;

public class CycleDetectionDirected {
    static class Edge{
        int scr;
        int dest;
        public Edge(int s,int d){
            this.dest = d;
            this.scr = s;
        }
    }

    public static void CreateGraph(ArrayList<Edge> [] graph){

        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,3));
    }

    public static boolean CycleDetection(ArrayList<Edge> [] graph,int curr,boolean vis[],boolean []stack){
        vis[curr] = true;
        stack[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(stack[e.dest]){
                return true;
            }

            if (!vis[e.dest] && CycleDetection(graph,e.dest,vis,stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static boolean isCycle(ArrayList<Edge> [] graph){
        boolean [] vis = new boolean[graph.length];
        boolean [] stack = new boolean[graph.length];

        for (int i=0; i<graph.length; i++ ){
            if(!vis[i]){
                if(CycleDetection(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
         int V = 4;
        ArrayList<Edge> [] graph = new ArrayList[V];

        CreateGraph(graph);

        System.out.println(isCycle(graph));

    }
}
