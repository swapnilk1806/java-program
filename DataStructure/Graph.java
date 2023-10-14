package collage.DataStructure;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    static class Edge{
        int scr;
        int dest;
        int wight;
        Edge(int s,int d,int w){
            this.scr = s;
            this.dest = d;
            this.wight = w;
        }
    }
    public static void main(String[] args) {
        LinkedList<Edge> [] graph = new LinkedList[5];
        for (int i=0; i<graph.length; i++){
            graph[i] = new LinkedList<>();
        }
        // Vertex 0
        graph[0].add(new Edge(0,1,6));
        graph[0].add(new Edge(0,4,8));


        //Vertx 1
        graph[1].add(new Edge(1,4,5));
        graph[1].add(new Edge(1,3,6));

        // vertx 2
        graph[2].add(new Edge(2,4,5));
        graph[2].add(new Edge(2,3,1));
        graph[0].add(new Edge(2,4,6));

        //Vertx 3
        graph[3].add(new Edge(3,4,6));

        //Vertx 4
        graph[4].add(new Edge(4,1,4));
        graph[4].add(new Edge(4,3,3));


        System.out.println(graph[0].get(1).scr+ " " +graph[0].get(1).dest + " "+graph[0].get(1).wight);
    }
}
