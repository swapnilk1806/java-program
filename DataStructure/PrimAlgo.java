package collage.DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class PrimAlgo {
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
    
    public static void Create(ArrayList<Edge>[] graph){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));
        
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));
        
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3 ].add(new Edge(3,2,50));
    }

    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v,int cost){
            this.cost = cost;
            this.v = v;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }
     public static void PrimAlgorithm(ArrayList<Edge> [] graph){
        boolean [] vis = new boolean[graph.length];
        int finalcost=0;
         PriorityQueue<Pair> p = new PriorityQueue<>();
         p.add(new Pair(0,0));

         while (!p.isEmpty()){
             Pair curr = p.remove();
             if (!vis[curr.v]) {
                 vis[curr.v] = true;
                 finalcost += curr.cost;

                 for (int i=0; i<graph[curr.v].size(); i++){
                     Edge e = graph[curr.v].get(i);
                     p.add(new Pair(e.dest,e.weight));
                 }
             }
         }
         System.out.println("Final cost : "+finalcost);
     }
    public static void main(String[] args) {
        ArrayList<Edge> [] graph = new ArrayList[4];
        Create(graph);
        PrimAlgorithm(graph);
    }
}
