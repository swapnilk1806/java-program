package collage.DataStructure;

import java.util.ArrayList;

public class BellmanFord {
    static class Edge{
        int scr;
        int dest;
        int wight;

        public Edge(int s,int d,int w){
            this.scr = s;
            this.dest = d;
            this.wight = w;
        }
    }

    public static void CreateGraph(ArrayList<Edge>  [] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }

    public static void BellFord(ArrayList<Edge> [] graph,int scr){
        int dist[] = new int[graph.length];

        for (int i=0; i<graph.length; i++){
            if(i != scr){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;

        for (int i=0; i< V-1; i++){

            for (int j=0; j<graph.length; j++){
                for (int k=0; k<graph[j].size(); k++){
                    Edge e = graph[j].get(k);

                    int u = e.scr;
                    int v = e.dest;
                    int w = e.wight;

                    if((dist[u] !=Integer.MAX_VALUE) && (dist[u] + w < dist[v]) ){
                        dist[v] = dist[u] + w;
                    }
                }
            }
        }
        System.out.println("Sorted distace : ");
        for (int  i=0; i<dist.length; i++){
            System.out.println("0 to "+(i)+": "+dist[i]);
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> [] graph = new ArrayList[5];

        CreateGraph(graph);
        BellFord(graph,0);
    }
}
