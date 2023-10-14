package collage.DataStructure;

import java.util.ArrayList;

public class GraphHasPath {
    static class Edge{
        int s;
        int d;
        public Edge(int s,int d){
            this.s = s;
            this.d = d;
        }
    }
    public static void Create(ArrayList<Edge> [] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        // Vertx 0
        graph[0].add(new Edge(0,4));

        //Vertx 1
        graph[1].add(new Edge(1,3));

        //Vertx 2
        graph[2].add(new Edge(2,1));

        // vertx 3
        graph[3].add(new Edge(3,2));

        /// vertx 4
        graph[4].add(new Edge(4,1));
    }
    public static boolean HasPath(ArrayList<Edge> [] graph,int src,int dest, boolean[] visit){
        if (src == dest) {
            return true;
        }
        visit[src] = true;
        for (int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if (!visit[e.d] && HasPath(graph,e.d,i,visit)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> [] graph = new ArrayList[5];
        Create(graph);
        System.out.println(        HasPath(graph,0,4,new boolean[5]));
    }
}
