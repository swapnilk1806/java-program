package collage.DataStructure;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
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

    public static void CreateAlgo(ArrayList<Edge> [] graph){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }

    public static void Algorith(ArrayList<Edge> [] graph,int scr){
        int dist [] = new int[graph.length];

        for (int i=0; i<dist.length; i++){
            if(i != scr){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean [] vis = new boolean[graph.length];
        PriorityQueue<Pair> p = new PriorityQueue<>();
        p.add(new Pair(scr,0));

        while (!p.isEmpty()){
            Pair curr = p.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;

                for (int i=0; i<graph[curr.n].size(); i++){
                    Edge  e = graph[curr.n].get(i);
                    int  u = e.scr;
                    int v = e.dest;
                    int wt = e.wight;

                    if(dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        p.add(new Pair(v,dist[v]));
                    }
                }
            }
        }

        for (int i=0; i<dist.length; i++){
            System.out.println("0 to dist "+i+": "+dist[i]);
        }
    }
    public static void main(String[] args) {

        ArrayList<Edge> [] graph = new ArrayList[6];
        CreateAlgo(graph);
        Algorith(graph,0);

    }
}
