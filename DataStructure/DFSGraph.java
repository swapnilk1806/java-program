package collage.DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
public class DFSGraph {
    static class Edge{
        int scr;
        int dest;
        Edge(int s,int d){
            this.scr = s;
            this.dest = d;
        }
    }
    public static void CreateGraph(ArrayList<Edge> [] graph){
        for (int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        // Vertex 0
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));


        //Vertx 1
        graph[1].add(new Edge(1,4));
        graph[1].add(new Edge(1,2));

        // vertx 2
        graph[2].add(new Edge(2,4));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));

        //Vertx 3
        graph[3].add(new Edge(3,4));

        //Vertx 4
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,3));
    }

    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] visit){
        System.out.println(curr + " ");
        visit[curr] = true;

        for (int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!visit[curr]){
                DFS(graph, e.dest, visit);
            }
        }
    }
    public static void DFSCheak(ArrayList<Edge> [] graph){
        boolean [] visit = new boolean[10];

        for (int i=0; i<graph.length; i++){
            if(!visit[i]){
                DFS(graph,i,visit);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
       ArrayList<Edge> [] graph = new ArrayList[5];
       CreateGraph(graph);
        System.out.println("DFS graph print");
        DFSCheak(graph);
    }
}
