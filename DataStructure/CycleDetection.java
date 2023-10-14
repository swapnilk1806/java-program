package collage.DataStructure;

import java.util.ArrayList;

public class CycleDetection {
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
        // Vertx 0
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,3));

        // Vertx 1
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        // vertx 2
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));

        // vertx 3
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,1));

        // vertx 4
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,2));
    }

    public static boolean detectCycle(ArrayList<Edge> [] graph){
        boolean [] vis = new boolean[graph.length];

        for (int i=0; i<graph.length; i++){
            if (!vis[i]){
                if (delectCyclebuild(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean delectCyclebuild(ArrayList<Edge> [] graph,boolean [] visit,int cuur,int par){
        visit[cuur] = true;

        for (int i=0; i<graph[cuur].size(); i++){
            Edge e = graph[cuur].get(i);
            if (!visit[e.dest]){
                if(delectCyclebuild(graph,visit,e.dest,cuur)){
                    return true;
                }
            }
            else if(!visit[e.dest] && e.dest != par){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> [] graph = new ArrayList[5];
        Create(graph);

        System.out.println(detectCycle(graph));
    }
}
