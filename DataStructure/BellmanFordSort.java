package collage.DataStructure;

import java.util.ArrayList;

public class BellmanFordSort {
    static class Edge{
        int scr;
        int dest;
        int weight;
        public Edge(int s,int d,int w){
            this.scr = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void Craete(ArrayList<Edge> graph){
        graph.add(new Edge(0,1,2));
        graph.add(new Edge(0,2,4));
        graph.add(new Edge(1,2,-4));
        graph.add(new Edge(2,3,2));
        graph.add(new Edge(3,4,4));
        graph.add(new Edge(4,1,-1));

    }

    public static void Bellman(ArrayList<Edge> graph,int V){
        int dist[] = new int[V];
        for (int i=0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
        }

        for (int i=0; i< (V-1); i++){
            for (int j=0; j<graph.size(); j++){
                Edge e = graph.get(j);
                int u = e.scr;
                int v = e.dest;
                int w = e.weight;

                if((dist[u] != Integer.MAX_VALUE) && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                    System.out.println(dist[v]);
                }
            }
        }
        System.out.println("BellmanFord Algo ");
        for (int i=0; i<dist.length; i++){
            System.out.println("0 to "+(i)+" : "+dist[i]);
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();
        Craete(graph);
        Bellman(graph,5);
    }
}
